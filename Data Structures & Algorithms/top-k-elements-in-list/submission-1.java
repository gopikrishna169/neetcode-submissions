class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> res = new HashMap<>();
        for(int x: nums) {
            res.put(x, res.getOrDefault(x,0) + 1);
        };
        return res.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue())).limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
