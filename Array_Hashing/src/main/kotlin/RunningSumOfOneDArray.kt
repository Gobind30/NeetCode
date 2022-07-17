class RunningSumOfOneDArray {

    fun runningSum(nums: IntArray): IntArray {
        //var runningSumArray: IntArray = IntArray(nums.size)
        for (i in nums.indices) {
            if (i == 0) {
                continue
            } else {
                nums[i] += nums[i-1]
            }
        }
        return nums
    }
}