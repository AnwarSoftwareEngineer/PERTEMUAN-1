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
    var text1 = """
 for (c in "foo")
 print(c)
 """
    println(text1)

    println("==============================================================")
    //Kita juga dapat menghapus spasi yang tidak diperlukan dalam raw String seperti contoh kode
    //program berikut:
    var text2 = """
 |Tell me and I forget.
 |Teach me and I remember.
 |Involve me and I learn.
 |(Benjamin Franklin)
 """.trimMargin()
    println(text2)

}