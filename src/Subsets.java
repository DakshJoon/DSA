import java.util.*;

public class Subsets {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> list = subsets(arr);

        for(List<Integer> ans : list){
            System.out.println(ans);
        
        }

        int[] arr1 = {1,2,2};
        List<List<Integer>> list1 = subsetaDuplicate(arr1);

        for(List<Integer> ans1 : list1){
            System.out.println(ans1);
        }
    }

    public static List<List<Integer>> subsets(int[] array){ // finding subseta using List<List<Integer>> 
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : array){
            int n = outer.size();

            for(int i = 0; i< n ; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static List<List<Integer>> subsetaDuplicate(int[] array){
        Arrays.sort(array);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i = 0; i < array.length; i++ ){
            start = 0;
            // if current and previous elements are same , s = e + 1;
            if(i > 0 && array[i] == array[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

            for(int j = start; j< n ; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(array[i]);
                outer.add(internal);
            }
        }
        return outer; 
    }
}

