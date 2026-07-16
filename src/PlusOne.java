
//66. Plus One

public class PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            for(int i = digits.length - 1; i >= 0; i--){
                if(digits[i] < 9){
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int arr[] = new int[digits.length + 1];
            arr[0] = 1;
            return arr;
        }
    }

}

//# LeetCode 66 – Plus One (Java)
//
//## Idea
//
//Treat the array as a large number and add **1**.
//
//        ## Steps
//
//1. Start from the **last digit**.
//        2. If the digit is **less than 9**:
//
//        * Increase it by **1**.
//        * Return the array.
//3. If the digit is **9**:
//
//        * Change it to **0**.
//        * Carry `1` to the previous digit.
//        4. If all digits are **9**:
//
//        * Create a new array of size `n + 1`.
//        * Set the first element to `1`.
//        * Remaining elements stay `0`.
//
//        ## Code Pattern
//
//```java
//for (int i = digits.length - 1; i >= 0; i--) {
//        if (digits[i] < 9) {
//digits[i]++;
//        return digits;
//    }
//digits[i] = 0;
//        }
//
//int[] ans = new int[digits.length + 1];
//ans[0] = 1;
//        return ans;
//```
//
//        ## Example
//
//Input:
//
//        ```
//        [1,2,3]
//        ```
//
//Output:
//
//        ```
//        [1,2,4]
//        ```
//
//Input:
//
//        ```
//        [9,9,9]
//        ```
//
//Output:
//
//        ```
//        [1,0,0,0]
//        ```
//
//        ## Remember Trick
//
//* **Start from the end.**
//        * **If digit < 9 → add 1 and return.**
//        * **If digit == 9 → make it 0 and continue.**
//        * **If every digit was 9 → create a new array with leading 1.**
//
//        ## Time Complexity
//
//* **O(n)**
//
//        ## Space Complexity
//
//* **O(1)** (Only `O(n)` when a new array is created.)

