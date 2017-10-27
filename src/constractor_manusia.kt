class constractor_manusia(val tangan:  Int , val kaki: Int , val kepala: Int ){
    init {
        println("tangan $tangan, kaki $kaki, kepala $kepala")
    }

}
fun main(args: Array<String>){
    var manusia = constractor_manusia(1,1,1)
}