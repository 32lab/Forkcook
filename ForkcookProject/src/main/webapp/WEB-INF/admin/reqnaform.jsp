<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
문의 답변<br>

<br>
<br>
<form action="write.do" method="post">
	

				<button type="submit">작성하기</button>
            <button type="button" onclick="location.href='list.do'">취소하기</button>
		
</form>
</body>
</html>
