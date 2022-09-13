class Solution {
    fun singleNumber(nums: IntArray): Int {
        // other values appears twice
        val set = mutableSetOf<Int>()
        nums.forEach { num->
            if (set.contains(num)) set.remove(num)
            else set.add(num)
        }

        return set.single()
    }
}