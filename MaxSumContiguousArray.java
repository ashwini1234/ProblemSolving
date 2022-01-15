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
