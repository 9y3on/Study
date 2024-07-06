<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page info="usebean을 사용하여 web parameter 받기"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://localhost/html_prj/common/main/favicon.png"/>
<!-- Bootstrap CDN -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!-- jQeury CDN -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

<style type="text/css">


</style>

<script type="text/javascript">
$(function() {
	
	
});//ready
</script>

</head>
<body>
<%//POST방식의 한글처리
	request.setCharacterEncoding("UTF-8");
%>

<!-- request.getParameter를 사용하지 않아도 값을 받을 수 있음 -->
<jsp:useBean id="pVO" class="day1013.ParameterVO" scope="page"/>

<!-- web parameter 받기 -->
<jsp:setProperty name="pVO" property="*"/> 

<!-- web parameter 출력 -->	
<ul>
	<li>아이디 : <jsp:getProperty name="pVO" property="id"/> ( ${ param.id } )</li> <!-- name속성의 값 -->
	<li>비밀번호 : <jsp:getProperty name="pVO" property="password"/> ( ${ param.password } )</li>
	<li>이름 : <jsp:getProperty name="pVO" property="name"/> ( ${ param.name } )</li>
	<li>생년월일 : <jsp:getProperty name="pVO" property="birthday"/> ( ${ param.birthday } )</li>
	<li>전화번호 : <jsp:getProperty name="pVO" property="tel"/> ( ${ param.tel } )</li>
	<li>일반번호 : <jsp:getProperty name="pVO" property="cell"/> ( ${ param.cell } )</li>
	<li>이메일 : <jsp:getProperty name="pVO" property="email1"/>@<jsp:getProperty name="pVO" property="email2"/>
	  ( ${ param.email1 }@${ param.email2 } )
	</li>
	<li>성별 : <jsp:getProperty name="pVO" property="gender"/> ( ${ param.gender })</li>
	<li>소재지 : <jsp:getProperty name="pVO" property="area"/> ( ${ empty param.area ? "선택한 도시 없음" : param.area })</li>
	<li>주소 : <jsp:getProperty name="pVO" property="zipcode"/> ( ${ param.zipcode })</li>
	<li>우편 번호 : <jsp:getProperty name="pVO" property="addr0"/> <jsp:getProperty name="pVO" property="addr1"/>
		( ${ param.addr0 } ${ param.addr1 } )
	</li>
	<li>관심 언어 : 
	<!-- 배열은 주소가 출력되므로 이전의 코드를 사용하여 사용자에게 보여준다. -->
	
	<%-- <%
	// checkbox를 check하지 않으면 web parameter가 생성되지 않으므로 받을 수 있는 값이 없음
	// -> NullPointerException이 발생한다.
	// if 또는 try~catch로 처리한다.
	// if~else로 처리하는 것이 더 좋다. -> 객체가 덜 만들어짐
	
	/* try~catch 사용 */
	try{
		for(String lang : pVO.getLang()) {%>
			<%= lang %>
	<%	} 
	}catch(NullPointerException npe){
		out.print("관심언어 없음");
	} 
	
	/* IF사용 */--%>
	
	<% 
	if(pVO.getLang()!=null){
		int i = 0;
		for(String lang : pVO.getLang()) {%>
			<%= lang %> ( ${ paramValues.lang[i] } ) <!-- EL에서는 선언된 변수를 사용할 수 없다. -->
			
	<%	i++; } 
	}else{
		out.print("관심언어 없음");
	}
	
	%>	
	</li>
</ul>

</body>
</html>