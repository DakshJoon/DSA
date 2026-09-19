import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args){
        permutation("", "abc");
        System.out.println();
        System.out.println(permutationList("", "abc"));
        System.out.println(permutationsCount("", "abc"));
    }

    public static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + ", ");
            return;
        }

        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutation(first + ch + second, up.substring(1));
        }
    }

    public static ArrayList<String> permutationList(String s, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= s.length(); i++){
            String first = s.substring(0, i);
            String second = s.substring(i, s.length());
            ans.addAll(permutationList(first + ch + second, up.substring(1))); 
        }

        return ans;
    }

    public static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++){
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count += permutationsCount(first + ch + second, up.substring(1));

        }
        return count;
    }
}
