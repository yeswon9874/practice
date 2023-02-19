<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    	/*
    	  url 클라이언트가 요청 : ==> form-> sumit 버튼 클라이언트가 getAddResult 전송해줘 
    	  서블릿(톰켓) -> init() : 내장객체 사용할수있다 . reqeuest, response, out , session... 
    	  
    	  
    	  데이터를 보내는 방식 
    	  get - 데이터를 요청했을때 header 그 정보를 저장 // url 안에 쿼리스트링 값으로 값 전달을 해줌 
    	  // url -> 값전달 : url 자체는 문자열 -> String 으로 값을 받아온다 
    	  post - 데이터를 요청했을때 body 그 정보를 저장 -> 사용자 눈에는 보이지 않음 
    	
    	*/
    	
    	  int num1 = Integer.parseInt(request.getParameter("su1"));
    	  int num2 = Integer.parseInt(request.getParameter("su2"));
    	  
    	//  out.println("num1=" + num1);
    	//  out.println("num2=" + num2);
    	  
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> <%=num1 %> + <%=num2 %> = <%=num1+num2 %>  </h1>

</body>
</html>