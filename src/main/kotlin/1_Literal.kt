fun main() {
    //deklarasi dan inisialisasi variabel-variabel
    var intLiteral = 5
    var doubleLiteral = .02
    var stringLiteral = "Hello"
    var charLiteral = '1'
    var boolLiteral = true
    var a = 7
    var b = 6
    var c = (a++ + b++) / 2.0
    println(c+b)

    //menampilkan variabel menggunakan string template
    println("intLiteral = $intLiteral")
    println("doubleLiteral = $doubleLiteral")
    println("stringLiteral = $stringLiteral")
    println("charLiteral = $charLiteral")
    println("boolLiteral = $boolLiteral")
//    println(a++)
//    println(a)
    println(++a)
    println(a)
}