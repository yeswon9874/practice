<%@page import="kr.test.util.MyHap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 /*
   int sum  =0;
   for(int i =1; i <= 10; i++){
	   sum += i;
   }
   */

   MyHap hap = new MyHap();
   
   int sum = hap.getSum();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>


     <table border="1">
     	<tr>
     	   <td>1~10까지 총합 </td> <td><%=sum %></td>
     	</tr>
     </table>

</body>
</html>