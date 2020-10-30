
val patientNameArray= arrayOfNulls<String>(8)
val doctorsNameArray= arrayOfNulls<String>(8)
var j =0
var b = 0


fun main (){
    menu01()


}
fun menu01 (){
    println("""
        1-Patients
        2-Docotors
    """.trimIndent())
   try {

    when(readLine()?.toInt()){
        1-> menu02()
        2-> menu03()
        else -> println("Wrong Number")
    }}catch (e:NumberFormatException){
       println("please enter Number")
       menu01()
   }
}
fun menu02 (){
    println("""
        1-Add patient name
        2-Edit patient name
        3-Delete patient name
    """.trimIndent())
    try {

    when(readLine()?.toInt()){
        1 -> patientName()
        2 -> editPatient()
        3 -> deletePatient()
        else -> println(" wrong Number")
    }}catch (e:NumberFormatException){
        println("enter just number")
        menu02()
    }

}
fun menu03 (){
    println("""
        1-Add doctors name
        2-Edit doctors name
        3-Delete doctors name
    """.trimIndent())
    try {

    when(readLine()!!.toInt()){
        1 -> doctorsName()
        2 -> editDoctors()
        3 -> deleteDoctors()
        else -> println("wrong Number")
    }}catch (e : NumberFormatException){
        println("please just enter number")
        menu03()
    }

}
fun patientName (){
    println("Please enter your name")
    patientNameArray[j]= readLine()
    j++
    menu01()

}
fun doctorsName (){
    doctorsNameArray[b]= readLine()
    b++
    menu01()
}
fun editPatient (){
    for (k in 0..7){
    println(patientNameArray[k])}
    println("Please enter number of patientsName that what edit")
    var a= readLine()!!.toInt()
    patientNameArray[a] = readLine()
    for (k in 0..7){
    println(patientNameArray[k])}
    menu01()
}
fun editDoctors (){
    for (k in 0..7){
    println(doctorsNameArray[k])}
    println("Plase enter number of doctorsName that you want edit")
    var c = readLine()!!.toInt()
    doctorsNameArray[c]= readLine()
    for (k in 0..7){
    println(doctorsNameArray[k])}
    menu01()
}
fun deletePatient (){
    for (k in 0..7){
    println(patientNameArray[k])}
    println("Please enter your patientName thar you want delete")
    var b = readLine()!!.toInt()
    patientNameArray[b] = null
    for (k in 0..7){
    println(patientNameArray[k])}
    menu01()
}
fun deleteDoctors (){
    for (k in 0..7){
    println(doctorsNameArray[k])}
    println("Please enter your doctorsName that you want delete")
    var c = readLine()!!.toInt()
    doctorsNameArray[c]= null
    for (k in 0..7){
    println(doctorsNameArray[k])}
    menu01()
}
