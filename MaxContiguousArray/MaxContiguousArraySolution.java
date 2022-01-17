//Find the contiguous subarray within an array, A of length N which has the largest sum

//Problem Constraints:
//1 <= N <= 1e6 , -1000 <= A[i] <= 1000

//Input 1: A = [1, 2, 3, 4, -10] 
//Output 1: 10   {1,2,3,4}

//Input 2: A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 
//Output 2:6  {4, -1, 2, 1}

public class Solution {
    
    public int maxSubArray(final int[] A) {
        int length = A.length;
        int ans = - Integer.MIN_VALUE;
        int sum =0;

        for (int i=0;i<length;i++){
            sum += A[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        return ans;
    }
}

//  Time Complexity: O(N)
// Space Complexity: O(1)
