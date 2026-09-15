import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args){
        subseq("", "abc");
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        System.out.println(subseq1("", "abc", list));
        System.out.println(subseq2("", "abc"));

    }
    public static void subseq(String p , String up){ // using void method 
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p , up.substring(1));
    }
    public static ArrayList<String> subseq1(String s, String up, ArrayList<String> list){ // using ArrayList<String> in the Argument 
        if(up.isEmpty()){
            list.add(s);
            return list;
        }

        char ch = up.charAt(0);
        subseq1(s+ch, up.substring(1), list);
        subseq1(s , up.substring(1), list);
        return list;
    }
    

    public static ArrayList<String> subseq2(String s, String up){ // returning ArrayList<String> only by creating it in the body
        ArrayList<String> list  = new ArrayList<>();
        if(up.isEmpty()){
            list.add(s);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(s+ch, up.substring(1));
        ArrayList<String> right = subseq2(s , up.substring(1));
        
        left.addAll(right);
        return left;
    
    }
}
