class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("Pen is ball point "+colour+" "+type);
    }
    Pen(){
        System.out.println("This is Default Constructor");
    }
}
class Student{
    String name;
    int age;
    public void Info(String name){
        System.out.println("Name is "+name);
    }
    public void Info(int age){
        System.out.println("Age is "+age);
    }
}
class Shape{
    String colour;
    public void area(){
        System.out.println("Area in Shape class");
    }
}
class Triangle extends Shape{
    public void area(){
        System.out.println("Area in Triangle class");
    }
}
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("This is animal constructor");
    }
}
class Horse extends Animal{
    public  void walk(){
        System.out.println("Walk on 4 legs");
    }
    Horse(){
        System.out.println("This is horse constructor");
    }
}
class Hen extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
interface Animal2{
    public void walk();
}
class inte implements Animal2{
    public void walk(){
        System.out.println("This is klhkuv");
    }
}

public class Lecture24 {
    public static void main(String[] args) {
        //Classes and Objects
        // Pen p = new Pen();
        // p.colour = "Red";
        // p.type = "Gel";
        // p.write();

        // Pen p2 = new Pen();
        // p2.colour = "Green";
        // p2.type = "Ballpoint";
        // p2.write();
         /*Polymorphism----

         Compile-time poly
         Run-time poly

        */
        // Student s1 = new Student();
        // s1.name = "Sanyam";
        // s1.age = 19;
        // s1.Info(s1.name);
        // s1.Info(s1.age);

        //Inheritance
        // Shape s1 = new Shape();
        // s1.area();
        //
    //     Animal an = new Animal();
    //     an.walk();
    //     Horse h1 = new Horse();
    //     h1.walk();
        inte i = new inte();
        i.walk();

    }
}
