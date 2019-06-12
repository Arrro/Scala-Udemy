// Error can be ignored as its false
println("Hello World")

val st: String = "This is a long string"

st.slice (10,14)

printf("A string %s ,an integer %d ,a float %f", "Hi", 10, 12.345)

// Intro To Collections
// Lists
val my_list = List(1,2,3,2.2,"A")
printf( s"$my_list")
my_list.slice(2,4)
// Arrays
val my_array = Array("A",5,7,3)
printf( s"$my_array")
Array.range(0,10)
// Sets
val s = Set() //sets to nothing
val s = Set(1,2,3) // sets to int
val s = Set(1,1,1,1,2,2,2,2,3,3,3,3) // no repeats
val s = collecton.mutable.Set(1,2,3)
s += 4 // Set(1,2,3,4)
val imuts = collection.mutable.Set(1,2,3)
imuts += 4 // adds 4 because it is mutable
imuts.add(5) //adds 5
// Can not grab from an index from a set. No retained order
imuts.max // Or min
val mylist = List(1,2,3,1,2,3)
mylist.to.toSet
val mynewset = mylist.toSet
// Maps (AKA Hashtables or Dictionaries)
val mymap = Map(("a",1),("b",2),("c",3))
mymap("a") // Lookup key returns the value
mymap get "a"
val mymutmap = collection.mutable.Map(("x",1),("y",2),("z",3))
mymutmap += ("newkey" -> 999)
mymap.keys // returns the keys
mymap.values // returns values

// Collections Assesment
var list3 = List(2,3,1,4,5,6,6,1,2)
val test_list2 = List(6,7)
val test_list = List(1,2,3,4,5) // Find if the lsit contains the #3
test_list.indexOf(3) // Answer \\ test_list.contains(3) wil work
test_list.contains(3) // Also works here to return a boolean
// How can you add a previous list
list.sum // Should be 15
// Create an array of all the odd number from 0 to 15
Array.Range(1,16,2)
// What are the unique elements of list3
list3.distinct // Will return the unique numbers in the list
list3.toSet // This can also return unique values as a set returns non-duplicates
var test_map = collection.mutable.Map(("Sammy",3),("Frankie",7),("John",45))
test_map.keys // Prints out all the keys
test_map += (("Mike",27)) // Add a vlaue to the map
test_map =+ ("Mike" -> 27) // Does the same as above

// Flow Control
val x = "zzz"

if (x.endsWith("o")){
    println("Thevlaue of x ends with o")
}else{
    println("The value of x does not end with o")
}

val person = "George"

if (person == "Sammy"){
    println("Welcome Sammy!")
}else if(person == "George"){
    println("Welcome George!")
}else{
    println("What is your name?")
}

// Logical Operators (And, Or, Not)
// And
println((1 == 2) && (2==2)) // Returns false as both are not true, both must be true to be true
// Or
println((1==2) || (2==2)) // One can be true for it to be true
// NOT !
println(!(1==1)) // Checking for inequality

// For Loops
for (num <- List(1,2,3)){
    println(num) // Can put a string as well to print 3 times
}
// Array
for (numArray <- Array.range(0,5)){
    println(numArray)
}
// Set
for (numSet <- Set(1,2,3)){
    println(numSet)
}
// Flow loop control
for (numFlow <- Range (0,10)){
    if (numFlow%2 == 0){
        println (s"$numFlow is even")
    }else{
        println (s"$numFlow is odd")
    }
}
val names = List("Tyler", "David", "Jeff D", "Jeff S", "Christian", "Brent", "Steve", "Naris")

for (name <- names)
{
    if (name.startsWith("T")){
        println(s"$name's name starts with a T")
    }else if(name.startsWith("J")){
            println(s"$name's name starts with a J")
    }else {
        println(s"Sorry $name you didnt make the cut")
    }
}

// While loops
var x = 0

while(x < 5){
    println(s"x is currently $x")
    println("x is still less than 5, adding 1 to x")
    x = x+1
}

import util.control.Breaks._

var y = 0

while (y < 10){
    println(s"y is currently $y")
    println("y is still less than ten, add 1 to y")
    y = y+1
    if (y==3) break
}

// Functions
def simple (): Unit = {
    println("simple print")
}

simple()

def adder(num1:Int,num2:Int): Int = {
    return num1 + num2
}

def greetName(name:String): String={
    return s"Hello $name"
}

val fullgreet = greetName("Jose")
println(fullgreet)

def isPrime(numcheck: Int): Boolean = {
    for (n <- Range(2,numcheck)){
        if(numcheck%n == 0){
            return false
        }
    }
    return true
}

println(isPrime(10))
println(isPrime(23))

val numbers = List(1,2,3,7)

def check(nums: List[Int]): List[Int]={
    return nums
}

println(check(numbers))

// Programming exercises

// 1.) Check for Single Even:
// Write a function that takes in an integer and retruns a Boolean indicating whether or not it is even. See if you can write this in one line!
// 2.) Check for Evens in a list;
// Write a function that returns True if there is an even number inside of a list, otherwise, return false.
// 3.) Lucky Number Seven:
// Take in a list of integers and calculate their sum. However, sevens are lucky and they should be counted twice, meaning their value is 14 for the sum. Assume the list isnt empty.
// 4.) Can you balance?
// Given a non-empty list of integers, return true if there is a place to split the list so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
// For example, given the list )1,5,3,3) would reutrn true, you can spli it in the middle. Another example )7,3,4) would return true 3+5=7. 
// Remember you just need to return the boolean, not the split index point.
// 5.) Palindrome Check
// Given a string, return a boolean indicating whether or not it is a plaindrome. (Spelled the same forwards and backwords). Try exploring methods to help you.

// #1 Answer
def num1Check(isEven: Int): Boolean = { // isEven is the input variable with the type Int, return a Boolean
    if (isEven%2 == 0){ // Modulo 2 divides the # by itself which has no remaimder (0)
        return true // return true if the number given returns no remainder (even)
    } else{
        return false
    }
}

println(num1Check(10)) // Number given to the function

// #2 Answer
val num2Evenlist = List(1,3,6,3,2,7,5,9,10,12) // Even list of number to pass in
val num2Oddlist = List(1,3,5,7,9,11,13) // Odd list of numbers to pass in

def num2Check(nums: List[Int]): Boolean = {
    for(num <- nums){ // interate through list
        if(num%2 == 0){ // modulo 2 to determine evens
            return true
        }
    }
    return false // required this to be returned outisde the for loop to close the loop
}                // Got type mismatch with Unit being seen and expecting boolean, need this.

println(num2Check(num2Evenlist)) // parse in lists
println(num2Check(num2Oddlist))

// #3 Answer
val num3List1 = List(1,2,3,4) // Should equal 10
val num3List2 = List(1,2,3,4,7) // Should equal 24
val num3List3 = List(1,2,3,4,7,7) // Should equal 38

def num3Check(lucky: List[Int]): Int = {
    
}