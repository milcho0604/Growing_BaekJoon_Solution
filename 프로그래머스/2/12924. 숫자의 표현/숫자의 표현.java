class Solution {
    public int solution(int n) {
        int[] nums = new int[n];

        for (int i =0; i < nums.length; i++) {
            nums[i] = i+1;
        }

        int start = 0;
        int end = 0;
        int sum = nums[0];
        int count =0;
        while (end < nums.length) {
            if (sum == n) {
                count ++;
                sum -= nums[start];
                start++;
            } else if (sum < n) {
                end++;
                if (end < nums.length) {
                    sum += nums[end];
                }
            } else {
                sum -= nums[start];
                start++;
            }
        }
        return count;
    }
}