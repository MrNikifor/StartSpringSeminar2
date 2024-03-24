package ru.gb.Spring_seminar2;

import lombok.Data;

@Data
public class Student {
    private static int curId = 0;
    private int id;
    private  String name;
    private String groupName;

    public Student(String name, String groupName) {
        this.id = curId++;
        this.name = name;
        this.groupName = groupName;
    }
}
