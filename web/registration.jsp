<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration Form</h1>
        <s:form action="register">
            <s:textfield name="name" label="Name"></s:textfield>
            <s:textfield name="username" label="Username"></s:textfield>
            <s:password name="password" label="Password"></s:password>
            <s:submit value="Register"></s:submit>
        </s:form>
    </body>
</html>
