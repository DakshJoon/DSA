import java.util.*;
public class StringAnsStringBuilder {
    public static void main(String[] args){
        // today we are going to learn about the String and String builders
        String a = "daksh";
        String b = "daksh";
        String e = a;
        System.out.println(a==b); // this will return true because the value is saved inside the pool
        System.out.println(e==a); 
        // lets see how can we compare 2 String
        // we can use ==
        String c = new String("daksh joon");
        String d = new String("daksh joon");
        System.out.println(c==d); // this will return false because the string value is saved outside the pool

        // what if we only wanna check values 
        System.out.println(c.equals(d)); // this will make comparison outside the pool
        System.out.println(c.charAt(0)); 
        String name = "Dakshjoon";
        System.out.println(name);

        System.out.println(Arrays.toString(new int[]{1,2,3,4})); // converting the object into string
        float about = 23.2329461f;
        System.out.printf("formatted number is %.2f", about); // this is a format statement and this will return value of about till 2 decimals
        System.out.println(); // this will add a new line in this method
        System.out.printf("pie : %.2f", Math.PI);
        System.out.println();
        System.out.printf("my name is %s and i am %s guy", "Daksh","cool"); // we can use this only if we put this in sequence in both the side
        System.out.println();
        System.out.println('a'+'b'); // this will convert the char value on int and the it will add them
        System.out.println("a"+"b"); // but in this case it will only join the value of a and b = ab
        // if we want to print the char we need to use the char 
        System.out.println((char)('a'+3)); // this will return the char d
        // but not in the case with string 
        System.out.println("A"+1); // integer will be converted into Integer that will call toString()
        // this is same as "A"+"1"

        // lets try some complex objects 
        System.out.println("daksh" + new ArrayList<>()); // this is empty Array so this will print empty [] with string
        System.out.println(new Integer(56) + "" + new ArrayList<>()); // this will return and Integer and a empty string and arraylist
        String sg = "";
        for(int i = 0; i<26; i++){
            char ans = (char)('a' + i);
            sg += ans; // this will add all the character together
        }
        System.out.println(sg); // this will take more time
        StringBuilder ak = new StringBuilder();
        for(int i = 0; i <26; i++){
            char ans = (char)('a' + i);
            ak.append(ans);
        }
        System.out.println(ak);  // this will take less time 
        // we can also reverse this method
        ak.reverse();
        System.out.println(ak);
        String name1 = "daksh Joon";
        System.out.println(Arrays.toString(name1.toCharArray()));
    }
}