package OOPS;

public class Class3c {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes triangle = new Triangle();
        Shapes square = new Square();
        square.area();
        shape.area();
        circle.area();
        triangle.area();

        
    }
}

class Shapes { 
    void area() {
        System.out.println("i am in shapes");
    }
}
class Circle extends Shapes {
    @Override // this is called annotatioa
    void area() {
        System.out.println("Area is pi*r^2");
    }
}
class Triangle extends Shapes {
    void area() {
        System.out.println("Area is half of base / height");
    }
}
class Square extends Shapes {
    void area() {
        System.out.println("Area is Side^2");
    }
}
