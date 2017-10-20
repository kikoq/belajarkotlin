object bintang2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val x = 5
        for (i in 1..5) {
            for (j in 4 downTo i) { //spasi
                print(" ")
            }
            for (k in 1..i) { //bintang
                print("*")
            }
            for (l in 1..i - 1) {
                print("*")
            }
            println()
        }
    }
}
