fun main() {
    val myName: String = "Aisya Anwar Putri"
    for(chr in myName){
        print(chr)
    }
    print('\n')
    println("==============================================================")

    //Kita bisa menggabungkan String dengan tipe data lain dengan menggunakan operator +,
    //sehingga tipe data yang digabung otomatis akan melebur kedalam String.
    val s = "abc" + 1
    println(s + "def")
    println("==============================================================")

    //Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan
    //raw String yang dipisahkan dengan triple quotes (""").
    //Contoh kode program raw String:
    var text = """
 for (c in "foo")
 print(c)
 """
    println(text)

}