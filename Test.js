var count = 0; // Violation: Using 'var' instead of let or const

globalString = "This is bad"; // Violation: Implicit global variable (no declaration keyword)

function doSomething(a, b) {
    if (count == "0") { // Violation: Loose equality (==) instead of strict (===)
        console.log("Count is zero") // Violation: Missing semicolon
    }

    // Violation: The return statement will return undefined due to automatic semicolon insertion,
    // making the object below it unreachable code.
    return
    {
        message: "Hello"
    }
}

// Violation: Unused variable
const unusedVar = 42;

// Violation: Empty block statement
if (true) {
}

doSomething(1, 2);
