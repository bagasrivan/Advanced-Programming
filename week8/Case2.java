package week8;

import java.util.*;

public class Case2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Input = ");
        String inputStr = input.nextLine().replaceAll("\\s+", "");

        ArrayList<Character> inputList = new ArrayList<>();
        for (char c : inputStr.toCharArray()) {
            inputList.add(c);
        }

        int n = inputList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                char first = inputList.get(j);
                char second = inputList.get(j + 1);
                char temp;
                if (compareChars(first, second) > 0) {
                    temp = first;
                    inputList.set(j, second);
                    inputList.set(j + 1, temp);
                }
            }
        }

        System.out.println("Output After Sorting = ");
        for (char ch : inputList) {
            System.out.print(ch);
        }

    }

    public static int compareChars(char a, char b) {
        if (Character.isUpperCase(a) && Character.isUpperCase(b)) {
            return a - b;
        } else if (Character.isLowerCase(a) && Character.isLowerCase(b)) {
            return a - b;
        } else if (Character.isDigit(a) && Character.isDigit(b)) {
            return a - b;
        } else if (Character.isUpperCase(a) && Character.isLowerCase(b)) {
            return -1;
        } else if (Character.isLowerCase(a) && Character.isUpperCase(b)) {
            return 1;
        } else if (Character.isLetter(a) && Character.isDigit(b)) {
            return 1;
        } else if (Character.isDigit(a) && Character.isLetter(b)) {
            return -1;
        } else {
            return 0;
        }
    }
}
