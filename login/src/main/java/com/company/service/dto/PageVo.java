package com.company.service.dto;

public class PageVo {
    private int page;
    private int size;

    public PageVo() {
    }

    public PageVo(int page, int size) {
        this.page = page;
        this.size = size;
    }

    @Override
    public String toString() {
        return "PageVo{" +
                "page=" + page +
                ", size=" + size +
                '}';
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
