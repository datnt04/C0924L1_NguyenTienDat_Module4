<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Selected Condiments</title></head>
<body>
<h2>You selected:</h2>
<ul>
  <c:forEach var="item" items="${selectedCondiments}">
    <li>${item}</li>
  </c:forEach>
</ul>
<a href="/">Back</a>
</body>
</html>
