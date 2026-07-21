package sample

import java.io.File
import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList

// Violation: Mutable global variable
var users = mutableListOf<User>()

// Violation: Magic number
var timeout = 999999

// Violation: Mutable global constant
var APP_NAME = "Sample App"

data class User(
    // Violation: Mutable properties in data class
    var id: Int?,
    var name: String?,
    var age: Int?,
    var email: String?,
    var active: Boolean?
)

open class UserManager {

    // Violation: lateinit instead of constructor injection
    lateinit var repository: UserRepository

    // Violation: Public mutable collection
    val cache = mutableListOf<User>()

    // Violation: Mutable property
    var currentUser: User? = null

    // Violation: Too many parameters
    fun processUsers(
        userId: Int?,
        name: String?,
        email: String?,
        age: Int?,
        city: String?,
        state: String?,
        country: String?,
        zip: String?,
        phone: String?,
        active: Boolean?
    ): String {

        // Violation: Mutable variable
        var result = ""

        // Violation: Force unwrap
        println(name!!)

        // Violation: Unnecessary nullable variable
        var count: Int? = 10

        // Violation: Hardcoded values
        if (age!! > 18) {
            println("Adult")
        }

        // Violation: Nested if statements
        if (active == true) {
            if (city != null) {
                if (country != null) {
                    if (zip != null) {
                        println("Valid")
                    }
                }
            }
        }

        // Violation: Java style loop
        for (i in 0 until cache.size) {
            println(cache[i].name)
        }

        // Violation: Side effect inside map
        val names = cache.map {
            println(it.name)
            it.name
        }

        // Violation: Mutable collection exposed
        users.add(User(1, "John", 25, "john@test.com", true))

        // Violation: String concatenation
        result = "User : " + name + " Age : " + age

        // Violation: Multiple returns
        if (age > 60) return "Senior"
        if (age > 18) return "Adult"
        if (age > 12) return "Teen"

        return "Child"
    }

    fun loadFile(path: String) {

        // Violation: Generic exception catch
        try {
            val text = File(path).readText()
            println(text)
        } catch (e: Exception) {
        }

        // Violation: Another generic catch
        try {
            repository.load()
        } catch (e: Exception) {
            println(e)
        }
    }

    fun calculate() {

        // Violation: var instead of val
        var total = 100

        // Violation: Magic number
        total = total * 7 + 999

        println(total)
    }

    // Violation: Long function
    fun hugeFunction() {

        println("1")
        println("2")
        println("3")
        println("4")
        println("5")
        println("6")
        println("7")
        println("8")
        println("9")
        println("10")
        println("11")
        println("12")
        println("13")
        println("14")
        println("15")
        println("16")
        println("17")
        println("18")
        println("19")
        println("20")

        for (user in cache) {
            if (user.active == true) {
                if (user.age != null) {
                    if (user.age!! > 18) {
                        println(user.name!!)
                    }
                }
            }
        }
    }
}

class UserRepository {

    fun load() {

        // Violation: Empty catch block
        try {
            println("Loading...")
        } catch (e: Exception) {

        }
    }
}