class Hitung(val angka1:Double,val angka2:Double){
    var hasil=0.0

    fun operasi(){
        println("============================")
        println("Pilih Operasi:")
        println("1.penjumlahan :")
        println("2.pengurangan :")
        println("3.pembagian :")
        println("4.perkalian :")
        println("5.keluar :")
        println("============================")
        print("Pilih :")
        val op= readLine()!!.toInt()
        if (op==5){
            println("pilihan anda angka:"+op)
            println("============================")
            println("terima kasih anda sudah keluar ")
        }else {
            println("pilihan anda angka:"+op)
            println("============================")
            print("Angka pertama :")
            val n1 = readLine()!!.toDouble()
            print("Angka kedua :")
            val n2 = readLine()!!.toDouble()
            val hitung = Hitung(n1, n2)
            when (op) {
                1 -> hitung.penjumlahan()
                2 -> hitung.pengurangan()
                3 -> hitung.pembagian()
                4 -> hitung.perkalian()
                5 -> hitung.keluar()
            }
        }
    }

    fun penjumlahan(){
        hasil=angka1 + angka2
        println("hasil: "+hasil)
        operasi()
    }
    fun pengurangan(){
        hasil=angka1 - angka2
        println("hasil: "+hasil)
        operasi()
    }
    fun pembagian(){
        try {
            hasil=angka1 / angka2
            println("hasil: "+hasil)
            operasi()
        }catch (err:Exception){
            println(err.message)
        }
    }
    fun perkalian(){
        hasil=angka1 * angka2
        println("hasil: "+hasil)
        operasi()
    }
    fun keluar(){

        println("terima kasih anda sudah keluar ")

    }

}

fun main(args:Array<String>){
    println("============================")
    println("Pilih Operasi:")
    println("1.penjumlahan :")
    println("2.pengurangan :")
    println("3.pembagian :")
    println("4.perkalian :")
    println("5.keluar :")
    println("============================")
    print("Pilih :")
    val op= readLine()!!.toInt()
    if (op==5){
        println("pilihan anda angka:"+op)
        println("============================")
        println("terima kasih anda sudah keluar ")
    }else {
        println("pilihan anda angka:"+op)
        println("============================")
        print("Angka pertama :")
        val n1 = readLine()!!.toDouble()
        print("Angka kedua :")
        val n2 = readLine()!!.toDouble()
        val hitung = Hitung(n1, n2)
        when (op) {
            1 -> hitung.penjumlahan()
            2 -> hitung.pengurangan()
            3 -> hitung.pembagian()
            4 -> hitung.perkalian()
            5 -> hitung.keluar()
        }
    }
}