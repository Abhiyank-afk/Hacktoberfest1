class Solution {
    public long minOperations(int[][] queries) {
        long totalOps = 0;
        
        for (int[] query : queries) {
            int l = query[0], r = query[1];
            for (int x = l; x <= r; x++) {
                totalOps += operationsToZero(x);
            }
        }
        
        return totalOps;
    }

    // count how many times to divide by 4 until 0
    private int operationsToZero(int x) {
        int ops = 0;
        while (x > 0) {
            x /= 4;
            ops++;
        }
        return ops;
    }
}
