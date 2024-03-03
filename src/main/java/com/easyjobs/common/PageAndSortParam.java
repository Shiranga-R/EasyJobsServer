package com.easyjobs.common;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageAndSortParam {
    private int pageSize = 10;
    private int pageIndex;
    private String sortField;
    private String sortDirection;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex - 1;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    public Pageable getPageable() {
        if (this.getSortField() == null || "".equals(this.getSortField())) {
            return PageRequest.of(this.getPageIndex(), this.getPageSize());
        }
        return PageRequest.of(this.getPageIndex(), this.getPageSize(),
                "adc".equals(this.getSortDirection()) ? Sort.by(this.getSortField()).ascending() : Sort.by(this.getSortField()).descending());
    }

}
