fun main() {
    val myName: String = "Aisya Anwar Putri"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    //Kita bisa menggabungkan String dengan tipe data lain dengan menggunakan operator +,
    //sehingga tipe data yang digabung otomatis akan melebur kedalam String.
    val s = "abc" + 1
    println(s + "def")

}