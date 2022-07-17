class RichestCustomerWealth {


    fun maximumWealth(accounts: Array<IntArray>): Int {

        var maxWealth : Int = 0

        for (row in accounts) {
            var sumWealth = 0
            for (col in row) {
                sumWealth += col
            }
            if (maxWealth < sumWealth) {
                maxWealth = sumWealth;
            }
        }
        return maxWealth
    }
}