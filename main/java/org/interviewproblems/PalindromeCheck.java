package org.interviewproblems;

public class PalindromeCheck {

    public static void main(String[] args) {
        palindromeCheckWithBuiltInMethods("A man a plan a canal Panama");
    }

    public static void palindromeCheckWithBuiltInMethods(String str){
        String newStr = str.replaceAll("\\s","").toLowerCase();
        boolean isPalindrome = newStr.equals(new StringBuilder(newStr).reverse().toString());
        System.out.println(isPalindrome);
    }

    public static void palindromeCheckWithoutBuiltInMethods(String str){
        String newStr = str.replaceAll("\\s","").toLowerCase();
        boolean isPalindrome = newStr.equals(new StringBuilder(newStr).reverse().toString());
        System.out.println(isPalindrome);
    }
}
