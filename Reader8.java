package com.company;

import java.util.Scanner;
public class Reader8 {
    private String fio;
    private String readerNumber;
    private String faculty;
    private String dataBirth;
    private String phone;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Reader8[] array = new Reader8[5];
        for(int i = 0; i < array.length; i++){
            System.out.println("Фио читателя: " );
            String fio = in.next();

            System.out.println("Номер читательского билета для читателя:  " );
            String readerNumber = in.next();

            System.out.println("Факультет читателя: " );
            String faculty = in.next();

            System.out.println("Дату рождения читателя: " );
            String data = in.next();

            System.out.println("Номер телефона читателя: " );
            String phoneNumber = in.next();

            array[i] = new Reader8(fio, readerNumber, faculty, data, phoneNumber);
            System.out.println("Сколько книг взял: " + fio);
            array[i].takeBook(in.nextInt());
            System.out.println("Какие книги взял :" + fio);
            String temp = in.nextLine();
            array[i].takeBook(in.nextLine().split(", "));

            System.out.println("Сколько книг вернул: " + fio);
            array[i].returnBook(in.nextInt());
            System.out.println("Какие книги вернул: " + fio);
            temp = in.nextLine();
            array[i].returnBook(in.nextLine().split(", "));
        }
    }
    public Reader8(String fio, String readerNumber, String faculty, String dataBirth, String phone){
        this.fio = fio;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.dataBirth = dataBirth;
        this.phone = phone;
    }
    public void takeBook(int booksNum) {
        System.out.println(fio + " взял " + booksNum + " книг");
    }
    public void takeBook(String[] booksTitle) {
        String booksTitles = String.join(", ", booksTitle);
        System.out.println(fio + " взял книги: " + booksTitles);
    }
    public void returnBook(int booksNum) {
        System.out.println(fio + " вернул " + booksNum + " книг");
    }
    public void returnBook(String[] booksTitle) {
        String booksTitles = String.join(", ", booksTitle);
        System.out.println(fio + " вернул книги: " + booksTitles);
    }
    public String getFio() {
        return fio;
    }
    public String getReader() {
        return readerNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getData() {
        return dataBirth;
    }
    public String getPhone() {
        return phone;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setReaderNumber(String readerNumber) {
        this.readerNumber = readerNumber;
    }
    public void setData(String data) {
        this.dataBirth = data;
    }
    public void setPhone(String phoneNumber) {
        this.phone = phoneNumber;
    }
}
