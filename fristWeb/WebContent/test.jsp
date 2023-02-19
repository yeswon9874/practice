<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    // 순수하게 자바코드를 이해하는 부분 
    // java 8버전 -> 날짜 형식
    LocalDate now = LocalDate.now(); //2023-02-18
    System.out.println("now=" + now);
    String today = now.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일"));
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1> 안녕 </h1>
  <h1> <%= 10 + 3%></h1>
  <h1> 오늘은 <%=today %>이야 </h1>
</body>
</html>