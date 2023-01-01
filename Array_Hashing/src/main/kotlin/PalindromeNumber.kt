class PalindromeNumber {

//    fun isPalindrome(x: String): Boolean {
//        if (x<0) {
//            return false
//        } else if(x in 0..9) {
//            return true;
//        } else {
//            var str = x.toString()
//            for (i in str.indices) {
//                if (str[i] == str[str.length - i - 1]) {
//                    continue
//                } else {
//                    return false
//                }
//            }
//        }
//        return true
//    }


    fun isPalindrome(x: Int): Boolean {
        var x = x
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false
        }                      // x = 1235321 -> 123532 -> 12353 -> 1235 -> 123
        var reverseNumber = 0 //            0 ->      1 ->    12 ->  123 -> 1235
        while (x > reverseNumber) {
            reverseNumber = reverseNumber * 10 + x % 10
            x /= 10
        }
        return x == reverseNumber || x == reverseNumber / 10
    }
}