package ua.hillel.yunevych.lessons.lesson5;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введіть ім'я першої команди:");
        String FirstCommand=in.nextLine();


        System.out.println("Введіть кількість фрагів для 1-го гравця, команди "+FirstCommand);
        int F1= in.nextInt();
        in.nextLine();
        System.out.println("Введіть кількість фрагів для 2-го гравця, команди "+FirstCommand);
        int F2= in.nextInt();
        in.nextLine();
        System.out.println("Введіть кількість фрагів для 3-го гравця, команди "+FirstCommand);
        int F3= in.nextInt();
        in.nextLine();
        System.out.println("Введіть кількість фрагів для 4-го гравця, команди "+FirstCommand);
        int F4= in.nextInt();
        in.nextLine();
        System.out.println("Введіть кількість фрагів для 5-го гравця, команди "+FirstCommand);
        int F5= in.nextInt();
        in.nextLine();

        System.out.println("----------------------------------------");
        System.out.println("Введіть ім'я другої команди: ");
        String SecondCommand=in.nextLine();

        System.out.println("Введіть кількість фрагів для 1-го гравця, команди "+SecondCommand);
        int S1= in.nextInt();
        in.nextLine();
        System.out.println("Введіть кількість фрагів для 2-го гравця, команди "+SecondCommand);
        int S2= in.nextInt();
        in.nextLine();
        System.out.println("Введіть кількість фрагів для 3-го гравця, команди "+SecondCommand);
        int S3= in.nextInt();
        in.nextLine();
        System.out.println("Введіть кількість фрагів для 4-го гравця, команди "+SecondCommand);
        int S4= in.nextInt();
        in.nextLine();
        System.out.println("Введіть кількість фрагів для 5-го гравця, команди "+SecondCommand);
        int S5= in.nextInt();
        in.nextLine();

        double averageF=(F1+F2+F3+F4+F5)/5;
        double averageS=(S1+S2+S3+S4+S5)/5;


        if (averageF>averageS){
            System.out.println("Перемогла команда: "+FirstCommand+"\nнабрала: "+averageF
                    +"очків");
        }else if(averageF<averageS){
            System.out.println("Перемогла команда: "+SecondCommand+"\nнабрала: "+averageS
                    +" очків");
        }
        else {
            System.out.println("Нічия");
        }

    }
}

