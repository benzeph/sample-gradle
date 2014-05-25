<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form:form commandName="register" method="post" action="register">
    <div>
        <form:label path="username">username:</form:label>
        <form:input path="username"/>
    </div>
    <div>
        <form:label path="password">password:</form:label>
        <form:input path="password"/>
    </div>
    <input type="submit" value="submit" id="submit">
</form:form>
</body>
</html>