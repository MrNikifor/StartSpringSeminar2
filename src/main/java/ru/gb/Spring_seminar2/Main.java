package ru.gb.Spring_seminar2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);

		//Создаем объекты с помощи ApplicationContext.
//		StudentRepository studentRepository = context.getBean(StudentRepository.class);
//		System.out.println(studentRepository.getById(3));
	}

}
