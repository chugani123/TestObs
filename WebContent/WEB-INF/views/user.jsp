<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
</head>
<body>
<h3>Hi ${userName}</h3>
  <table border="5" bordercolor="green"  style="width:100%; table-layout: fixed;">

    <tr>
      <th>dept</th>
      <th>studentId</th>
      <th>marks</th>
      <th>percent</th>
    </tr>
        <tbody>
                <c:forEach var="aValue" items="${listMark}">
                    <tr>
                        <td><c:out value="${aValue.dept}" /></td>

                        <td>
                            <table>
                                <c:forEach var="bValue" items="${aValue.students}">
                                    <tr>
                                         <td>
                                            <c:out value="${bValue.studentId}" />
                                          </td>
                                    <tr>
                                 </c:forEach>
                            </table>
                        </td>

                        <td>
                           <table>
                               <c:forEach var="bValue" items="${aValue.students}">
                               <tr>
                                    <td>
                                      <c:out value="${bValue.marks}" />
                                     </td>
                                <tr>
                                </c:forEach>
                           </table>
                         </td>

                            <td>
                                                                    <table>

                                                                        <tr>
                                                                             <td>
                                                                               <c:out value="${aValue.percent}" />
                                                                              </td>
                                                                         <tr>

                                                                    </table>
                                                                  </td>
                    </tr>
                </c:forEach>










           </tbody>
   </table>

</body>
</html>