fun main() {
    //Parrot program
    println("Hi I'm Aisya, the virtual parrot, and i love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)
}