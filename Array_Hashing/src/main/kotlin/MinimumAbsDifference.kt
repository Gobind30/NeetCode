import kotlin.math.abs

class MinimumAbsDifference {

    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        arr.sort()
        arr.forEach (::println)
        var mimAbsDiff = Int.MAX_VALUE
        for (i in 1 until arr.size) {
            mimAbsDiff = Math.min(mimAbsDiff, (arr[i] - arr[i-1]))
        }
        println("MIN_DIFF" + mimAbsDiff)


        var listPair =  ArrayList<ArrayList<Int>>()

        for (i in 1 until arr.size) {
            if (Math.abs(arr[i] - arr[i-1]) == mimAbsDiff) {
                var pair =  ArrayList<Int>(2)
                pair.add(Math.min(arr[i], arr[i-1]))
                pair.add(Math.max(arr[i], arr[i-1]))
                listPair.add(pair)
            }

        }

        return listPair
    }
}
