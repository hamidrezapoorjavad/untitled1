val nameArray = arrayOfNulls<String>(10)
val lastNameArray = arrayOfNulls<String>(10)
val numberArray = arrayOfNulls<String>(10)
var i = 0

fun main (){
    menu()
}
fun menu (){
    println(
            """
                1-Add Name
                2-Search
                3-Exit
            """.trimIndent()

    )
    when (readLine()?.toInt()){
        1 -> addName()
        2 -> search()
        3 -> exit()
    }
}
fun addName () {
    println("please Enter Your Name")
    nameArray[i] = readLine()
    println("Pleae Enter Your Lastname")
    lastNameArray[i] = readLine()
    println("Please Enter Your Number")
    numberArray[i] = readLine()
    i++
    menu()

}
fun search (){
    println("Please Enter Your Lastname")
    val lastName = readLine() ?: "--"
    var isFound = false
    for ((i:Int,nameItem:String?) in lastNameArray.withIndex()){
        if (nameItem == lastName){
            println(numberArray[i])
            isFound=true
            break
        }
    }
    if (!isFound){
        println("is not found")
        menu()
    }
}
fun exit(){
    print(" bye bye")
}