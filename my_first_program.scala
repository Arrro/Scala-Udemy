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
