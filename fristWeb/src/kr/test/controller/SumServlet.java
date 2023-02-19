package kr.test.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 일반적인 서블렛 클래스가 필요한 것들 


public class SumServlet extends HttpServlet{
	
	// 클라이언트에서 요청이 받으면 서비스 메서드가 실행 ==> main()

	// doGet , doPost 방식 상관없이 요청을 처리하는 메서드 (요청객체, 응답객체 )가 만들어진다 
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		
		// 요청을 받아서 처리하느 로직 
		  int num1 = Integer.parseInt(req.getParameter("su1"));
    	  int num2 = Integer.parseInt(req.getParameter("su2"));
    	  
    	  int sum = num1 + num2;
    	  
    	  // 요청을 응답을 할 차례 
    	  // 응답객체 의 body를 만들어서 보내준다 
    	  // 서버가 어떤 유형의 데이터를 내려보낼것인지 알려줘야한다 => MIME TYPE
    	  resp.setContentType("text/html;charset=utf-8");
    	  
    	  
    	  // jsp 없이 순수하게 servlet 에서 응답 바디에서 html 를 만들어서 응답해준것 
    	  
    	  // 톰켓 안에 있는 내장객체 -> html 작성할 수 있다 
    	  PrintWriter out = resp.getWriter();
    	  out.println("<!DOCTYPE html>");
    	  out.println("<html>");
    	  out.println("<meta charset=\"UTF-8\">");
    	  out.println("<title>Insert title here</title>");
    	  out.println("</head><body>");
    	  out.println("<h1>"+num1+" + "+ num2 + " = "+ sum +"  </h1>");
    	  out.println("</body></html>");
    	  
    	  
    	  
    	  
		
	}

	
}
