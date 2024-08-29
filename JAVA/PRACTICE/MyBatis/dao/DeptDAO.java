package kr.co.sist.dao;

import org.apache.ibatis.session.SqlSession;

import kr.co.sist.vo.DeptVO;

public class DeptDAO {
	
	public void insertDept(DeptVO dVO) {
		int cnt = 0;
		//1.MyBatis Handler 얻기
		MyBatisHandler mbh = MyBatisHandler.getInstace();
		SqlSession ss = mbh.getMyBatisHandler("kr/co/sist/dao/mybatis-config.xml", false);
		
		//2.DB작업 수행
		cnt = ss.insert("kr.co.sist.dept.insertDept",dVO);
		
		if(cnt==1) {
			ss.commit();
		}
		
		//3.Handler 닫기
		ss.close();
	}

}
