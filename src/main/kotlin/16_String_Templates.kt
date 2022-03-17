fun main() {
    val a = 7
    val b = 8
    val c = a + b
    val s = "When we add $a and $b, we get $c"
    println(s)
    println("When we add $a and $b, we get ${a + b}")
    val price = """
 ${'$'}9.99
 """
    println(price)
    println("==============================================================")

    //Berikut adalah contoh
    //kode program untuk menggunakan fungsi anggota pada String.
    val s2 = "Rhinopotamus"
    println(s2.startsWith("rhin"))
    println(s2.endsWith("tamus"))
    println(s2.contains("pot"))
    println(s2.contains("lol"))
    //toUpperCase() and toLowerCase()
    var config = "Fullscreen shaDows autosave"
    config = config.toLowerCase()
    println("Will the game run in fullscreen?")
    println(config.contains("fullscreen"))
    println("Will shadows be turned on?")
    println(config.contains("shadows"))
    println("Will sound be turned off?")
    println(config.contains("nosound"))
    println("Would the player like to use autosave?")
    println(config.contains("autosave"))
    //replace()
    var strJava = "Java is the best!"
    strJava = strJava.replace("Java", "Kotlin")
    println(s)
    println("$strJava is ${strJava.length} characters long.")
    //substring()
    println("I would not banish all of these Internets.".substring(2, 7))
    //compareTo()
    println("alpha".compareTo("bravo"))

}