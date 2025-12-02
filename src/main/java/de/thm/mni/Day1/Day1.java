package de.thm.mni.Day1;

public class Day1 {

    static void main() {
        ArrayGrabber grabber = new ArrayGrabber();
        passwordPartOne pw = new passwordPartOne();
        passwordPartTwo pwTwo = new passwordPartTwo();

        String[] werte = grabber.getArray("src/main/java/de/thm/mni/inputs/inputDay1");

        int currentPos = 50;
        int maxPos = 99;
        int minPos = 0;
        int count= 0;

        count = pw.passwordOne(werte,currentPos,count); //Day 1 Part 1
        count = pwTwo.passwordTwo(werte,currentPos,count); //Day 1 Part 2

    }
}
