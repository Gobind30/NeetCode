package sorting_algo

class BubbleSort : Sort{

    // Place the largest element in end

    override fun sort(randomArray: IntArray): IntArray {

        for (i in randomArray.indices) {
            for (j in 0 until (randomArray.size -1 - i)) {
                if (randomArray[j] > randomArray[j + 1]) {
                    val temp = randomArray[j]
                    randomArray[j] = randomArray[j + 1]
                    randomArray[j + 1] = temp
                }
            }
        }

        return randomArray
    }

}