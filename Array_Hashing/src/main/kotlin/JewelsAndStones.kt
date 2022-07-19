class JewelsAndStones {

    fun numJewelsInStones(jewels: String, stones: String): Int {

        var count = 0
        for (s in jewels) {
             count += stones.count { (it == s) }
        }
        return count
    }
}