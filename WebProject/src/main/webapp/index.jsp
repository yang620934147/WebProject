<%@ page language="java" pageEncoding="UTF-8"%>
<%--引入JSTL核心标签库 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>显示学生信息</title>
        <style type="text/css">
            table,td{
                border: 1px solid;
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <table>
            <tr>
                <td>学生ID</td>
                <td>学生名</td>
                <td>创建时间</td>
                <td>更新时间</td>
            </tr>

            <c:forEach var="student" items="${lstStudents}">
                <tr>
                    <td>${student.studentId}</td>
                    <td>${student.studentName}</td>
                    <td>${student.createAt}</td>
                    <td>${student.updateAt}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>