package OOPS;


import java.util.Arrays;
import java.util.List;

public class Class6 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.set(0, 23);
        // list.size();
        // list.isEmpty();

        CustomArrayList list = new CustomArrayList();
        list.add(5);
        list.add(10);
        list.add(11);
        for(int i = 1; i < 18; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove(7);
        System.out.println(list);

        CustomGenArrayList<Integer> ans = new CustomGenArrayList<>();
        ans.add(13);
        ans.add(12);
        ans.remove(0);
        ans.get(1);
        ans.set(2, 23);
        

    }
}

class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE= 10;
    private int size = 0; // also working as index value

    CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int number) {
        if(this.isFull()) {
            reSize();
        }
        data[size++] = number;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void reSize() {
        int[] temp = new int[data.length * 2];
        // copy the current elements in new array
        for(int i = 0; i < data.length; i++) { 
            temp[i] = data[i];
        }
        data = temp;
    }
    
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        int removed = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = 0;
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size(int size) {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList { " + "data = " + Arrays.toString(data) + ", size = " + size + " }" ;
    }
}

class CustomGenArrayList <T extends Number> { // Here T should be Number or it's subclass

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomGenArrayList () {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
        // 
    }
    public void add(T object) {
        if(this.isFull()) {
            reSize();
        }
        data[size++] = object;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void reSize() {
        Object[] temp = new Object[data.length * 2];
        // copy the current elements in new array
        for(int i = 0; i < data.length; i++) { 
            temp[i] = data[i];
        }
        data = temp;
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        T removed = (T) data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        return removed;
    }

    public Object get(int index) {
        return data[index];
    }

    public int size(int size) {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList { " + "data = " + Arrays.toString(data) + ", size = " + size + " }" ;
    }
}
