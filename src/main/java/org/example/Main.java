package org.example;

import org.example.polzovateli.*;
import org.example.service.TeacherService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//В классе Student  я подписал комментарии
public class Main {
    public static void main(String[] args) {
        UserView<Student> st = new StudentsView();
        List<Student> studentList=new ArrayList<>(Arrays.asList(
                new Student(4,"nikita1","dsadas1","sadas1"),
                new Student(5,"nikita2","dsadas2","sadas2"),
                new Student(3,"nikita3","dsadas3","sadas3"),
                new Student(1,"nikita4","dsadas4","sadas4"),
                new Student(2,"nikita5","dsadas5","sadas5")
        ));
       st.sendToConsole(studentList);
       /////////////////////преподаватели/////////////////////////////////////////////////
        UserView<Teacher> tc = new TecherView();
        List<Teacher> teacherList=new ArrayList<>(Arrays.asList(
                new Teacher(5,56,"nikita5","dsadas1","sadas1"),
                new Teacher(2,72,"nikita2","dsadas2","sadas2"),
                new Teacher(4,35,"nikita4","dsadas3","sadas3"),
                new Teacher(3,40,"nikita3","dsadas4","sadas4"),
                new Teacher(1,13,"nikita1","dsadas5","sadas5")
        ));
        tc.sendToConsole(teacherList);
        TeacherGroup teacherGroup=new TeacherGroup(teacherList);
        TeacherService teacherService=new TeacherService(teacherGroup);
        for(Teacher teacher: teacherService.getSortedTeacherByFIO()){
            System.out.println(teacher);
        }


    }
}