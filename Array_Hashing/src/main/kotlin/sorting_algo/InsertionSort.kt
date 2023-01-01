package sorting_algo

class InsertionSort : Sort {

    override fun sort(randomArray: IntArray): IntArray {

        // 9 8 5 7
        // i = 1, j = 0 key 8
        // 8 9 5 7
        // i = 2, j = 1 key 5
        //  5 7 8 9 1

        // i = 3, j = 2, key 7


        // Using 2 for loop
//        for (i in 1 until randomArray.size) {
//            val key = randomArray[i]
//            var pos: Int? = null
//            for (j in (i - 1) downTo 0) {
//                if (key < randomArray[j]) {
//                    randomArray[j + 1] = randomArray[j]
//                    pos = j
//                }
//            }
//            if (pos != null) {
//                randomArray[pos] = key
//            }
//        }

        // using for and while loop

        for (i in 1 until randomArray.size) {
            val key = randomArray[i]
            var j = i -1
            while (j >= 0 && key < randomArray[j]) {
                randomArray[j+1] = randomArray[j]
                j -= 1
            }
            randomArray[j+1] = key
        }
            return randomArray
        }
    }