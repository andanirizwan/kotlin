class manusia3{
    companion object {
        @JvmField var tangan=2

        fun cantengan(){
            println("cantengan")
        }
    }

    var kaki=2
    var kepala=1

}

fun main(args: Array<String>){
    var alvian=manusia3()

    println("kaki :" +alvian.kaki)

    manusia3.cantengan()

}