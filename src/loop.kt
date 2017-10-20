fun main(args: Array<String>) {

    for(i in 1..5) {

        for (y in 1..5-i)
            print(" ")

        for (x in 1..i)
            print("*")
        println("")
    }
}