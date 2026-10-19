package OOPS;

public class Classs2 {
    public static void main(String[] args) {
        Human daksh = new Human(17, "daksh", 10000, false);
        Human rahul = new Human(19, "Rahul", 14000, true);

        System.out.println(daksh.married);
        System.out.println(rahul.salary); 
        // static variable are not dipendent on objects 

        System.out.println(Human.population); 
        System.out.println(Human.population);
        
        
        Marks Aakash = new Marks("Aakash", 80, 50, 70, 90, 60);
        Marks Manav = new Marks("Manav",95 , 81, 85, 80, 71);
        System.out.println(Marks.marksTotal(Aakash)); // this will give us the total percentage
        System.out.println(Marks.marksTotal(Manav)); // manav's marks total will we returned
        
        
    }

    static void fun(){
        // we cannot access non static with out referencing their instances in a static context
        // here, we are referencing it 
        Classs2 ans = new Classs2();
        ans.greeting();
    }
    void greeting (){
        System.out.println("hello guys");
    }
}

class Human {
    int age;
    String name; 
    int salary;
    boolean married;
    static long population = 1;


    Human (int age, String name, int salary , boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married; 
        Human.population += 1;


    }
}
class Marks {
    String name;
    double physics;
    double chemistry;
    double english;
    double math;
    double music;

    Marks(String name, double physics, double chemistry, double english, double math, double music){
        this.name = name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.english = english;
        this.math = math;
        this.music = music;
    }

    static double marksTotal(Marks name){
        double marks = name.chemistry + name.english + name.physics + name.math + name.music; 
        double ans = marks / 5.0;
        return ans;

    }
}
