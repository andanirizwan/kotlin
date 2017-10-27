class manusia(){
    //field
    var kaki=2
    var tangan=2
    var kepala=1

    //method
    fun berjalan(){
        println("berjalan..")
    }
    fun berlari(){
        println("berlari..")
    }
    fun diam(){
        println("diam..")
    }
}

fun main(args: Array<String>){
    //membuat object
    var tubuh = manusia()
//    perilaku.berjalan()
//    perilaku.berlari()
//    perilaku.diam()

    println("ada "+ tubuh.kaki +" kaki")
    println("ada "+ tubuh.tangan+" tangan")
    println("ada "+ tubuh.kepala+" kepala")
}