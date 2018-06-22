<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">
</head>
<body>
    <h2>Spring MVC Demo - Home Page</h2>
    <hr>
    <p>${pageContext.request.contextPath}</p>
    <a href="/showForm">Hello world form</a>
    <br>
    <a href="student/showForm">Student form</a>
</body>
</html>