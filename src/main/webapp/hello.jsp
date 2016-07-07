<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<html>

<body>
<table width="100%" border="1" align="center">
    <style>
        .colortext {
            background-color: #ffe; /* Цвет фона */
            color: #930; /* Цвет текста */
        }
    </style>
    <tr bgcolor="black">
        <th style="color: aqua">My task</th>

    </tr>

</table>


<h1>My task</h1>

<h3>My My TODO list</h3>
<table width="50%" border="3" align="center">
    <tr bgcolor="aqua">
        <th>!!!!!!!!!!!!</th>
        <th>33333333333333</th>
    </tr>
    <c:set var="alphabet">A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z</c:set>
    <c:set var="user" value="${param.name}" scope="session"/>

    <c:forEach items="${alphabet}" var="letter">
        <tr>
            <td>
                    <c:out value="${letter}"/>
            <td>
        </tr>

    </c:forEach>

<td><input type="text" value="<%= session.getAttribute("username") %>" /></td>


<c:set var="ObjectPojo" value="${param.name}" scope="session"/>
<c:set var="ObjectPojo">A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z</c:set>
    <table>
        <tr>
            <c:forEach var="ObjectPojo" items="${sessionScope.sessionManager.myAccessPage}">
                <td><c:out value="${ObjectPojo.object_name}"/></td>
                <td>
                    <input type="text" value="<c:out value="${ObjectPojo.object_name}" />">
                </td>
            </c:forEach>
        </tr>
    </table>


    <%--	<tr>
            <td><c:out value="${param.get(key)}"></c:out></td>
        </tr>
    </c:forEach>--%>

</table>

</body>
</html>