package com.kingland.eip.ehm.Lambda;

public class Artist {
    private int age;
    private String name;
    private profession profession;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public profession getProfession() {
        return profession;
    }

    public void setProfession(profession profession) {
        this.profession = profession;

    }

    public Artist(String name, int age, profession profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;

    }

    public String toString() {
        return "Artist{" + "name=" + name + ", age=" + age + ", profession=" + profession + '}';

    }
}