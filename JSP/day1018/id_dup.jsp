<%@page import="java.sql.SQLException"%>
<%@page import="kr.co.sist.member.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page info="아이디 중복 확인" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> </title>
<link rel="stylesheet" type="text/css" 
href="http://localhost/html_prj/common/css/main_v20230906.css"/>
<!-- jQuery CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<style type="text/css">
#wrap {
    width: 502px;
    height: 303px;
    margin: 0px auto;
}

#idDup {
    width: 502px;
    height: 303px;
    background: #FFFFFF url(images/id_background.png) no-repeat;
    position: relative;
}

#idDiv {
    position: absolute;
    top: 100px;
    left: 80px;
    width: 300px;
}

#idResult {
    position: absolute;
    top: 200px;
    left: 80px;
}

</style>
<script type="text/javascript">
function useId(id) {
    //부모창에 전달한 후(opener)
    opener.window.document.frm.id.value = id;
    //중복확인 버튼이 눌렸다면 flag value를 1로
    opener.window.document.frm.idDupFlag.value = 1;
    //자식창 닫기
    self.close();
}

$(function() {
	$("#btn").click(function() {
		chkNull();
	});//click
	
	$("#id").keydown(function(evt) {
		/* enter가 눌렸는지 확인 */
		if(evt.which == 13){
			chkNull();
		}//end if
	});//keydown
});

function chkNull() {
	var id = $("#id").val();
	
	if(id.trim() == ""){
		alert("중복 확인 할 아이디를 입력해주세요.");
		return;
	}//end if
	
	$("#frm").submit();
}
</script>
</head>
<body>
<div id="wrap">
    <div id="idDup">
        <div id="idDiv">
            <form name="subFrm" id="frm" action="id_dup.jsp">
                <label>아이디</label>
                <input type="text" name="id" id="id" class="inputBox" style="width: 160px" 
                maxlength="16" autofocus="autofocus" value="${param.id}"/>
                <input type="button" id="btn" value="중복확인" class="btn"/>
                <!-- 입력하는 폼 컨트롤이 하나일 경우 이벤트 처리를 하지않더라도 서버에 요청을 하기 때문에
                	 보이지 않는 폼 컨트롤을 하나 더 생성 -->
                <input type="text" style="display:none"/>
            </form>
        </div>
        
        <div id="idResult">
        <c:catch var="se">
        <% String id = request.getParameter("id"); 
           if(id != null && !"".equals(id)){
              //DB에서 입력된 아이디를 검색
              MemberDAO mDAO = MemberDAO.getInstance();
            	 
              try{
              boolean flag = mDAO.selectId(id);
              pageContext.setAttribute("flag", flag);
        %>
        <strong><c:out value="${ param.id }"/></strong>는
        <c:choose>
        	<c:when test="${ flag }">
        		<span style="color:#DC5460">이미 사용 중입니다.</span>
        	</c:when>
        	<c:otherwise>
        		<span style="color:#233942">사용 가능 합니다.</span>
        		<a href="javascript:useId('${ param.id }')">
        			<input type="button" class="btn btn-success" value="사용"/>
        		</a>
        	</c:otherwise>
        </c:choose>
        
        <%
           	}catch(SQLException se) {
           		se.printStackTrace();
           	}
         }//end if
         %>
        </c:catch>
        
        <c:if test="${ not empty se }">
        	문제가 발생하였습니다.
        	잠시 후 다시 시도해주세요.
        </c:if>
        
        </div>
        
    </div>
</div>
</body>
</html>