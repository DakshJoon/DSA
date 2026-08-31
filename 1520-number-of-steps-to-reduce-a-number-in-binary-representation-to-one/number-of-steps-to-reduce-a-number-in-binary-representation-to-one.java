class Solution {
    public int numSteps(String s) {
        int steps = 0;

        while (s.length() > 1) {
            if (s.charAt(s.length() - 1) == '0') {
                s = s.substring(0, s.length() - 1); // divide by 2
            } else {
                s = addOne(s); // add 1 to the binary string
            }
            steps++;
        }

        return steps;
    }

    public static String addOne(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = sb.length() - 1;

        while (i >= 0 && sb.charAt(i) == '1') {
            sb.setCharAt(i, '0');
            i--;
        }

        if (i >= 0) {
            sb.setCharAt(i, '1');
            return sb.toString();
        }

        sb.insert(0, '1');
        return sb.toString();
    }
}