<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h2>Caculator</h2>
<form action="calculate" method="post">
    <input type="number" name="num1" required />
    <input type="number" name="num2" required /><br><br>

    <button type="submit" name="operator" value="add">Addition(+)</button>
    <button type="submit" name="operator" value="sub">Subtraction(-)</button>
    <button type="submit" name="operator" value="mul">Multiplication(X)</button>
    <button type="submit" name="operator" value="div">Division(/)</button>
</form>

<c:if test="${not empty result}">
    <h3>Result ${operation} : ${result}</h3>
</c:if>

<c:if test="${not empty message}">
    <h3 style="color:red;">${message}</h3>
</c:if>
</body>
</html>
