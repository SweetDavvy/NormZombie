//public class Cat extends Animal{
//    public Cat() {
//        //хищник, питается мясом и молоком
//        super(false, "milk and meat");
//    }
//
//    public void sound(){
//        System.out.println("Meow");
//    }
//}

//class Zombie extends Monster {
//    private int damage;
//    private String name;
//    private String sound;
//
//    public Zombie(int damage, String name,String sound) {
//        super(name,damage);
//        this.damage = damage;
//        this.name = name;
//        this.sound = sound;
//
//    }
//
//    @Override
//    public void attack() {
//        System.out.println("Monster " + name + " the Zombie was created");
//        System.out.println("Monster "+ name + " the Zombie attacked with damage " + damage);
//
//    }
//    public void growl() {
//        System.out.println(sound + " " + name + " the Zombie growled");
//
//    }
//
//
//}
public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    @Override
    public void growl(){
        System.out.print("Raaaauuughhhh");
        super.growl();
    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }

}


//class ColorPoint extends Point {
//    private String color;
//    public ColorPoint(double x, double y, String color) {
//        super(x, y);
//        this.color = color;
//    }
//    public void print(){
//        // Печатаем координаты
//        super.print();
//        // Печатаем цвет
//        System.out.println(" and color " + color);
//    }
//}