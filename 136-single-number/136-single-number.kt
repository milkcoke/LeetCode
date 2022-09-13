class Solution {
    fun singleNumber(nums: IntArray): Int {
        val map : MutableMap<Int, Int> = mutableMapOf()
        nums.forEach { num->
            if (map.get(num) != null) {
                map[num] = map[num]!!.plus(1)
            } else {
                map[num] = 1
            }
        }

        for (entry in map.entries) {
            if (entry.value == 1) return entry.key
        }

        return 0
    }
}