import sorting_algo.BubbleSort
import sorting_algo.InsertionSort
import sorting_algo.SelectionSort
import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {

    var intArray: IntArray = IntArray(10) {
        Random.nextInt(1, 100)
    }
    intArray.forEach (::println)

    println("SORTED ARRAY")

    InsertionSort().sort(intArray)

    intArray.forEach (::println)

}
