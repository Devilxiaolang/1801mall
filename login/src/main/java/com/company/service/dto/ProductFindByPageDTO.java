package com.company.service.dto;

import java.util.List;

import com.company.dao.pojo.Product;

public class ProductFindByPageDTO {
	private int totalpage;
	private int currentPage;
	private int pagesize;
	private List<Product> data;

	public ProductFindByPageDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ProductFindByPageDTO [totalpage=" + totalpage + ", currentPage=" + currentPage + ", pagesize="
				+ pagesize + ", data=" + data + "]";
	}

	public int getTotalpage() {
		return totalpage;
	}

	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public List<Product> getData() {
		return data;
	}

	public void setData(List<Product> data) {
		this.data = data;
	}

	public ProductFindByPageDTO(int totalpage, int currentPage, int pagesize, List<Product> data) {
		super();
		this.totalpage = totalpage;
		this.currentPage = currentPage;
		this.pagesize = pagesize;
		this.data = data;
	}
}
