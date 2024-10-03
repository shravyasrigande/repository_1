class Solution {
    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE, b = Long.MIN_VALUE, c = Long.MIN_VALUE; 

        for (int num : nums) {
            // Skip duplicates
            if (num == a || num == b || num == c) {
                continue;
            }

            // Update the maximums
            if (num > a) {
                c = b; // Update c before b to preserve the order
                b = a; // Update b before a
                a = num; // Update a
            } else if (num > b) {
                c = b; // Update c before b
                b = num; // Update b
            } else if (num > c) {
                c = num; // Update c
            }
        }

        
        if (c == Long.MIN_VALUE) {
            return (int)a; 
        }

        return (int)c; 
    }
}
