package ru.gb.Spring_seminar2;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Data
public class StudentRepository {
    private final List<Student> stList;

    public StudentRepository() {
        stList = new ArrayList<>();
        stList.add(new Student("Серж", "Math"));
        stList.add(new Student("Роман", "Bio"));
        stList.add(new Student("Виолетта", "Math"));
        stList.add(new Student("Коля", "Bio"));
        stList.add(new Student("Инна", "Bio"));
        stList.add(new Student("Миша", "Math"));
        stList.add(new Student("Давид", "Math"));
    }
    public Student getById(int id){
        return stList.stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public List<Student> getByGroup(String group){
        return stList.stream()
                .filter(e -> e.getGroupName().equals(group))
                .collect(Collectors.toList());
    }
    public Student getByName(String name){
        return stList.stream()
                .filter(e -> e.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public List<Student> getAll() {
        return List.copyOf(stList);
    }
}
