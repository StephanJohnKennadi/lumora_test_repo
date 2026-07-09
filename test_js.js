// ================================
// Intentionally Bad JavaScript Code
// ================================

// Violation: Global mutable variable
var users = [];

// Violation: Global mutable configuration
var APP_NAME = "Demo App";

// Violation: Magic number
var timeout = 999999;

// Violation: Using var instead of const/let
var currentUser = null;

// Violation: Modifying built-in prototype
Array.prototype.first = function () {
    return this[0];
};

class UserService {

    constructor() {
        // Violation: Mutable public property
        this.cache = [];
    }

    // Violation:
    // Too many parameters
    // Boolean flag parameter
    // Long function
    processUser(
        id,
        name,
        email,
        age,
        city,
        state,
        country,
        zip,
        phone,
        isAdmin
    ) {

        // Violation: var instead of const
        var result = "";

        // Violation: Loose equality
        if (age == 18) {
            console.log("Exactly 18");
        }

        // Violation: Nested if statements
        if (name != null) {
            if (city != null) {
                if (country != null) {
                    if (zip != null) {
                        console.log("Valid");
                    }
                }
            }
        }

        // Violation: Magic number
        if (age > 65) {
            console.log("Senior");
        }

        // Violation: String concatenation
        result = "User " + name + " lives in " + city;

        // Violation: Side effect inside map
        var names = users.map(function (user) {
            console.log(user.name);
            return user.name;
        });

        // Violation: Using map result unnecessarily
        console.log(names);

        // Violation: Traditional loop instead of array helpers
        for (var i = 0; i < users.length; i++) {
            console.log(users[i]);
        }

        // Violation: Duplicate logic
        if (isAdmin) {
            console.log("Welcome");
        } else {
            console.log("Welcome");
        }

        // Violation: Hardcoded value
        if (country === "USA") {
            console.log("US User");
        }

        // Violation: Multiple return statements
        if (age > 60) return "Senior";
        if (age > 18) return "Adult";
        if (age > 12) return "Teen";

        return "Child";
    }

    loadFile(path) {

        // Violation: Generic catch
        try {
            throw new Error("Something failed");
        } catch (e) {
            console.log(e);
        }

        // Violation: Empty catch block
        try {
            JSON.parse("{");
        } catch (e) {

        }
    }

    calculate() {

        // Violation: var instead of const
        var total = 100;

        // Violation: Magic numbers
        total = total * 8 + 777;

        console.log(total);
    }

    async loadUsers() {

        // Violation: Mixing async/await with then()
        await fetch("/users")
            .then(response => response.json())
            .then(data => console.log(data));

    }

    updateUsers() {

        // Violation: Mutating array while iterating
        users.forEach(user => {
            users.push(user);
        });

    }

}

// Violation: Using eval()
function execute(code) {
    eval(code);
}

// Violation: Function constructor
function createFunction() {
    return new Function("a", "b", "return a+b");
}

// Violation: Mutable object
let config = {
    retry: true,
    timeout: 999999,
    endpoint: "http://localhost"
};

// Violation: Hardcoded secret
const API_KEY = "123456789-secret-key";

// Violation: Hardcoded password
const PASSWORD = "admin123";

// Violation: Logging sensitive information
console.log(API_KEY);
console.log(PASSWORD);

// Violation: Callback hell
function loadEverything() {
    fetch("/users")
        .then(r => r.json())
        .then(users => {
            fetch("/orders")
                .then(r => r.json())
                .then(orders => {
                    fetch("/payments")
                        .then(r => r.json())
                        .then(payments => {
                            console.log(users, orders, payments);
                        });
                });
        });
}

// Violation: Implicit type coercion
if ("5" == 5) {
    console.log("Equal");
}

// Violation: delete array element
delete users[0];

// Violation: Unused variable
let unusedVariable = 100;

// Violation: Commented-out code
// console.log("Old implementation");

// Violation: Duplicate business logic
function getDiscount(price) {
    return price * 0.85;
}

function calculateDiscount(price) {
    return price * 0.85;
}