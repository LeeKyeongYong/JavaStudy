package com.study.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
