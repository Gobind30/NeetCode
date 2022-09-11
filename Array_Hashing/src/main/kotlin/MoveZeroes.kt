class MoveZeroes {

    fun moveZeroes(nums: IntArray): Unit {

        var slow = 0
        var fast = 1


       while (fast < nums.size) {
           if (nums[slow] == 0 && nums[fast] == 0) {
               fast++
           } else if (nums[slow] == 0 && nums[fast] != 0) {
               nums[slow] = nums[fast]
               nums[fast] = 0
               slow++
               fast++
           } else {
               slow++
               fast++
           }

       }

    }
}