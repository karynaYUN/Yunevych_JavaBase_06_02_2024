package ua.hillel.yunevych.lessons.lesson2;

public class Ex2Hm {
    public static void main(String[] args) {
        /* як я розумію можливо заробити двома варіантами
        перший варіант це з String
         */

        String широта="40.416500º";
        String довгота="-3.702560º";
        System.out.println("Мадрид столиця Іспанії");
        System.out.println("Широта "+широта + "\n"+ "Долгота " + довгота);

        System.out.println("---------------------------");

        /* або таким шляхом якщо хочимо інший
        формат
         */

        String ширина2="40º24.99´с.ш";
        String довгота2="-3º42.154´з.д";
        System.out.println("Мадрид столиця Іспанії");
        System.out.println("Широта "+ширина2 + "\n"+ "Долгота " + довгота2);


        System.out.println("---------------------------");

        /*
        ций варіант с double як по мні це самий логічний варіант якщо ми хочимо
        записати довжину та широту цифрами
         */
        double ширина1 = 40.416500;
        double довжина1 = -3.702560;
        System.out.println("Мадрид столиця Іспанії");
        System.out.println("Широта "+ширина1+"\n"+"Долгота "+довжина1);
    }
}
