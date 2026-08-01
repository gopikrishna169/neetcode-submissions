class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxReps = 0;
        int prevMax = 0;
        for(int num: nums) {
            if (num == 1) {
                maxReps++;
            } else {
                if (prevMax < maxReps) {
                    prevMax = maxReps;
                }
                maxReps = 0;
            }
        }
        if (maxReps<prevMax) {
            return prevMax;
        }
        return maxReps;
    }
}