<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student Registration Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        <p>
            <label>First Name:</label>
            <form:input path="firstName" />
        </p>
        <p>
            <label>Last Name:</label>
            <form:input path="lastName" />
        </p>
        <p>
            <label>Country</label>
            <form:select path="country">
                <form:option value="Brazil" label="Brazil"/>
                <form:option value="France" label="France"/>
                <form:option value="Germany" label="Germany"/>
                <form:option value="Spain" label="Spain"/>
            </form:select>
        </p>
        <input type="submit" value="Submit">

    </form:form>


</body>
</html>