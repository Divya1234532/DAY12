/*class Solution {
    public boolean canJump(int[] arr) {
        int n=arr.length;//5
        int target=n-1;//4
        for(int i=0;i<n;i++)//0
        {
            for(int j=i+1;j<=i+arr[i] && j<n;j++)//0
            {
                if(j==target)
                {
                    return true;
                }
            }
        }
        return n==1;
    }
}
class Solution {
    public boolean canJump(int[] arr) {
        int n = arr.length;
        int target = n - 1;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j <= i + arr[i] && j < n; j++) {
                if(j == target) {
                    return true;
                }
            }
        }
        return n == 1;
    }
}*/
class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i > maxReach) 
                return false;

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
