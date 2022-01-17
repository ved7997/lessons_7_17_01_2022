package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задание №1
        String pp = " ";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + pp + firstName + pp + middleName;

        System.out.println(fullName);

        // Задание №2
        String fullName1;
        fullName1 =  fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

        //Задание №3

        String fullName2;
        fullName2 = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName2);

        //Задание №
        String firstNameS = "Семён";
        String middleNameS = "Семёнович";
        String fullNameSemen = lastName + pp + firstNameS + pp + middleNameS;
        System.out.println(fullNameSemen);
        String fullName3 = fullNameSemen.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName3);


    }
}
