import java.io.FileReader
import java.io.FileWriter

fun writeFile(str: String){
    print("masukkan text : ")
    val str= readLine()!!.toString()
        var fo=FileWriter("src/test.txt",true)
        fo.write(str)
        fo.close()

}
fun readFile(){
    try {

        var fin=FileReader("src/test.txt")
        var c:Int
        do{
            c = fin.read()
            print(c.toChar())
        }while (c!=-1)


    }
    catch (err:Exception){
        println(err.message)
    }
}
fun keluar(){

    println("terima kasih anda sudah keluar ")

}

fun main(args: Array<String>){
    println("============================")
    println("Pilih Operasi")
    println("1.Write File ")
    println("2.Read File ")
    println("3.keluar ")
    println("============================")
    print("Pilih :")
    val op= readLine()!!.toInt()
    if (op==3){
        println("pilihan anda angka:"+op)
        println("============================")
        println("terima kasih anda sudah keluar ")
    }else {
        when (op) {
            1 -> writeFile("")
            2 -> readFile()
            3 -> keluar()
        }
    }



}