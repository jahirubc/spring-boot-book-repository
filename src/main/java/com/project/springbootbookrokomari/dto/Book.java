package com.project.springbootbookrokomari.dto;

public class Book {
    private Integer id;
    private String name;
    private Integer pageCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book(String name, Integer pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public Book() {
    }
}
