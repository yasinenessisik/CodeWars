package org.example;

public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(0));
    }
    public static String makeReadable(int seconds) {

        int hours  = seconds / (60 * 60);
        seconds = seconds % (60 * 60);

        int minutes  = seconds / (60);
        seconds = seconds % (60);


        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
    }
}