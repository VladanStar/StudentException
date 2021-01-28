package com.company;

import java.util.ArrayList;

public class StudentSystem {
    ArrayList<Student> students = new ArrayList<Student>();

    public void dodajStudenta(Student student)throws IndeksNijeValidanException,ImeNijeValidnoException{
        if(student.getIme().length()<=2){
            throw  new ImeNijeValidnoException();
        }
        else if(student.getIndeks().length()<5){
            throw new IndeksNijeValidanException();

        }
        else {
            students.add(student);
        }
    }


}
