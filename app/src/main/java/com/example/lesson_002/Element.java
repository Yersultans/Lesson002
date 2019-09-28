package com.example.lesson_002;

class Element {

    private int id;

    private String name;

    Element(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}