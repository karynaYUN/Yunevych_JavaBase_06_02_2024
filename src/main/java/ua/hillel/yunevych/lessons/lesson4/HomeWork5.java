package ua.hillel.yunevych.lessons.lesson4;

public class HomeWork5 {
    public static void main(String[] args) {
        int LiWarrior=13;
        int LiArcher=24;
        int LiRider=46;

        int MinWarrior=9;
        int MinArcher=35;
        int MinRider=12;

        int Warrios=860;

        int totalLiWarior=LiWarrior*Warrios;
        int totalLiArcher=LiArcher*Warrios;
        int totalLiRider=LiRider*Warrios;

        int totalMinWarrior= (int) (MinWarrior*(Warrios*1.5));
        int totalMinArcher=  (int) (MinArcher*(Warrios*1.5));
        int totalMinRider=  (int) (MinRider*(Warrios*1.5));

        System.out.println("Загальне значення воїнів зі сторони Лі:"+totalLiWarior
        +"\nЗагальне значання лучників зі строни Лі:"+totalLiArcher
        +"\nЗагальне значення вершників зі сторони Лі:"+totalLiRider);
        System.out.println("-------------------------");
        System.out.println("Загальне значання воїнів зі сторони Мінь:"+totalMinWarrior
        +"\nЗагальне значення лучників зі сторони Мінь:"+totalMinArcher
        +"\nЗагальне значення вершників зі строни Мінь:"+totalMinRider);

    }
}
