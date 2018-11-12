package com.company.dao.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	private int pid;
	private String pname;
	private BigDecimal price;
	private int store;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", panme=" + pname + ", price=" + price + ", store=" + store + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPanme() {
		return pname;
	}

	public void setPanme(String pname) {
		this.pname = pname;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getStore() {
		return store;
	}

	public void setStore(int store) {
		this.store = store;
	}

	public Product(int pid, String pname, BigDecimal price, int store) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.store = store;
	}

	public Product(String pname, BigDecimal price, int store) {
		super();
		this.pname = pname;
		this.price = price;
		this.store = store;
	}

	public Product(int pid) {
		super();
		this.pid = pid;
	}
	
}
