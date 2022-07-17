fun main(args: Array<String>) {

    var intArray: IntArray = IntArray(5)
    intArray[0] = 10
    intArray[1] = 20
    intArray[2] = 30
    intArray[3] = 40
    intArray[4] = 50

    var array = RunningSumOfOneDArray().runningSum(intArray)

    for (i in array)
        println(i)

}
