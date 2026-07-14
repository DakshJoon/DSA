public class lootcode1 {
    public static void main(String[] args) {
        // today we are going to solve some problem in our vs code
        
        // problem 1672. richest customer wealth
        int[][] accounts = {{2,2,3},
                            {1,3,14}};
        // this is a 2d array which have two customer as we can see
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        // i = row, j = col
        int maximum = 0;
        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            // whem you start a new col take the sum for that row
            for(int j = 0; j<accounts[i].length;j++){
                sum += accounts[i][j];
                // now we have sum of accounts of a person
            }
            // here we will check if the sum is greater then macimum or not
            if (sum>maximum) {
                maximum = sum;
            }
        }
        return maximum;
    }
}
