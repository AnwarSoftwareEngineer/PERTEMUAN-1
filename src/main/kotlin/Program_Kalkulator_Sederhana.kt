fun main() {
    println("Selamat Datang Di Kalkulator")
    println("Masukkan Angka Pertama:")
    val a = readLine()!!.toDouble()
    println("Masukkan Angka Kedua:")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    println("Pertambahan: ${sum}")
    println("Selisih: ${difference}")
    println("Perkalian: ${product}")
    println("Pembagian: ${quotient}")
    println("Terimakasih Telah Menggunakan Kalkulator")
}