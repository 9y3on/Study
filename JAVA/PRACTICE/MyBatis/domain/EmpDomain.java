package kr.co.sist.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmpDomain {
	private int empno, deptno, sal;
	private String ename, job;
	private Date hiredate;

}
