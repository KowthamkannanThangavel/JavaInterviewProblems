package org.interviewproblems;

public class ReverseString
{
    public static void main( String[] args )
    {
        reverseString("Hello");
    }

    public static void reverseString(String str){
        String reverseString = "";
        for(int i = str.length()-1; i>=0;i--){
            reverseString +=str.charAt(i);
        }
        System.out.println(reverseString);
    }
}
