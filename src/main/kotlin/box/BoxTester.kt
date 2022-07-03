package box.kotlin

import java.util.Scanner

fun main() {
    print("Please enter a object's length: ")
    val length = readLine()!!.toFloat()
    print("Please enter a object's width: ")
    val width = readLine()!!.toFloat()
    print("Please a enter object's height: ")
    val height = readLine()!!.toFloat()

    var box3 = BoxTester(length, width, height)
    var box5 = BoxFive(length, width, height)
    if (box3.validate()) println("box3")
    else if (box5.validate()) println("box5")
    else println("Thank you!")
}

class BoxFive(length: Float, width: Float, height: Float):BoxTester(length, width, height){
    override fun validate() = if (length < 39.5 && width < 27.5 && height < 23) true else false
}

open class BoxTester(val length:Float, val width:Float, val height:Float){
    open fun validate()= if (length < 23 && width < 14 && height < 13) true else false
}