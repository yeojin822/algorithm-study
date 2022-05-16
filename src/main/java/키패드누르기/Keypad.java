package 키패드누르기;

import java.util.Arrays;
import java.util.Locale;

public class Keypad {
    public String solution(int[] numbers, String hand) {
        String[] keypad = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
        int l = 9;
        int r = 11;
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                l = Arrays.binarySearch(keypad, Integer.toString(numbers[i]));
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                r = Arrays.binarySearch(keypad, Integer.toString(numbers[i]));
            } else {

                int key = Arrays.asList(keypad).indexOf(Integer.toString(numbers[i]));
                System.out.println(" ## " + l + " / " + r);
                if ((Math.abs(l - r) != 2  && Math.abs(key - l) > Math.abs(key - r)) || (r + 3) == key) {
                    answer += "R";
                    r = Arrays.asList(keypad).indexOf(Integer.toString(numbers[i]));
                    System.out.println("R 추가 :: " + numbers[i] + " ## " + l + " / " + r);
                } else if ((Math.abs(l - r) != 2  && Math.abs(key - l) < Math.abs(key - r)) || (l + 3) == key) {
                    answer += "L";
                    l = Arrays.asList(keypad).indexOf(Integer.toString(numbers[i]));
                    System.out.println("L 추가 :: " + numbers[i] + " ## " + l + " / " + r);

                } else if (Math.abs(key - l) == Math.abs(key - r) || Math.abs(l - r) == 2) {
                    System.out.println("위치가 같다!!!");
                    answer += hand.equals("left") ? "L" : "R";
                }
            }

        }

        return answer;
    }
}
