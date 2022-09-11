package sorting_algo

class MergeSort : Sort {


    override fun sort(randomArray: IntArray): IntArray {

        divideArray(randomArray, left = 0, right = randomArray.size)

        return randomArray
    }


    // Divide the array until l < r
    fun divideArray(randomArray: IntArray, left: Int, right: Int) {
        println("Left = $left Right = $right")
        if (left < right) {
            val mid = (left + right) / 2
            println("Mid = $mid")
            divideArray(randomArray, left, mid)
            divideArray(randomArray, mid + 1, right)
            mergeArray(randomArray, left, mid, right)
        }
    }

    private fun mergeArray(randomArray: IntArray, left: Int, mid:Int, right: Int) {

    }


}