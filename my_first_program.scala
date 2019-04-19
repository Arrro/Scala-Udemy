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
val test_list = List(1,2,3,4,5) // Find if te lsit contains the #3
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
for (item <- List(1,2,3)){
    println()
}