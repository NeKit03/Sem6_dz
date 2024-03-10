package org.example.polzovateli;

import org.example.LSP.AgeUser;
import org.example.LSP.HiUser;
import org.example.User;

import javax.swing.*;

public class Teacher extends User implements HiUser, AgeUser {
    private int teacherId;
    private int teacherAge;

    public Teacher(int teacherId, int teacherAge,String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherId = teacherId;
        this.teacherAge = teacherAge;

    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    @Override
    public String toString() {
        return "teacherId = " + teacherId +
                ", Age=" + teacherAge +" "+
                super.toString()+
                '}';
    }

    @Override
    public void printAge() {
        System.out.println("HI"+super.getLastName());
    }

    @Override
    public void printHi() {
        System.out.println("Age="+getTeacherAge());
    }
}
