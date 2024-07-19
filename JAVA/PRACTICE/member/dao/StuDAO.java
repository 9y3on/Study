package kr.co.sist.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.sist.dao.DbConnection;
import kr.co.sist.member.vo.StudentVO;

public class StuDAO {
	private static StuDAO sDAO;
	
	private StuDAO() {
		
	}
	
	public static StuDAO getInstance() {
		if(sDAO == null) {
			sDAO = new StuDAO();
		}
		return sDAO;
	}
	
	public List<StudentVO> selectAllStudent() throws SQLException {
		List<StudentVO> list = new ArrayList<StudentVO>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		//1.드라이버 로딩
		DbConnection db = DbConnection.getInstance();
		
		try {
			//2.커넥션 객체 얻기
			con = db.getConn("jdbc/dbcp");
			
			//3.쿼리 생성 객체 얻기
			String selectAllStudent = 
					"select num,name,age,email,input_date from student";
			pstmt = con.prepareStatement(selectAllStudent);
			//4.바인드 변수 값 설정하기
			//5.쿼리 실행 후 결과 얻기
			rs = pstmt.executeQuery();
			StudentVO stuVO = null;
			while(rs.next()) { //다음 레코드가 존재하면 실행
				stuVO = new StudentVO(rs.getInt("num"),rs.getString("name"),
						rs.getInt("age"),rs.getString("email"),rs.getDate("input_date"));
				list.add(stuVO);
			}
		}finally {
			//6.연결해제
			db.dbClose(rs, pstmt, con);
		}
		return list;
	}
	
	public List<StudentVO> selectAgeStudent(int age) throws SQLException {
		List<StudentVO> list = new ArrayList<StudentVO>();
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		//1.드라이버 로딩
		DbConnection db = DbConnection.getInstance();
		
		try {
			//2.커넥션 객체 얻기
			con = db.getConn("jdbc/dbcp");
			
			//3.쿼리 생성 객체 얻기
			String selectAllStudent = 
					"select num,name,age,email,input_date from student where age = ?";
			pstmt = con.prepareStatement(selectAllStudent);
			//4.바인드 변수 값 설정하기
			pstmt.setInt(1, age);
			
			//5.쿼리 실행 후 결과 얻기
			rs = pstmt.executeQuery();
			StudentVO stuVO = null;
			while(rs.next()) { //다음 레코드가 존재하면 실행
				stuVO = new StudentVO(rs.getInt("num"),rs.getString("name"),
						rs.getInt("age"),rs.getString("email"),rs.getDate("input_date"));
				list.add(stuVO);
			}
		}finally {
			//6.연결해제
			db.dbClose(rs, pstmt, con);
		}
		return list;
	}
	
	
}
