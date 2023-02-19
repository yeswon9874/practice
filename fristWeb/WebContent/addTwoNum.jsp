<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
// 1. 서블릿으로 보내주기 
// 2. 다른 jsp 파일로 바로 보내줄수도 있다

// input 안에 있는 정보를 다른 페이지나 서블릿에게 전달하려면 -> form이 필요하다 
// form 필수적으로 어디로 데이터를 이동할건지 , 어떤 방식으로 데이터를 전송할건지 설정 
// sumbit 버튼을 누르면 그 정보들이 request 객체 안에  파라미터 곳에서 name=> 변수이름 , value="사용자가 입력한 값 "

%>
  <form action="sum.do" method="get">
   <table border="1" >
   	<tr>
   		<td> 첫번째 숫자 </td>
   		
   		<td> <input type="text" name="su1" /> </td>	
   	</tr>
   	<tr>
   	  	<td> 두번째 숫자 </td>
   		<td> <input type="text" name="su2" /> </td>	
   	</tr>
   	<tr> <td colspan="2"> <button type="submit"> 전송 </button></td></tr>
   </table>
</form>
</body>
</html>