open class inh_manusia5{
    val tangan : Int = 2

    fun berjalan(){
        println("berjalan")

    }
    fun duduk(){
        println("duduk")

    }
}

class alfian:inh_manusia5(){
    var tangan_pian : Int = 2

    fun nyervis(){
        println("nyervis")
    }

}
fun main(args: Array<String>){
    var manusia1=inh_manusia5()
    var manusia2=alfian()

    manusia1.berjalan()
    manusia2.nyervis()
}