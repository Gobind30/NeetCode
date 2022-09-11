import sorting_algo.BubbleSort
import sorting_algo.InsertionSort
import sorting_algo.MergeSort
import sorting_algo.SelectionSort
import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {

    var intArray: IntArray = IntArray(10) {
        Random.nextInt(1, 100)
    }
    intArray.forEach (::println)


    val intArray1: IntArray = intArrayOf(0,2,34,0,4,5,7,23,12)

    println("SORTED ARRAY")


    MoveZeroes().moveZeroes(intArray1)

    intArray1.forEach (::println)
}
