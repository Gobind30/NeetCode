class JewelsAndStones {

    fun numJewelsInStones(jewels: String, stones: String): Int {

        var num = 0
        var jewelsSet = jewels.toSet()
        for(s in stones) {
            if (jewelsSet.contains(s)) ++num
        }
        return num
    }
}