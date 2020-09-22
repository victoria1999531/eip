/*
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.eip.ehm.CompletionStage;

public class Book {
    /*
     *The properties of the book
     */
    private Long id;
    private String name;
    private Double score;

    public Book() {
        super();
    }

    public Book(Long id, String name, Double score) {
        super();
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return "Book{" + "id=" + id + ", name= " + name + ", score=" + score + '}';
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getScore() {
        return score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}