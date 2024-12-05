<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page info=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="http://localhost/mvc_prj/common/main/favicon.png"/>
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

<div>
외부 JSP
</div>

<div>
webapp의 하위에 존재하는 JSP(Data를 가지고 있지 않은 jsp)<br>
<jsp:include page="/day1128_webapp/include_out.jsp"/>
<hr>
<c:import url="/day1128_webapp/include_out.jsp"/>
</div>
<br>
--------------------------------------------------------------
<div>
WEB-INF의 하위에 존재하는 JSP(Data를 가지고 있는 jsp)<br>
<jsp:include page="/WEB-INF/views/day1128/data_view.jsp"/>
<hr>
<c:import url="/WEB-INF/views/day1128/data_view.jsp"/>
</div>
--------------------------------------------------------------
<div>
<strong>DO include</strong>
<jsp:include page="/day1128/use_send_value2.do"/>
</div>

<div>
<!-- 액션 태그는 java code가 병합되는 것이 아니므로 변수와 method가 공유되지 않는다. -->
<%-- 외부 JSP <%= msg %> --%>
</div>

</body>
</html>