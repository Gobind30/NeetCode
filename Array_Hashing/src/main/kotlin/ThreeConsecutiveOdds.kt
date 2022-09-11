class ThreeConsecutiveOdds {

    fun threeConsecutiveOdds(arr: IntArray): Boolean {

        if (arr.size < 3) {
            return false
        }

        for (i in 1 until arr.size - 1) {
            if (arr[i - 1] % 2 != 0 && arr[i] % 2 != 0 && arr[i + 1] % 2 != 0) {
                return true
            }
        }
        return false
    }
}