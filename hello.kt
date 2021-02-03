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
    
    val morenumbers = mutableListOf(1,2,3,4)
    morenumbers.add(5)
    morenumbers.removeAt(1)
    morenumbers[0] = 0
    morenumbers.shuffle()
    println(morenumbers)
    
    
    val numberSet = setOf(1,2,3,4)
    println("Number of elements: ${numberSet.size}")
    if (numberSet.contains(1)) println("1 is in the set")
    
    val numbersBackwards = setOf(4,3,2,1)
    println("The sets are equal: ${numberSet == numbersBackwards}")
    
    
    
    //  maps are basically dictionaries
    //  
    //  


	val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 4)
    println("All keys: ${numbersMap.keys}")
    println("All values: ${numbersMap.values}")

    if("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    val anotherMap = mapOf("key2" to 2, "key3" to 3, "key4" to 4, "key1" to 1)
    
    println(numbersMap == anotherMap)
    
    if(1 in numbersMap.values) println("The value 1 is in the map!")
    if(numbersMap.containsValue(1)) println("The value 1 is STILL in the map!")
    
    // mutable maps have write operations
    
    val mnumbersMap = mutableMapOf("one" to 1, "two" to 2)
    mnumbersMap.put("three",3)
    mnumbersMap["one"] = 11
    println(mnumbersMap)
    
    
    
    val a: Int = 1
	val b = 2
    println(sum(a,b))
    println(prod(a,b))
    printSum(a,b)
    
    incramentX()
    println(x)
    
    println(maxOf(a,b))
    */
    
    
    var fruits = listOf("apple","banana","pineapple")
    
    for(item in fruits){
        println(item)
    }
    
    for(index in fruits.indices){
        println("item at $index is ${fruits[index]}")
    }
    
    var items = listOf("foo", "bar", "foobar")
    var index = 0
    
    while(index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }
  
  //ranges 
  

	var x = 11
    var y = 9
    
    if(x in 1..y+1){
        println("fits in range")
    }
   
   
   for(x in 1..5){
       println(x)
   }
   
   for(x in 0..100 step 10){
       println(x)
   }
   
   for(x in 9 downTo 0 step 3){
       println(x)
   }
    
}


fun sum(a: Int, b: Int): Int{
    return a + b
}

fun prod(a: Int, b: Int) = a*b

fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a+b}")
}

fun incramentX(){
    x+=1
}

/*
fun maxOf(a: Int, b: Int): Int{
    if(a>b){
        return a
    }
    else{
        return b
    }
}*/


fun maxOf(a: Int, b: Int) = if(a>b) a else b
