class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       Deque<Integer> queue = new LinkedList<>();
        int[] result = new int[nums.length + 1 - k];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
        
            queue.addLast(i);
            
            while (!queue.isEmpty() && i - queue.peekFirst() + 1 > k) {
                queue.pollFirst();
            }
            if (i >= k - 1) {
                result[index] = nums[queue.peekFirst()];
                index++;
            }
        }
        return result;
    }
}
