package org.example.polzovateli;

import org.example.LSP.HiUser;
import org.example.User;

public class Student extends User implements HiUser {
    private int studentId;
//SRP
//SRP скорее всего можно посчитать что мы не собираем в группу в этом же классе их
//мы только создаем экземпляр конкретного класс
// а вся работа происходит по объеденению в отдельном StudentGroup
//т.е. внутри класса реализованны только те методы направленные строго на решение задач этого класса
//OCP
//так же здесь наверное OCP
//т.к.   у нас создаем наследника класса User
// и происходит реализация вывода для каждого класса наследника
//индивидуально без изменения класса User
//LSP
//Скорее всего тут снова метод String toString()
//поскольку мы не меняем смысл метода, но у класса Teacher вывод немного другой
//тут трудно четко привести пример
//как я понял главное взаимозаменяемости
//вроде как с классом UserComparetion
//тут мы реализовываем компаратор универсальный для учитилей и студентов
//но выполняется основное правило взаимозаменяемости
//возращаемого типа к примеру
//ISP
//в папке LSP я создал два интерфейса HiUser и AgeUser
//HiUser - приветствует пользхователя(тип общий)
//AgeUser - только для учителей т.к. у них есть поле возраст
//в классе Teacher я релизовал метод
//DIP
//это наш интерфейс UserView
//поскольку мы прописали метод sendToConsole
//но в каждом классе наследника USer мы реализовали его по своему
//т.е. мы можем создать еще наследника и реализовать вывод уже под него
//снова выполнили условие что низкоуровневый модуль не влияет на высокоуровневый


    public Student(int studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "studentId=" + studentId +" "+
                super.toString()+ "\n";
    }

    @Override
    public void printHi() {
        System.out.println("Hi"+super.getLastName());
    }
}