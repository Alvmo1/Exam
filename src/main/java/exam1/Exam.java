package exam1;

import java.util.Random;
import java.util.function.Function;

public class Exam {
    public static void main(String[] args) {
        int[] myNumbers = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(oddNumbers(myNumbers));
        System.out.println(getSum(myNumbers));
        System.out.println(getAverage(myNumbers));
        int[] numbers = {1,2,3,4,5,6};
        System.out.println(generateRandomNumber(numbers));
        int[] sumNumbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumEvenNumbers(sumNumbers));
        double sideLength = 4;
        System.out.println(calculateCube(sideLength));
        System.out.println(characterCounters("Mellow"));
        System.out.println(isPalindrome("Madam"));



    }

    public static String oddNumbers(int[] numbers) {
        String unevenNumbers;
        unevenNumbers = new String();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0){
                unevenNumbers += (numbers[i] + ",");
            }
        }

        return unevenNumbers.substring(0,unevenNumbers.length()-1);
    }
    public static int getSum(int[] ints) {
        int myNumbersSum = 0;

        for (int i = 0; i < ints.length; i++) {
            myNumbersSum += ints[i];
        }
        return myNumbersSum;
    }
    public static int getAverage(int[] ints) {
        int myNumberSum = 0;
        for (int i = 0; i < ints.length; i++) {
            myNumberSum += ints[i];
        }
        return myNumberSum / ints.length;
    }

    public static int generateRandomNumber(int[] random) {
        int i = 1;
        int x = 6;
            return (int) (Math.floor(Math.random() * (6 - 1 + 1) ) + 1);
        }

        public static int sumEvenNumbers(int[] ints) {
        int sumNumbers = 0;
        for (int i = 0; i <=  ints.length; i += 2) {
            sumNumbers += i;
        }
            return sumNumbers;
        }

        public static double calculateCube(double sideLength) {
        return Math.pow(sideLength, 3);
        }

        public static int characterCounters(String str){
        int characterCounter = 0;
        char[] characterArray = str.toCharArray();
        for (int i = 0; i < characterArray.length; i++){
            characterArray[i] = Character.toLowerCase(characterArray[i]);
            if(characterArray[i] == 'l'){
                characterCounter++;
            }

        }
            return characterCounter;
        }

       public static boolean isPalindrome(String str){
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
            str = str.toLowerCase();
            if (str.equals(rev)){
                ans = true;
            }
        }
           return ans;
       }


       }



