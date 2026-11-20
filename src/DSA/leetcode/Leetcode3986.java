package DSA.leetcode;

public class Leetcode3986 { 
    public static void main(String[] args) {
        System.out.println(secondsBetweenTimes("01:00:00", "01:00:25"));
        System.out.println(secondsBetweenTimes("12:34:56", "13:00:00"));
    }
    public static int secondsBetweenTimes(String startTime, String endTime) {
        int start = toSeconds(startTime);
        int end = toSeconds(endTime);
        return end - start;
    }

    private static int toSeconds(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }
}
