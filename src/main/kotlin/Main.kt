fun main(args: Array<String>) {
    numbers()

    persons()
    println(fam("Linah", "Wanjiru", "Nkirote"))
    println(cars())
}


//1. Create one function that is given the below array:
var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth e
    //println("Average height: $averageHeight meters")
   // println("Total height : $totalHeight meters")lements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)
fun numbers(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1] + numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
//2. Given a list of Person objects, each with the attributes, name,
// age, height, and weight. Sort the list in order of descending age (2 points)

data class Person(var name:String, var age:Int, var height:Double, var weight:Double)
fun persons(){
    val person1= Person("Milcah",23,5.18,50.90)
    val person2=Person("Faith",47,5.25,56.00)
    val person3=Person("Sally",17,4.20,72.30)
    var people= listOf(person1,person2,person3)
    var sortedAges=people.sortedByDescending { people-> people.age }
    println(sortedAges)
}
//3. Create a function that takes in 3 names and returns a string array
// containing all 3 names. (2 points)

fun fam(a:String, b:String, c:String):String{
    var names = arrayOf(a, b, c)
    return names.contentToString()
}


//4. Write a function that takes in a list of Car objects each
//with a registration and mileage attribute and returns the average mileage of all
//the vehicles in the list. (3 points)

data class Car(var registration: String, var mileage: Int)
fun cars():Int{
    var car1 = Car("KAX", 1500)
    var car2 = Car("KDH", 1200)
    var calc = listOf(car1,car2)
    val mileagecalc = calc.sumOf { x -> x.mileage } / calc.size
    return mileagecalc

  }

