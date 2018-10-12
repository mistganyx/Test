<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
  </head>
  <body>
        <table border="1" align="center">
            <th>id</th>
        	<th>name</th>
        	<th>age</th>
        	<th>address</th>
        	<th>class</th>
        	<th>操作</th>
          <c:forEach var="st" items="${students }">
         	<tr>
         		<td>${st.id }</td>
         		<td>${st.name }</td>
         		<td>${st.age }</td>
         	   <td>${st.address.address }</td>
         	   <td>${st.grade.grade }</td>
         	   <td><button href="delete">修改</button>
         	    <a href="${pageContext.request.contextPath} /delete?id=${st.id}">删除</a>
         	   </td>
         	</tr>
         	
         </c:forEach>
         </table>
  </body>
</html>
