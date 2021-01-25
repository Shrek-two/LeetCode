// 556. Next Greater Element III
// https://leetcode.com/problems/next-greater-element-iii/
// January 21 2021


// Given a positive integer n, find the smallest integer which has exactly
// the same digits existing in the integer n and is greater in value than n.
// If no such positive integer exists, return -1.

class Solution {
    public int nextGreaterElement(int n) {
        int tempNum = n;
        int count;
        int[] digits = new int[100];
        
        while(tempNum > 10 && count <= 99){             // extract digits from integer input
            int digit = tempNum % 10;                   // and put them into an array
            digits[count] = digit;
            count++; 
        }
        digits += tempNum;

        for (int i = 0; i < digits.length(); i++){
            System.out.print(digits[i]);
        }
    }

    public static void main(String[] args) {
        nextGreaterElement(54321);
    }
}