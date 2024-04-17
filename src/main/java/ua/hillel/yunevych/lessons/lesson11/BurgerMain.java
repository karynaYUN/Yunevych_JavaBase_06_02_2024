package ua.hillel.yunevych.lessons.lesson11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger b1=new Burger();
        b1.burger();
        System.out.println(b1);
        System.out.println("\t");

        Burger b2=new Burger();
        b2.vegan(true,false);
        System.out.println(b2);
        System.out.println("\t");

        Burger b3=new Burger();
        b3.doubleMeat(false);
        System.out.println(b3);
    }
}
