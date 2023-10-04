package com.example;

public class FunctionsAssignment {

    // TODO: Implement a method that accepts two integers as parameters and returns
    // their sum
    public int sum(int a, int b) {
        int result = a+b;
        return result; // Replace with your implementation
    }

    public String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    } // Replace with your implementation
    

    // TODO: Implement a method to return a greeting message of the format: "Hello, John!"
    public String greeting(String name) {
        return "Hello, " + name + "!"; // Replace with your implementation
    }

    // TODO: Implement a method that accepts an array of integers and returns the
    // maximum value
    public int findMax(int[] arr) {
        int max = arr[0]; 
        for (int num : arr) {
        if (num > max) {
            max = num;
            }
        }
    return max;
    }
    

    // TODO: Implement a method that accepts a string and returns true if it is a
    // palindrome, false otherwise
    public boolean isPalindrome(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false; // Characters at the current positions don't match
        }
        left++;
        right--;
    }

    return true; // All characters matched, so it's a palindrome
}

    // TODO: Implement a method to find the longest word in a string
    public String findLongestWord(String str) {
       String[] word_array = str.split("\\s+");
       String longestword = "";
       for (String word : word_array){
        if (word.length()>longestword.length()){
            longestword = word;
        }
       }
       return longestword;
    }  

    // TODO: Implement a method to calculate the average of an array of numbers
    public double calculateAverage(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length;i++){
            total += nums[i];
        }
        int ave=total/nums.length;
        return ave; // Replace with your implementation

    }
// TODO: Implement a method to check if a number is prime
public boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    if (num <= 3) {
        return true;
    }
    
    if (num % 2 == 0 || num % 3 == 0) {
        return false;
    }
    
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0) {
            return false;
        }
    }
    
    return true;
}

    // TODO: Implement a method to calculate the power of a number
    public double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // TODO: Implement a method to count the occurrences of a character in a string
    public int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        
        return count;
    }
    

    // TODO: Implement a method to find the largest number in an array
    public int findLargestNumber(int[] nums) {
        int maxnum = nums[0];
        for(int i =0; i< nums.length; i++){
            if (maxnum < nums [i]){
                maxnum = nums[i];
            }  
        }
        return maxnum; // Replace with your implementation
    }

    // TODO: Implement a method to calculate the sum of an array
    public int calculateArraySum(int[] nums) {
        int sum=0;
        for (int num: nums) {
            sum +=num;
        }
        return sum;

    }
        


    }

    

