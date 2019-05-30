<%@ page pageEncoding="UTF-8" %>
<html>
<header>
    <meta charset="utf-8">
    <title>登录</title>
</header>
<body>
<strong>${message}</strong>
<form action="/login.do" method="post">
    <p>
        <label>Account:<input name="account"></label>
    </p>
    <p>
        <label>Password:<input name="password"></label>
    </p>
    <p>
        <button type="submit">login</button>
    </p>
</form>
</body>
</html>
