package sorting_algo

class PivotIndex {

    fun pivotIndex(nums: IntArray): Int {
        var pivotIn = -1

        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
        }

        for (i in nums.indices) {
            pivotIn =
                if ((nums[nums.size -1] - nums[0] == 0) ||
                    (i != 0 && (nums[nums.size -1] - nums[i] == nums[i - 1])))
                    return i else -1
        }

        return pivotIn
    }
}