package com.study.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.study.model.MemberDTO;

public class MemberController {
	public static void main(String[] args) {
		//1.등록 2.조회 3.수정 4.삭제 5.종료
		Scanner sc=new Scanner(System.in);


		while(true) {
			Connection con = null;
			PreparedStatement pstmt=null;
			Statement stmt=null;
			ResultSet rs=null;
			System.out.print("-- 1.등록 2.조회 3.수정 4.삭제 5.종료 --");
			int chocie = sc.nextInt();
			if(chocie == 1) {
				//insert합니다.
				System.out.println("====등록====");
				System.out.print("ID: ");
				String userId=sc.next();
				System.out.print("PW: ");
				String userPw=sc.next();
				System.out.print("NAME: ");
				String userName=sc.next();
				System.out.print("nick: ");
				String userNick=sc.next();
				
				
				/* JDBC
				  1. 드라이버 로딩 (동적로딩)
				    - 어떠한 dbms의 드라이버를 사용할 것인지 명시
				    try-catch:예외사항이 발생한 부분을 해결하는 방법
				    예외사항이 발생한것같은 부분을 try{}안에 작성
				    해당 예외사항 발생시 catch로 이동
				  2. 커넥션 연결
				   - 커넥션 연결은 드라이버가 연결해주며
				   - 연결시 DB주소,계정,비밀번호가 필요
				 */

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
					String id="hr";
					String pw="hr";
					con=DriverManager.getConnection(url,id,pw);
					if(con!=null) {
						System.err.println("DB연결 성공");
					} else {
						System.err.println("DB연결 실패!!");
					}
					//3.sql문장 작성 실행
					String i_sql="INSERT INTO SPRINGMEMBER (ID,PW,NAME,NICK) VALUES(?,?,?,?)";
					pstmt=con.prepareStatement(i_sql);
					pstmt.setString(1,userId);
					pstmt.setString(2,userPw);
					pstmt.setString(3,userName);
					pstmt.setString(4,userNick);
					int cnt=pstmt.executeUpdate();
					if(cnt>0) {
						System.out.println("등록 성공");
					} else {
						System.out.println("등록 실패");
					}
					/*
					  하나라도 있으면 executeUpdate 
					  excete query select와 유사
					 */
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println("Class에러.."+e.getMessage());
				} catch(SQLException se) {
					System.err.println("sql에러.."+se.getMessage());
				} finally {
					try {
						//try가 잘 실행되거나 중간에 catch로 빠진다고 하더라두ㅗ
						//무조건 이 안으로 들어온게한다.
						//4.연결끊기
						// - 연결끊기는 역순으로 해준다.
						if(pstmt!=null) {
							pstmt.close();
						}
						if(con!=null) {
							con.close();
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.err.println("finall에러 :"+e.getMessage());
					}
				}
			} else if(chocie == 2) {
				//select합니다.
				System.out.println("====조회====");
				System.out.print("ID: ");
				String userId=sc.next();
				//String i_sql="select id,pw,name,nick from SPRINGMEMBER where ID = ?";
				String i_sql="select id,pw,name,nick from SPRINGMEMBER";
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
					String id="hr";
					String pw="hr";
					con=DriverManager.getConnection(url,id,pw);
					pstmt=con.prepareStatement(i_sql);
					stmt=con.createStatement();
					rs=stmt.executeQuery(i_sql);  // 전체 이력 쿼리 실행
					// pstmt.setString(1,userId); //파라미터를 받았을경우
					// rs=pstmt.executeQuery(); //특정아이디조회할때
					// if(rs.next()) { //조건데이터가 존재하는것인가?
						while(rs.next()) { //전체조회
							String rsId=rs.getString("ID");
							String rsPw=rs.getString("PW");
							String rsName=rs.getString("NAME");
							String rsNick=rs.getString("NICK");
							System.out.println("( "+rsNick+" )님의( "+rsName+" ) 아이디는 "+rsId+" 이며, 비밀번호는: "+rsPw+" 입니다");
						}
					/*else { //데이터가 존재하지않을경우
						System.out.println("존재하지않습니다.");
					}
					*/
				}catch (ClassNotFoundException cnfe) {
					// TODO: handle exception
					System.err.println("Class에러.."+cnfe.getMessage());
				}catch (SQLException se) {
					// TODO: handle exception
					System.err.println("SQL에러.."+se.getMessage());
				} finally {
					
					try {
						if(pstmt!=null) {
							pstmt.close();
						}
						/*
						 * if(stmt!=null) { stmt.close(); }
						 */
						if(con!=null) {
							con.close();
						}
					} catch (Exception e) {
						// TODO: handle exception
						System.err.println("close 에러: "+e.getMessage());
					}
				}
			} else if(chocie == 3) {
				//update합니다.
				//입력받은 id가 일치하는것을 찾아 nick변경
				System.out.println("====수정====");
				
				System.out.print("ID: ");
				String userId=sc.next();
				System.out.print("변경해야할 nick: ");
				String userNick=sc.next();
				
				String i_sql="update SPRINGMEMBER set nick = ? where id = ?";
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
					String id="hr";
					String pw="hr";
					con=DriverManager.getConnection(url,id,pw);
					pstmt=con.prepareStatement(i_sql);
					pstmt.setString(1,userNick);
					pstmt.setString(2,userId);
					int cnt=pstmt.executeUpdate(); //업데이트 수정 사용... 등록 삭제 사용..
					if(cnt>0) {
						System.out.println("수정 성공");
					} else {
						System.out.println("수정 실패");
					}
				}catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println("Class에러.."+e.getMessage());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(pstmt!=null) {
							pstmt.close();
						}
						if(con!=null) {
							con.close();
						}
					} catch (Exception ce) {
						// TODO: handle exception
						System.err.println("Close종료: "+ce.getMessage());
					}
				}
				
			} else if(chocie == 4) {
				//delete합니다.
				//삭제할 id를 입력받아 동일한 ID를 가진 녀석을 삭제하시오.
				
				System.out.println("====삭제====");
				System.out.print("ID: ");
				String userId=sc.next();
				String i_sql="delete from SPRINGMEMBER where ID = ?";


				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
					String id="hr";
					String pw="hr";
					con=DriverManager.getConnection(url,id,pw);
					pstmt=con.prepareStatement(i_sql);
					pstmt.setString(1,userId);
					int cnt=pstmt.executeUpdate(); //업데이트 수정 사용... 등록 삭제 사용..
					if(cnt>0) {
						System.out.println("삭제 성공");
					} else {
						System.out.println("삭제 실패");
					}
				}catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					System.err.println("Class에러.."+e.getMessage());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(pstmt!=null) {
							pstmt.close();
						}
						if(con!=null) {
							con.close();
						}
					} catch (Exception ce) {
						// TODO: handle exception
						System.err.println("close 에러: "+ce.getMessage());
					}
				}
				
			} else {
				System.out.println("종료합니다.");
				break;
			}

		}
		sc.close();
	}
}

/*
 package com.study.model;

public class MemberDTO {
	private String id;           /*사용자아이디 등록*/
	private String pw;           /*사용자아이디 비번*/
	private String name;         /*사용자아이디 이름*/
	private String nick;        /*사용자아이디 닉네임*/
	
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MemberDTO(String id, String pw, String name, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.nick = nick;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", nick=" + nick + "]";
	}
}

 class MemberDAO {
	
	public Connection con = null;
	public PreparedStatement pstmt=null;
	public Statement stmt=null;
	public ResultSet rs=null;
	
	public int insert(String userId, String userPw, String userName, String userNick) {
		// TODO Auto-generated method stub
		int cnt=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id="hr";
			String pw="hr";
			con=DriverManager.getConnection(url,id,pw);
			if(con!=null) {
				System.err.println("DB연결 성공");
			} else {
				System.err.println("DB연결 실패!!");
			}
			//3.sql문장 작성 실행
			String i_sql="INSERT INTO SPRINGMEMBER (ID,PW,NAME,NICK) VALUES(?,?,?,?)";
			pstmt=con.prepareStatement(i_sql);
			pstmt.setString(1,userId);
			pstmt.setString(2,userPw);
			pstmt.setString(3,userName);
			pstmt.setString(4,userNick);
			cnt=pstmt.executeUpdate();
			
			/*
			  하나라도 있으면 executeUpdate 
			  excete query select와 유사
			 */
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Class에러.."+e.getMessage());
		} catch(SQLException se) {
			System.err.println("sql에러.."+se.getMessage());
		} finally {
			try {
				//try가 잘 실행되거나 중간에 catch로 빠진다고 하더라두ㅗ
				//무조건 이 안으로 들어온게한다.
				//4.연결끊기
				// - 연결끊기는 역순으로 해준다.
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(con!=null) {
					con.close();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println("finall에러 :"+e.getMessage());
			}
		}
		return cnt;
	}

	public ArrayList<MemberDTO> selectList() {
		// TODO Auto-generated method stub
		ArrayList<MemberDTO> list =new ArrayList<MemberDTO>();
		try {
			String i_sql="select id,pw,name,nick from SPRINGMEMBER";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id="hr";
			String pw="hr";
			con=DriverManager.getConnection(url,id,pw);
			if(con!=null) {
				System.err.println("DB연결 성공");
			} else {
				System.err.println("DB연결 실패!!");
			}
			stmt=con.createStatement();
			rs=stmt.executeQuery(i_sql);  // 전체 이력 쿼리 실행
			
			if(rs.next()) {
				System.err.println("조회 성공");
			} else {
				System.err.println("조회 실패");
			}
			
				while(rs.next()) { //전체조회
					/*
					 ResultSet 객체는 select 구정의 결과를 표형태로
					  저장하고 있는 객체이다.
					  resultSEt 커서라는 개념이 있으며 이 커서는 맨 처음
					  컬럼을 향하게 된다.
					  rs.next() - > 커서를 아래로 이동 할수 있는지 물어보는 메소드 이며.
					  아래로 이동이 가능하다면(값이 존재한다면)
					  실제로 커서를 한 칸 아래로 이동하고 true를 반환한다.
					  값이 없다면 false를 반환한다
					 */
					
					String rsId=rs.getString("ID");
					String rsPw=rs.getString("PW");
					String rsName=rs.getString("NAME");
					String rsNick=rs.getString("NICK");
					MemberDTO dto=new MemberDTO(rsId, rsPw, rsName, rsNick);
					list.add(dto);
				}
			
		}catch (ClassNotFoundException cnfe) {
			// TODO: handle exception
			System.err.println("Class에러.."+cnfe.getMessage());
		}catch (SQLException se) {
			// TODO: handle exception
			System.err.println("SQL에러.."+se.getMessage());
		} finally {
			
			try {
				if(rs!=null) {
					rs.close();
				}						
				if(stmt!=null) {
					stmt.close();
				}
				
				if(con!=null) {
					con.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("close 에러: "+e.getMessage());
			}
		}
		return list;
	}

	public int update(String userId, String userNick) {
		// TODO Auto-generated method stub

		int cnt=0;
		try {
			String i_sql="update SPRINGMEMBER set nick = ? where id = ?";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id="hr";
			String pw="hr";
			con=DriverManager.getConnection(url,id,pw);
			pstmt=con.prepareStatement(i_sql);
			pstmt.setString(1,userNick);
			pstmt.setString(2,userId);
			cnt=pstmt.executeUpdate(); //업데이트 수정 사용... 등록 삭제 사용..
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Class에러.."+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(con!=null) {
					con.close();
				}
			} catch (Exception ce) {
				// TODO: handle exception
				System.err.println("Close종료: "+ce.getMessage());
			}
		}
		return cnt;
	}

	public int delete(String userId) {
		// TODO Auto-generated method stub
		int cnt=0;
		try {
			String i_sql="delete from SPRINGMEMBER where ID = ?";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id="hr";
			String pw="hr";
			con=DriverManager.getConnection(url,id,pw);
			pstmt=con.prepareStatement(i_sql);
			pstmt.setString(1,userId);
			cnt=pstmt.executeUpdate(); //업데이트 수정 사용... 등록 삭제 사용..
			
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Class에러.."+e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(con!=null) {
					con.close();
				}
			} catch (Exception ce) {
				// TODO: handle exception
				System.err.println("close 에러: "+ce.getMessage());
			}
		}
		return cnt;
	}

	public MemberDTO sertUserOne(String userId) {
		// TODO Auto-generated method stub
		MemberDTO dto=null;
		try {
			String i_sql="select id,pw,name,nick from SPRINGMEMBER where ID = ?";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
			String id="hr";
			String pw="hr";
			con=DriverManager.getConnection(url,id,pw);
			if(con!=null) {
				System.err.println("DB연결 성공");
			} else {
				System.err.println("DB연결 실패!!");
			}
			
			 pstmt=con.prepareStatement(i_sql);
			 pstmt.setString(1,userId);
			 rs=pstmt.executeQuery();
			
			if(rs.next()) { //조건데이터가 존재하는것인가?
				
				//while(rs.next()) { //전체조회
					/*
					 ResultSet 객체는 select 구정의 결과를 표형태로
					  저장하고 있는 객체이다.
					  resultSEt 커서라는 개념이 있으며 이 커서는 맨 처음
					  컬럼을 향하게 된다.
					  rs.next() - > 커서를 아래로 이동 할수 있는지 물어보는 메소드 이며.
					  아래로 이동이 가능하다면(값이 존재한다면)
					  실제로 커서를 한 칸 아래로 이동하고 true를 반환한다.
					  값이 없다면 false를 반환한다
					 */
					
					String rsId=rs.getString("ID");
					String rsPw=rs.getString("PW");
					String rsName=rs.getString("NAME");
					String rsNick=rs.getString("NICK");
					dto=new MemberDTO(rsId, rsPw, rsName, rsNick);
					//System.out.println("( "+rsNick+" )님의( "+rsName+" ) 아이디는 "+rsId+" 이며, 비밀번호는: "+rsPw+" 입니다");
				//
		   } else { //데이터가 존재하지않을경우
			   //ischeck=false;
			   dto=new MemberDTO();
		   }
			
		}catch (ClassNotFoundException cnfe) {
			// TODO: handle exception
			System.err.println("Class에러.."+cnfe.getMessage());
		}catch (SQLException se) {
			// TODO: handle exception
			System.err.println("SQL에러.."+se.getMessage());
		} finally {
			
			try {
				if(pstmt!=null) { 
					pstmt.close(); 
				 }
				 
				if(con!=null) {
					con.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("close 에러: "+e.getMessage());
			}
		}
		return dto;
	}

}
 */
