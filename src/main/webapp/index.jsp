<%--
  Created by IntelliJ IDEA.
  User: 电脑
  Date: 2020/2/6
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/save_ihui.do"  method="get">
    <table align="center" border="1" width="400" height="200">
        <tr align="center" bgcolor="#FFFFCC">
            <td  colspan="2">欢迎进入会员登录系统</td>

        </tr>
        <tr>
            <td>账号</td>
            <td>
                <input type="text" name="uname" id="uname">
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="text" name="passwd" id="passwd">
            </td>
        </tr>
        <tr align="center" bgcolor="#FFFFCC">
            <td colspan="2">

                <input type="submit" value="注册">
                &nbsp&nbsp&nbsp&nbsp&nbsp<a href="huiadd.jsp" >没用的按键</a>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
