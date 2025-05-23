<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<div class="container">
    <h2>Chuyển đổi USD sang VNĐ</h2>
    <form action="convert" method="post">
        <div class="form-group">
            <label for="rate">Tỉ giá (VND/USD):</label>
            <input type="number" id="rate" name="rate" step="0.01" required placeholder="VD: 25000">
        </div>
        <div class="form-group">
            <label for="usd">Số tiền USD:</label>
            <input type="number" id="usd" name="usd" step="0.01" required placeholder="VD: 100">
        </div>
        <button type="submit">Chuyển đổi</button>
    </form>
</div>
</body>
</html>
