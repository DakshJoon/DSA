class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        return letterCombinations("", digits);
    }
    private List<String> letterCombinations(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }

        String letters = lettersFor(up.charAt(0));
        if (letters.isEmpty()) {
            return new ArrayList<>();
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            ans.addAll(letterCombinations(p + letters.charAt(i), up.substring(1)));
        }

        return ans;
    }

    private String lettersFor(char digit) {
        switch (digit) {
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default: return "";
        }
    }
}