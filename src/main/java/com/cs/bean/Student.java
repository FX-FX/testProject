package com.cs.bean;

/**
 * Created by lorne on 2019/5/21.
 */
public class Student {

    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {

    }

    public Student(Integer id, String name) {

        this.id = id;
        this.name = name;
    }
}
