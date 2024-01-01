package Lesson_02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

    pluser2();

    }
    public static void pluser1(){
        String str = "";
        Date date = new Date();
        System.out.println(date);
        for (int i = 0; i < 1000_000; i++) {
            str += "+";
        }
        Date date1 = new Date();
        System.out.println(date1);
    }
    public static void pluser2(){


        Date date = new Date();
        System.out.println(date.getTime());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000_000; i++) {
            sb.append("+");
        }
        Date date1 = new Date();
        System.out.println(date1.getTime());


    }


}