package kr.test.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MemberDAO {

	// 데이터베이스와 연결하기위해 필요한 객체 3가지 
	private Connection conn; // 외부 db 연동하는 객체
	private PreparedStatement ps; // sql 명령문 미리 실행 객체 
	private ResultSet rs; // view 결과 테이블 받아오는 객체 
	
	// db 연결 객체 생성 
	public void getConnect() {
		// 데이터베이스 연결 정보 
		String url="jdbc:mysql://localhost:3306/test?charaterEncoding=UTF-8&serverTimezone=UTC";
		String user="root";
		String password="root";
		
		// 외부에 있는 driver 클래스를 메모리에 로딩 
		// 보통 컴파일 할때 메모리에 미리 로딩 
		
		try {
			// 동적 바인딩 : 동적 로딩 => 런타임시 메모리 로딩 : 자바 리플렉션 
			Class.forName("com.mysql.jdbc.Driver"); // 구현된  드라이버 클래스를 메모리에 올린다 
			conn = DriverManager.getConnection(url,user,password); // 연동이 성공 connection 객체를 받아온다 
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
