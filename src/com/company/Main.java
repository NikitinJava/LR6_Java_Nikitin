package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n/////////////////////// Завдання №2 ///////////////////////\n");
	    for(double x = -2; x <= 4; x+=0.3){
            double y = Math.pow(Math.sin(x),2)+x/2;
            System.out.println("y = " + y);
        }

        System.out.println("\n/////////////////////// Завдання №3 ///////////////////////\n");
        Scanner scanner = new Scanner(System.in);
        int num=1;
        do{
            System.out.println("Введіть число або 0 для виходу: ");
            num = scanner.nextInt();
            if (num>=65 && num <=90){
                System.out.println((char)num);
            }
        }
        while(num!=0);

        System.out.println("\n/////////////////////// Завдання №4 ///////////////////////\n");
        String str=null;
        int count=0;
        boolean check;
        do{
            System.out.println("Введіть строку або 'done' для завершення: ");
            str = scanner.next();
            check = true;
            for(int i=0;i<str.length();i++){
                if(!Character.isDigit(str.charAt(i))){
                    check=false;
                }
            }
            if(check == true) count++;
        }
        while(!str.contains("done"));
        System.out.println("Кількість рядків тільки з цифрами: " + count);

    }
}
