class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1 = stringToInt(event1[0]);
        int end1 = stringToInt(event1[1]);
        int start2 = stringToInt(event2[0]);
        int end2 = stringToInt(event2[1]);
        return start1 <= end2 && start2 <= end1;
    }
    public static int stringToInt(String s) {
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        return hours * 60 + minutes;
    }
}