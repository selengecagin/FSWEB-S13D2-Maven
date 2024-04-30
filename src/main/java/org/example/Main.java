package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public boolean isPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }


    public boolean isPerfectNumber(int number) {

        if (number <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
    }

    public String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String[] digitWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";

        while (number > 0) {
            int digit = number % 10;
            result = digitWords[digit] + " " + result;
            number /= 10;
        }

        return result.trim();
    }

}
