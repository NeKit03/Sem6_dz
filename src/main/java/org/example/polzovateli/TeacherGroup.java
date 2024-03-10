package org.example.polzovateli;

import java.util.List;

public class TeacherGroup {
    private List<Teacher> teachersList;

    public TeacherGroup(List<Teacher> teachersList) {
        this.teachersList = teachersList;
    }

    public List<Teacher> getTeacherList() {
        return teachersList;
    }

    public void setTeacherList(List<Teacher> teachersList) {
        this.teachersList = teachersList;
    }

    @Override
    public String toString() {
        return  teachersList+" " ;
    }
}
