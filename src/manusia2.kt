class manusia2{
    var kaki =2
    var tangan =2
    var kepala =1
}
fun main(args: Array<String>){
    var pian=manusia2()
    var alfian=manusia2()

    println("tangan pian : " +pian.tangan)
    println("tangan alfian : " +alfian.tangan)
    pian.kaki=3

    println("kaki pian: " +pian.kaki + " setelah di tambahkan 'pian.kaki=3' ")
    println("kaki alfian : " +alfian.kaki)

}