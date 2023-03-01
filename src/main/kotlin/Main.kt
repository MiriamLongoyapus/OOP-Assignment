import javax.xml.crypto.Data

fun main() {
    val person = Human("Jane",30,70)
    person.eat(5)
    person.weight
    person.speak("I am coding")
    val data = PersonalData("Miriam","Ekal","miriam@gmail.com",740075989, 2023)
    data.firstname
    println(data.firstname)
    data.password
    println(data.password)




}
//eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
class Human(var name:String, var age:Int, var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
        println(weight)
    }

//speak(speech: String) :Prints the string passed to it
    fun speak(speech: String) {
        println(speech)

    }
//birthday( ) :Increments the human’s age by 1
    fun birthday() {
        age += 1
    }
}
//2. Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User and print out any 2
//attributes
data class PersonalData(var firstname: String, var lastname: String, var email: String, var phoneNumber: Int, var password: Int)





