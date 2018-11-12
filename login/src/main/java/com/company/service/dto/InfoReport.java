package com.company.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class InfoReport implements Serializable{
	private static final long serialVersionUID = 1L;
	private int deptno;
	private BigDecimal maxsal;
	private BigDecimal minsal;
	private BigDecimal avgsal;
	private int counter;
	private BigDecimal sumsal;
	public InfoReport() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InfoReport [deptno=" + deptno + ", maxsal=" + maxsal + ", minsal=" + minsal + ", avgsal=" + avgsal
				+ ", counter=" + counter + ", sumsal=" + sumsal + "]";
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public BigDecimal getMaxsal() {
		return maxsal;
	}

	public void setMaxsal(BigDecimal maxsal) {
		this.maxsal = maxsal;
	}

	public BigDecimal getMinsal() {
		return minsal;
	}

	public void setMinsal(BigDecimal minsal) {
		this.minsal = minsal;
	}

	public BigDecimal getAvgsal() {
		return avgsal;
	}

	public void setAvgsal(BigDecimal avgsal) {
		this.avgsal = avgsal;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public BigDecimal getSumsal() {
		return sumsal;
	}

	public void setSumsal(BigDecimal sumsal) {
		this.sumsal = sumsal;
	}

	public InfoReport(int deptno, BigDecimal maxsal, BigDecimal minsal, BigDecimal avgsal, int counter,
			BigDecimal sumsal) {
		super();
		this.deptno = deptno;
		this.maxsal = maxsal;
		this.minsal = minsal;
		this.avgsal = avgsal;
		this.counter = counter;
		this.sumsal = sumsal;
	}
}
