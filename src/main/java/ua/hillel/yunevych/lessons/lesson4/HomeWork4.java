package ua.hillel.yunevych.lessons.lesson4;

public class HomeWork4 {
    public static void main(String[] args) {
        int lenght=5;
        int width=10;
        int height=15;
        int LENGHT=lenght + width + height;
        int Volumen=lenght * width * height;

        System.out.println("Об'єм паралеліпіпіда:"+Volumen);
        System.out.println("Сумарна довжина:"+ LENGHT);
        System.out.println("-------------------------------");

        //можливо взяти byte абo short, але в більшості задач не берyть такі маленькі значання тому я думаю що краще
        //всього взяти int
        //також можна зробити з double

        double lenght1=5.5;
        double width1=10.10;
        double height1=13.7;
        double LENGHT1=lenght1 + width1 + height1;
        double Volumen1=lenght1 * width1 * height1;
        System.out.println("Об'єм паралеліпіпіда:"+Volumen1);
        System.out.println("Сумарна довжина:"+ LENGHT1);

    }
}
