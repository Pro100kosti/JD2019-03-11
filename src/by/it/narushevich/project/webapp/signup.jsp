<%@ page contentType="text/html;
    charset=UTF-8"
    language="java"
    pageEncoding="UTF-8" %>
<html>
<%@ include file="include/head.htm" %>
<body>
<div class="container">
<%@ include file="include/menu.htm" %>

<form class="form-horizontal" action="do?command=SignUp" method="post">
<fieldset>

<!-- Form Name -->
<legend>Регистрация нового пользователя</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="login">Логин</label>
  <div class="col-md-4">
  <input id="login" name="login" value="testUser" type="text" placeholder="" class="form-control input-md" required="">
  <span class="help-block">русские и английские буквы, цифры, . и _, длина 8 до 15</span>
  </div>
</div>

<!-- Password input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="password">Пароль</label>
  <div class="col-md-4">
    <input id="password" name="password" value="testPassword" type="password" placeholder="" class="form-control input-md" required="">
      <span class="help-block">минимальная длина 8 символов</span>
      </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="email">Электронная почта</label>
  <div class="col-md-4">
    <input id="email" name="email" value="user@tut.by" type="text" placeholder="" class="form-control input-md" required="">
        <span class="help-block">Ваш e-mail</span>
      </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label" for="sign-up"></label>
  <div class="col-md-4">
    <button id="sign-up" name="sign-up" class="btn btn-primary">Зарегистрировать</button>
  </div>
</div>

</fieldset>
</form>


</div>
</body>
</html>




