/* If you want to compile to java:
 * kotlinc hello.kt -include-runtime -d hello.jar */

// This is a single line comment. 

import kotlin.text.*

val PI = 3.1415 // this is a value -- it cannot be changed later; type is inferred!
var x = 0  // this is a variable, it CAN be changed later; Int is inferred!


fun main(){
	
    /*
    println(x)
	//PI = 3.14 <-- val cannot be reassigned!
	println(PI)

	println("Hello World!")
    
    val a: Int = 2 // explicitly defined integer
    val b = 2 // implicitly defined integer
    
    val c: Int // Type is required when not initializing!
    c = 3 // deferred assignment
    
    val thinga: Int = 10000
    val thingd: Double = 100.00
    val thingf: Float = 100.00f
	val thingl: Long = 10000000004
    val things: Short = 10
    val thingb: Byte = 1

    println("Your Int value is " + thinga)
    println("Your Double  Value is "+thingd);
    println("Your Float Value is "+thingf);
    println("Your Long Value is "+thingl);
    println("Your Short Value is "+things);
    println("Your Byte Value is "+thingb);
    
    
    println("This works, too: " + "$thinga")
    
    
    val charthing: Char 
    charthing = 'A'
    println(charthing)
    
    val boolthing: Boolean
    boolthing = false
    println("Your boolthing is "+boolthing)
    */
    
    //var rawString: String = "I am raw string!"
   // val rawString: String = "Can't change this!"
	//println("Hello, " + rawString)
     

    //rawString = "I am awesome raw string!"
    
    //println(rawString[0])
    //rawString[0] = "T"
   
	//val escapedString : String = "I am escaped string! Can't catch me! He he he!\n"
    //println(rawString);
    //print("wEE")
    
    /*
    var foo = 1
	val s1 = "foo is $foo"
    println(s1)
    
    foo = 2
	val s2 = "${s1.replace("is", "was")}, but now is $foo"
    println(s2)
    
    */
    
    val numbers = mutableListOf("une", "deux", "trois", "quatre")
    println(numbers)
    numbers.add("five")
    println(numbers)
    //numbers = mutableListOf("one","two", "three")
    
    val numbersList = listOf("one", "two", "three", "four")
    println(numbersList.size)
    println(numbersList.get(2))
	println(numbersList[2])
    println("Index of element \"two\" ${numbersList.indexOf("two")}")
    //numbersList.add("five")
    
    val people = listOf("Bob", "George", "Frank","Frank")
    val people2 = listOf("Bob", "Frank","Frank", "George")
    println(people == people2)
    println()
    
    
}

