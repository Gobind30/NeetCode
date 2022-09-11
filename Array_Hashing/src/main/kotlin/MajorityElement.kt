class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate: Int? = null
        for (num in nums) {
            if (count == 0) {
                candidate = num
            }
            count += if (num == candidate) 1 else -1
        }
        return candidate!!
    }
}

// [0,1,0,3,12]
//  1 0 0 3 12
//  1 3 0 0 12
//  1 3 12 0 0