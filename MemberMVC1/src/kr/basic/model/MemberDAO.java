package kr.basic.model;

//JDBC->myBatis, JPA
import java.sql.*;
import java.util.ArrayList;
public class MemberDAO {
	
	private MemberDAO() {}
	
	static private MemberDAO instance = new MemberDAO();
	static public MemberDAO getInstance() {
		return instance;
	}
		
	
private Connection conn; // -mysql 관련된 외부 jar 구현 클래스가 채워진 객체
private PreparedStatement ps; // 외부에서 동적으로 들어오는 값을 제외하고 미리 mysql문 컴파일 시켜준다.
private ResultSet rs;

// 데이터베이스 연결객체 생성(Connection)
public void getConnect() {
	   //데이터베이스접속URL
	   String URL="jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8&serverTimezone=UTC";
	   String user="root";
	   String password="1234"; // 내pc에는 1234 비번
	   // MySQL Driver Loading
	  try {
		  //동적로딩(실행시점에서 객체를 생성하는 방법)
		  Class.forName("com.mysql.jdbc.Driver");		 
		  conn=DriverManager.getConnection(URL, user, password);
		  System.out.println("db 연동성공: " + conn );
	   } catch (Exception e) {
		  e.printStackTrace();
	  }		   
}   
// 회원저장 동작
public int memberInsert(MemberVO vo) {
	  //                                                             ?(파라메터) 1 2 3 4 5 6   외부에서 동적으로 들어오는 값
	  String SQL="insert into member(id, pass, name, age, email, phone) values(?,?,?,?,?,?)"; 
	  getConnect(); // mysql db 명령문 ==> 쿼리문-> 실행 : 어디 db에서 누가 실행 ==> :db연동을 해야한다 : mysql, root 계정이 이 명령문을 실행한다.
	  // SQL문장을 전송하는 객체 생성
	  int cnt=-1;
	  try {
		ps=conn.prepareStatement(SQL); //미리 컴파일을 시킨다.(속도가빠르기) -> 위에 있는 쿼리문이 정상적으로 실행이 되면 preparedstatement 객체 생성
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPass());
		ps.setString(3, vo.getName());
		ps.setInt(4, vo.getAge());
		ps.setString(5, vo.getEmail());
		ps.setString(6, vo.getPhone());
		//  1,0
		cnt=ps.executeUpdate(); //전송(실행)
		
	   }catch (Exception e) {
		e.printStackTrace();
	   }finally {
		   dbClose();
	  }
	  return cnt; // 1 or 0
}
// 회원(VO)전체 리스트(ArrayList) 가져오기
public ArrayList<MemberVO> memberList() {
	 String SQL="select * from member";
	 getConnect();
	 ArrayList<MemberVO> list=new ArrayList<MemberVO>();
	 try {
	   ps=conn.prepareStatement(SQL);
	   rs=ps.executeQuery(); // rs->커서
	   while(rs.next()) {
		   int num=rs.getInt("num");
		   String id=rs.getString("id");
		   String pass=rs.getString("pass");
		   String name=rs.getString("name");		   
		   int age=rs.getInt("age");
		   String email=rs.getString("email");
		   String phone=rs.getString("phone");
		   // 묶고->담고
		   MemberVO vo=new MemberVO(num, id, pass, name, age, email, phone);
		   list.add(vo);		   
	   }
	 } catch (Exception e) {
    e.printStackTrace();
	 }finally {
		dbClose();
	 }	 
	 return list;
}//memberList


public String checkMemberId(String id) {
	 String SQL="select pass from member where id=?";
	 getConnect();

	 try {
	   ps=conn.prepareStatement(SQL);
	   ps.setString(1, id);
		rs=ps.executeQuery();
		 if(rs.next()) {
			 return rs.getString("pass");
		 }
	 } catch (Exception e) {
		e.printStackTrace();
	 }finally {
		dbClose();
	}	   
	 return null;
}

public int getMemberNo(String id) {
	 String SQL="select num from member where id=?";
	 getConnect();

	 try {
	   ps=conn.prepareStatement(SQL);
	   ps.setString(1, id);
		rs=ps.executeQuery();
		 if(rs.next()) {
			 return rs.getInt("num");
		 }
	 } catch (Exception e) {
		e.printStackTrace();
	 }finally {
		dbClose();
	}	   
	 return -1;
}



public int memberDelete(String id) {
	 String SQL="delete from member where id=?";
	 getConnect();
	 int cnt=-1;
	 try {
	   ps=conn.prepareStatement(SQL);
	   ps.setString(1,id);
	   cnt=ps.executeUpdate();// 1 or 0	   
	 } catch (Exception e) {
		e.printStackTrace();
	 }finally {
		dbClose();
	}	   
	 return cnt;
}//memberDelete


public MemberVO memberContent(int num) {
	   String SQL="select * from member where num=?";
	   getConnect();
	   MemberVO vo=null;
	   try {
		 ps=conn.prepareStatement(SQL);
		  ps.setInt(1,num);
		 rs=ps.executeQuery();
		 if(rs.next()) {
			 //회원한명의 정보를 가져와서->묶고(VO)
			   String id=rs.getString("id");
			   String pass=rs.getString("pass");
			   String name=rs.getString("name");		   
			   int age=rs.getInt("age");
			   String email=rs.getString("email");
			   String phone=rs.getString("phone");
			   vo=new MemberVO(num, id, pass, name, age, email, phone);
		 }
	   } catch (Exception e) {
		 e.printStackTrace();
	   }finally {
		  dbClose();
	   }	
	   return vo;
}
public int memberUpdate(MemberVO vo) {
	   String SQL="update member set age=?, email=?, phone=? where num=?";
	   getConnect();
	   int cnt=-1;
	   try {
	   	ps=conn.prepareStatement(SQL);
	   	ps.setInt(1, vo.getAge());
	   	ps.setString(2, vo.getEmail());
	   	ps.setString(3, vo.getPhone());
	   	ps.setInt(4, vo.getNum());	   	
	   	cnt=ps.executeUpdate();	   	
	} catch (Exception e) {
		e.printStackTrace();
	}finally {
		dbClose();
	}	   
	   return cnt;
}
// 데이터베이스 연결 끊기 : 왜 매번 db연동을 하고  db 연동을 끊나 -> 
public void dbClose() {
	  try { 
	   if(rs!=null) rs.close();
	   if(ps!=null) ps.close();
	   if(conn!=null) conn.close();
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
}   
}
