package org.example.service;

import org.example.UserComparation;
import org.example.polzovateli.Teacher;
import org.example.polzovateli.TeacherGroup;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private TeacherGroup teacher;

    public TeacherService(TeacherGroup teacher) {
        this.teacher = teacher;
    }

    public TeacherGroup getTeacher() {
        return teacher;
    }

    public List<Teacher> getSortedTeacherByFIO(){
        List<Teacher> teacherList = new ArrayList<>(teacher.getTeacherList());
        teacherList.sort(new UserComparation<Teacher>());
        return teacherList;
    }
}
