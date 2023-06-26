/*Move Zeroes
Given an integer array nums, move all 0's to the end of it while 
maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
a. 1 <= nums.length <= 10^4
b. -2^31 <= nums[i] <= 2^31 - 1 */

package PPT.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_moveZero {

    static void moveZero(int nums[]){

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] != 0){
                    int temp =  nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter size of an Array");      
        int l = sc.nextInt();

        int nums [] = new int [l];

        System.out.println("Enter elements");
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        moveZero(nums);
    }
}
