package com.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication
{
    public static void main(String[]args)
    {
        System.out.println("Hello Ishan");
        SpringApplication.run(QuizApplication.class,args);
    }
}
