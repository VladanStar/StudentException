package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new Main();

    }
    public Main() {
        Student student = new Student("Vladan", "Cupric", "Kopaonicka 48", "Kragujevac", "96/511");
        StudentSystem listaStudenata = new StudentSystem();
        try {
            listaStudenata.dodajStudenta(student);
            System.out.println("Kraj");

        } catch (ImeNijeValidnoException e) {
            e.printStackTrace();
        } catch (IndeksNijeValidanException e) {
            e.printStackTrace();
        }

    }
    }

