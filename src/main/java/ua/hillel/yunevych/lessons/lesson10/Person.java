package ua.hillel.yunevych.lessons.lesson10;

public class Person {
    public static void main(String[] args) {
        Person p1=new Person(" Will", " Smith", "New York", "2936729462846");
        Person p2=new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person p3=new Person("Sherlock ", "Holme", "London", "37742123513");


        System.out.println(p1.personInfo());
        System.out.println(p2.personInfo());
        System.out.println(p3.personInfo());
    }
    public String name;
    public String surname;
    public String town;

    public String number;
    public Person(String name, String surname, String town, String number){
        this.name=name;
        this.surname=surname;
        this.town=town;
        this.number=number;
    }
    public String personInfo() {
        return "Зателефонувати громадянину: "+name + surname +", з міста "+town+
                "можна за номером "+number;
    }
}
