class RunningSumOfOneDArray {

    fun runningSum(nums: IntArray): IntArray {
        //var runningSumArray: IntArray = IntArray(nums.size)
        for (i in 1 until nums.size) {
            nums[i] += nums[i-1]

        }
        return nums
    }
}