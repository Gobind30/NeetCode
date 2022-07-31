package sorting_algo

class SelectionSort : Sort {

    override fun sort(randomArray: IntArray): IntArray {

        for (i in randomArray.indices) {
            for (j in (i + 1) until (randomArray.size)) {
                if (randomArray[i] > randomArray[j]) {
                    val temp = randomArray[j]
                    randomArray[j] = randomArray[i]
                    randomArray[i] = temp
                }
            }
        }

        return randomArray
    }
}