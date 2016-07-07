<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<body>
<form action="answer" method="GET">
    <table width="100%" border="1" align="center">
        <tr bgcolor="black">
            <th style="color: aqua">My task</th>
        </tr>
        <tr bgcolor="black">
            <th style="color: #ffffee">My TODO list</th>
        </tr>
    </table>
    <table width="50%" border="3" align="center">
        <tr bgcolor="aqua">
            <th>Task</th>
            <th>Category</th>
            <th>Complete</th>
        </tr>
        <c:forEach items="${sessionScope.Map}" var="letter">
            <tr>
                <td><c:out value="${letter.key}"/></td>
                <td><c:out value="${letter.value}"/></td>
                <td><input type="checkbox" name="id" value="${letter.key}"></td>
            </tr>
        </c:forEach>
    </table>
    <input type="submit" value="Update Task"/>

    <p>
        Task <input type="text" name="Task"/> <br/>
        Category <input type="text" name="Category"/> <br/>
    </p>
    <input type="submit" value="Add Task"/>


</form>
</body>
</html>