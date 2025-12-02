package de.thm.mni.Day1;

public class passwordPartTwo {
    public int passwordTwo(String[] werte, int currentPos, int count) {

        for(String s : werte){
            String direction = s.substring(0, 1);
            int steps = Integer.parseInt(s.substring(1));

            for (int i =0; i< steps; i++){
                if(direction.equals("R")) {
                    currentPos++;
                    if (currentPos == 100) {
                        currentPos = 0;
                    }
                }else if (direction.equals("L")) {
                        currentPos--;
                        if (currentPos == -1) {
                            currentPos = 99;
                        }
                    }
                if (currentPos == 0) {
                    count++;
                }
            }
        }
        System.out.println("Password with every 0 is: " + count);
        return count;
    }
}

