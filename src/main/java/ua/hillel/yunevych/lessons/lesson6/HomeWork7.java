package ua.hillel.yunevych.lessons.lesson6;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int User;
        int run=0;
        int MAX=10;
        int MIN=0;
        int MAX_run=3;
        int Program =(int)(Math.random()*(MAX-MIN+1)+MIN);

        System.out.println("ви маєте тільки "+MAX_run+" спроби");

        while (run<MAX_run){
            System.out.println("Напишіть число яке як ви думаєете загадала програма");
            System.out.println("Це ваша "+(run+1)+" спроба");
            User= in.nextInt();
            in.nextLine(); //clean

            if(User==Program){
                System.out.println("Ви вгадали число! Це число було "+Program);
            } else if (Program<User) {
                System.out.println("Загадане число меньше");
            }
            else {
                System.out.println("Загадане число більше");
            }
            run++;
        }
        System.out.println("Нажаль ви не вгадали число!");
    }
}

