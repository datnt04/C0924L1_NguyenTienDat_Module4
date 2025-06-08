<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
  <title>Email Settings</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 20px;
    }
    div {
      margin-bottom: 15px;
    }
    label {
      display: inline-block;
      width: 100px;
    }
    select, textarea {
      padding: 5px;
      width: 200px;
    }
    button {
      padding: 5px 10px;
      margin-right: 10px;
    }
  </style>
</head>
<body>
<h1>Settings</h1>
<%--@elvariable id="settings" type=""--%>
<form:form action="/settings" method="post" modelAttribute="settings">
  <div>
    <label>Languages</label>
    <form:select path="language">
      <form:option value="English">English</form:option>
      <form:option value="Vietnamese">Vietnamese</form:option>
      <form:option value="Japanese">Japanese</form:option>
      <form:option value="Chinese">Chinese</form:option>
    </form:select>
  </div>
  <div>
    <label>Page Size:</label>
    <form:select path="pageSize">
      <form:option value="5">5</form:option>
      <form:option value="10">10</form:option>
      <form:option value="25">25</form:option>
      <form:option value="50">50</form:option>
    </form:select> emails per page
  </div>
  <div>
    <label>Spams filter:</label>
    <form:checkbox path="spamFilterEnabled" /> Enable spams filter
  </div>
  <div>
    <label>Signature:</label>
    <form:textarea path="signature" rows="3" cols="20" />
  </div>
  <div>
    <button type="submit">Update</button>
    <button type="button">Cancel</button>
  </div>
</form:form>
<p>Bạn có thể tải webapp của chúng tôi lên để sử dụng dịch vụ này. Cấu hình sẽ được lưu tự động.</p>
<p>Các ngôn ngữ hỗ trợ: English, Vietnamese, Japanese, Chinese</p>
<p>Page Size: 5, 10, 25, 50 email per page</p>
</body>
</html>