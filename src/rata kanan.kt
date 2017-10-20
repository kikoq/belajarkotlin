
    fun main(args: Array<String>) {
        for (i in 1..5) {
            for (aku in 4 downTo i) { //spasi
                print(" ")
            }
            for (kamu in 1..i) { //bintang
                print("*")
            }
            println()
        }
    }