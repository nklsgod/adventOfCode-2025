package de.thm.mni;

import java.lang.reflect.Array;

public class Main {
    static void main() {
       ArrayGrabber grabber = new ArrayGrabber();
        String[] werte = grabber.getArray("src/main/java/de/thm/mni/inputs/input");


        int currentPos = 50;
        int maxPos = 99;
        int minPos = 0;
        int count= 0;

        for (String s : werte) {
            String direction = s.substring(0, 1);
            int steps = Integer.parseInt(s.substring(1));
            if (steps > 99) {
                steps = steps % 100;
            }
            if (direction.equals("R")) {
                if (currentPos + steps < 99) {
                    currentPos += steps;
                } else {
                    currentPos += steps;
                    currentPos -= 100;
                }
            } else if (direction.equals("L")) {
                if (currentPos - steps > 0) {
                    currentPos -= steps;
                } else {
                    currentPos -= steps;
                    currentPos = 100 + currentPos;
                }
            }
            if (currentPos == 100) {
                currentPos = 0;
            }
            if (currentPos == 0) {
                count++;
            }
            System.out.println("The dial is rotated " + s + " to point at " + currentPos);
        }
        System.out.printf("Password is: " + count);
        }
    }
