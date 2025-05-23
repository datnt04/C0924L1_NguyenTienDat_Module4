<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết quả tra cứu</title>
</head>
<body>
<h2>Kết quả:</h2>
<c:if test="${not empty result}">
    <p>Từ: ${word}</p>
    <p>Nghĩa: ${result}</p>
</c:if>
<c:if test="${not empty message}">
    <p>${message}</p>
</c:if>
<br>
<a href="/">Tra từ khác</a>
</body>
</html>
