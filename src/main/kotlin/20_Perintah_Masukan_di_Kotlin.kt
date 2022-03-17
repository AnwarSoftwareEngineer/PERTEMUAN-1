fun main() {
    //Parrot program
    println("Hi I'm Aisya, the virtual parrot, and i love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)

    println("==============================================================")
    //Untuk merubah nilai String yang dikembalikan oleh fungsi readLine()!! kedalam nilai yang
    //diinginkan bisa dilakukan dengan menggunakan konversi secara eksplisit seperti contoh program
    //berikut:
    //Doubler program parsing
    println("Enter a number and I'll double it: ")
    val input2 = readLine()!!
    var a = input2.toInt() // eventually Double
    a = a * 2
    println(a)
    println("Enter a number, and I'll square it:")
    val number = readLine()!!.toInt()
    val square = number * number
    println("Result: " + square)

}