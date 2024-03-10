package org.example.polzovateli;

import org.example.UserView;
import org.example.polzovateli.Student;

import java.util.List;

public class StudentsView implements UserView<Student> {
    @Override
    public void sendToConsole(List<Student> users) {
        for(int i=1;i<=users.size();i++){
            System.out.println(i+"student: "+users.get(i-1));
        }
    }
}
