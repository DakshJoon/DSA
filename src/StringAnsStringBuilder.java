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
    }
}