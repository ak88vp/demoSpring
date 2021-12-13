<%--
  Created by IntelliJ IDEA.
  User: Tien Dung
  Date: 12/13/2021
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <form  method="post">
        <input type="text" name="numberA" value="${numberA}">
        <input type="text" name="numberB" value="${numberB}">
        <button name="result" value="Cong">Cộng</button><button name="result" value="tru">Trừ</button><button name="result" value="nhan">Nhân</button><button name="result" value="chia">Chia</button>
    </form>
 kết quả : ${result}
</center>
</body>
</html>
