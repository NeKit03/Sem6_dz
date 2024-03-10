package org.example.polzovateli;

import org.example.UserView;

import java.util.List;

public class TecherView implements UserView<Teacher> {
    @Override
    public void sendToConsole(List<Teacher> users) {
        for(int i=1;i<=users.size();i++){
            System.out.println(i+"teacher: "+users.get(i-1));
        }
    }
}
