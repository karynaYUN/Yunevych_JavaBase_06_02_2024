package ua.hillel.yunevych.lessons.lesson11;

public class Burger {

    public boolean bun;

    public boolean meat;

    public boolean mayo;

    public boolean veg;

    public boolean che;
    public void burger(){
        this.bun=true;
        this.meat=true;
        this.mayo=true;
        this.veg=true;
        this.che=true;
        System.out.println("Бургер нормальний, з усіма інгридаєнтами:");
        System.out.println("Булочка,мясо,майонез,овочі,сир");
    }
    public void vegan(boolean mayo,boolean meat){
        this.bun=true;
        this.meat=meat;
        this.mayo=mayo;
        this.veg=true;
        this.che=true;
        if(!mayo && !meat) {
            System.out.println("Бургер веганський:");
            System.out.println("Булочка,овочі,сир");
        }else if (mayo==true || !meat){
            System.out.println("Бургер веганський:");
            System.out.println("Булочка,майонез,овочі,сир");
        } else if (!mayo || meat == true) {
            System.out.println("Бургер веганський:");
            System.out.println("Булочка,мясо,овочі,сир");
        }else {
            System.out.println("Бургер веганський:");
            System.out.println("Булочка,мясо,майонез,овочі,сир");
        }
    }
    public void doubleMeat(boolean meat){
        this.bun=true;
        this.meat=meat;
        this.mayo=true;
        this.veg=true;
        this.che=true;
        if(meat==true) {
            System.out.println("Бургер з подвійним мясом:");
            System.out.println("Булочка,мясо(подвійне),майонез,овочі,сир");
        } else if (!meat) {
            System.out.println("Бургер нормальний:");
            System.out.println("Булочка,мясо,майонез,овочі,сир");
        }
    }
}
