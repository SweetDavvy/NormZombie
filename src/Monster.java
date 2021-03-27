//public class Animal {
//    private boolean vegetarian;
//    private String eats;
//
//
//
//    public Animal(boolean veg, String food){
//        this.vegetarian = veg;
//        this.eats = food;
//        System.out.println("Creature was created");
//    }
//
//    public void sound(){
//    }
//
//    public boolean isVegetarian() {
//        return vegetarian;
//    }
//
//    public String getEats() {
//        return eats;
//    }
//}


class Monster {
    public String name;
    public int damage;
    Monster(String name,int damage){
        System.out.println("Monster " + name + " was created");
        this.damage = damage;
        this.name = name;
    }

    public void attack(){
        System.out.println("Monster Bob the Zombie attacked with damage " + damage);
    }

    public void growl(){
        System.out.print(" " + name + " growled");
    }

}


//class Point {
//    private double x, y;
//    public Point(double x, double y) {
//
//        this.x = x;
//        this.y = y;
//    }
//    public void print() {
//        System.out.print("Point with coords " + x + ", " + y);
//    }
//}
