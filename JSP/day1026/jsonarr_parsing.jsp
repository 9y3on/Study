<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page info=""%>
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
	$("#btn").click(function() {
		$.ajax({
			url : "jsonarr_data.jsp",
			type : "get",
			dataType : "json",
			error : function(xhr){
				console.log(xhr.status);
			},
			success : function(jsonArr){
				var divNode = "";
				$.each(jsonArr, function(i, jsonObj){
					divNode += "<div>";
					divNode += "<strong>이름</strong><input type='text' name='name' value='"+
								jsonObj.name + "'/>";
					divNode += "<strong>나이</strong><input type='text' name='name' value='"+
								jsonObj.age + "'/><br>";
					divNode += "<strong>주소</strong><input type='text' name='name' value='"+
								jsonObj.addr + "'/>";
					divNode += "</div>";
				});//each
				$("#output").html(divNode);
			}
		});
	});//click
	
});//ready
</script>

</head>
<body>

<input type="button" value="클릭" id="btn" class="btn btn-info"/>
<div id="output"></div>

</body>
</html>