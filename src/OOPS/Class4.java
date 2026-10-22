package OOPS;


public class Class4 {
    public static void main(String[] args) {
        A obj = new A(34, "Daksh");
        // access the data members using 
        // modify the data members 
        System.out.println(obj.getNum());
        
    }
}

class A {
    private int num;
    String name;
    int[] arr;

        public int getNum() {
            return num;
        }

        public void setNum(int num) { 
            this.num = num;
        }

    A(int num, String name) { 
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}
