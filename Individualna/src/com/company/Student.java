package com.company;

public class Student {
    private String ime;
    private String prezime;
    private String adresa;
    private String grad;
    private String indeks;

    public Student() {
    }

    public Student(String ime, String prezime, String adresa, String grad, String indeks) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.grad = grad;
        this.indeks = indeks;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getIndeks() {
        return indeks;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresa='" + adresa + '\'' +
                ", grad='" + grad + '\'' +
                ", indeks='" + indeks + '\'' +
                '}';
    }
}
