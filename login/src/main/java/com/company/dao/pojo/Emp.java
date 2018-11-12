package com.company.dao.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Emp implements Serializable{
	private static final long serialVersionUID = 1L;
	private int empno;
	private String ename;
	private String job;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date hiredate;
	private int mgr;
	private BigDecimal sal;
	private BigDecimal comm;
	private int deptno;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp{" +
				"empno=" + empno +
				", ename='" + ename + '\'' +
				", job='" + job + '\'' +
				", hiredate=" + hiredate +
				", mgr=" + mgr +
				", sal=" + sal +
				", comm=" + comm +
				", deptno=" + deptno +
				'}';
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public BigDecimal getSal() {
		return sal;
	}

	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}

	public BigDecimal getComm() {
		return comm;
	}

	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public Emp(String ename, String job, Date hiredate, int mgr, BigDecimal sal, BigDecimal comm, int deptno) {
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	public Emp(int empno, String ename, String job, Date hiredate, int mgr, BigDecimal sal, BigDecimal comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
}
