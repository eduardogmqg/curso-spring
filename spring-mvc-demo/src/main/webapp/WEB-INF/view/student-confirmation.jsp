<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student Confirmation</title>
</head>

<body>
<p>
    The student is confirmed: ${student.firstName} ${student.lastName}
</p>
<p>
    Country: ${student.country}, Favourite Language: ${student.favouriteLanguage}
</p>

<p>
    Operating System:
    <ul>
        <c:forEach var="os" items="${student.operatingSystems}">
        <li>
            ${os}
        </li>
        </c:forEach>
    </ul>
</p>

</body>
</html>