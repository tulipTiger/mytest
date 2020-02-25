<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 2019/11/22
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>login page</title>
  </head>

  <body>
      <form action="/login" method="post">
        <div>
          <label for="username"></label>
          <input id="username" type="text" name="username" placeholder="用户名"/>
        </div>
        <div>
          <label for="password"></label>
          <input id="password" type="password" name="password" placeholder="密码"/>
        </div>
        <div>
          <label for="checkCode"></label>
          <input id="checkCode" type="text" name="checkCode" placeholder="验证码"/>
          <img src="/check_code"/>
        </div>
        <div>
          <input type="submit" value=" 登录 !"/>
        </div>
      </form>
  </body>

</html>
