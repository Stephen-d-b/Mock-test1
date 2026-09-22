/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progcheetsheet;

/**
 *
 * @author NLS - SMP
 */
================================================================
JAVA FULL CHEAT SHEET - MOCK EXAM REVISION
================================================================
Topics Covered:
  0.  Imports (and cool tricks you can use in imports like *)
  1.  Printing (println, print, printf)
  2.  Variables & Data Types
  3.  If / Else If / Else
  4.  Switch Statement
  5.  For Loop
  6.  For-Each Loop (Enhanced For)
  7.  While Loop
  8.  Do-While Loop
  9.  Single-Dimensional Arrays
  10. Two-Dimensional Arrays
  11. ArrayList
  12. Methods (with arguments & return values)
  13. Classes & Objects (Creating Objects)
  14. Constructors
  15. Getters & Setters
  16. Encapsulation
  17. Inheritance (extends, super)
  18. Abstract Classes
  19. Concrete Classes
  20. Interfaces
  21. Polymorphism
  22. Try-Catch (Error Handling)
  23. Scanner (Keyboard Input)
  24. JOptionPane (showInputDialog & showMessageDialog)
  25. Parsing with Integer.parseInt & Double.parseDouble
  26. DecimalFormat (Formatting to .00)
  27. Validations (Input, Range, Null)

================================================================
0. IMPORTS (PUT AT TOP OF EVERY FILE)
================================================================
CODE:
    import java.util.*;       // Scanner, ArrayList, Arrays, Random
    import javax.swing.*;     // JOptionPane
    import java.text.*;       // DecimalFormat
    import java.io.*;         // File, FileWriter, PrintWriter

WHAT IT DOES:
    Imports tell Java which "toolkits" you want to use in your file.
    The * means "bring in everything from this package".
    Without imports, Java doesn't know what Scanner or JOptionPane is.

WHEN TO USE IT:
    - Put imports at the VERY TOP of the file (before public class).
    - Use these four and you'll cover 95% of exam questions.
    - java.lang.* (String, Math, Integer, Double) is AUTOMATIC.

INDIVIDUAL IMPORTS (if your examiner prefers specific ones):
    import java.util.Scanner;
    import java.util.ArrayList;
    import javax.swing.JOptionPane;
    import java.text.DecimalFormat;
    import java.io.FileWriter;          
          

================================================================
1. PRINTING TO SCREEN
================================================================
CODE:
    System.out.println("Hello World");
    System.out.print("Enter name: ");
    System.out.printf("%-15s %d%n", "Cape Town", 155);

WHAT IT DOES:
    println() -> Prints text + moves to a new line.
    print()   -> Prints text but stays on the SAME line.
    printf()  -> Prints FORMATTED text using placeholders:
                 %s  = String
                 %d  = integer
                 %f  = decimal (float/double)
                 %.2f = decimal with 2 places
                 %n  = new line
                 %-15s = left-align text in 15 char space

WHEN TO USE IT:
    - println() for normal output.
    - print() when you want the user to type on the same line.
    - printf() when you need neat tables/columns (like Q1 report).


================================================================
2. VARIABLES & DATA TYPES
================================================================
CODE:
    int age = 25;
    double price = 99.99;
    String name = "John";
    boolean isPassed = true;
    char grade = 'A';

WHAT IT DOES:
    int     -> whole numbers
    double  -> decimal numbers
    String  -> text
    boolean -> true / false
    char    -> single character

WHEN TO USE IT:
    - int for counts, totals, ages, marks.
    - double for money, averages.
    - String for names, cities, messages.
    - boolean for flags (isFound, isValid).
    - char for menu options ('A', 'B', 'C').


================================================================
3. IF / ELSE IF / ELSE
================================================================
CODE:
    if (mark >= 50) {
        System.out.println("Pass");
    } else if (mark >= 40) {
        System.out.println("Supplementary");
    } else {
        System.out.println("Fail");
    }

WHAT IT DOES:
    Checks a condition. First true block runs.
    If none are true, the else runs.

WHEN TO USE IT:
    - When making decisions.
    - When comparing values (>, <, ==, !=, >=, <=).
    - When you have multiple possible outcomes.


================================================================
4. SWITCH STATEMENT
================================================================
CODE:
    switch (choice) {
        case 1:
            System.out.println("Option 1");
            break;
        case 2:
            System.out.println("Option 2");
            break;
        default:
            System.out.println("Invalid choice");
    }

WHAT IT DOES:
    Compares one variable to multiple possible values.
    Runs the matching case.
    "break" prevents falling through to the next case.
    "default" runs if nothing matches.

WHEN TO USE IT:
    - When you have a MENU (1 = Add, 2 = View, 3 = Exit).
    - When comparing one value to many exact options.
    - Instead of long if/else if chains comparing the same thing.


================================================================
5. FOR LOOP
================================================================
CODE:
    for (int i = 0; i < 5; i++) {
        System.out.println("Number: " + i);
    }

WHAT IT DOES:
    Repeats a block a SPECIFIC number of times.
    - int i = 0  -> start at 0
    - i < 5      -> keep going while i < 5
    - i++        -> add 1 after each loop

WHEN TO USE IT:
    - When you KNOW how many times to loop.
    - When looping through an array (use .length).
    - When counting.


================================================================
6. FOR-EACH LOOP (Enhanced For Loop)
================================================================
CODE:
    String[] cities = {"Cape Town", "Johannesburg", "Durban"};

    for (String city : cities) {
        System.out.println(city);
    }

    // Also works with ArrayList:
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    for (int num : numbers) {
        System.out.println(num);
    }

WHAT IT DOES:
    Loops through EVERY item in an array or ArrayList.
    You do NOT need an index.
    Reads as: "for each city IN cities, do this..."
    The colon ( : ) means "in".

WHEN TO USE IT:
    - When you just need to READ every item.
    - When you don't need the index number.
    - When you want shorter, cleaner code than a normal for loop.

WHEN NOT TO USE IT:
    - When you need the index (i).
    - When you need to MODIFY items while looping.
    - When you need to skip items or go backwards.


================================================================
7. WHILE LOOP
================================================================
CODE:
    int count = 0;
    while (count < 5) {
        System.out.println("Count: " + count);
        count++;
    }

WHAT IT DOES:
    Repeats a block AS LONG AS the condition is true.
    Checks the condition BEFORE running.

WHEN TO USE IT:
    - When you DON'T know how many times to loop.
    - When waiting for something to change (e.g., "quit").
    - IMPORTANT: Always change the variable inside or you get
      an INFINITE LOOP.


================================================================
8. DO-WHILE LOOP
================================================================
CODE:
    int num;
    do {
        System.out.print("Enter a positive number: ");
        num = input.nextInt();
    } while (num <= 0);

WHAT IT DOES:
    Runs the code AT LEAST ONCE, then checks the condition.

WHEN TO USE IT:
    - When the code must run at least once (e.g., input validation).
    - When you want to "keep asking until valid".


================================================================
9. SINGLE-DIMENSIONAL ARRAYS
================================================================
CODE:
    String[] cities = {"Cape Town", "Johannesburg", "Durban"};
    int[] marks = new int[3];
    marks[0] = 80;
    marks[1] = 75;
    marks[2] = 90;

    // Access:
    System.out.println(cities[0]);   // Cape Town
    int size = cities.length;        // 3

WHAT IT DOES:
    Stores MULTIPLE values of the SAME type in one variable.
    Index starts at 0. Last index is length - 1.
    .length gives the number of items (NO parentheses).

WHEN TO USE IT:
    - When you have a fixed list of items.
    - When you need to loop through values by index.
    - When the size is known upfront.


================================================================
10. TWO-DIMENSIONAL ARRAYS
================================================================
CODE:
    int[][] accidents = new int[3][2];

    accidents[0][0] = 155;   // Row 0, Col 0
    accidents[0][1] = 121;   // Row 0, Col 1
    accidents[1][0] = 178;   // Row 1, Col 0

    // Or direct initialization:
    int[][] grid = {
        {155, 121},
        {178, 145},
        {112, 89}
    };

    // Nested loop to read:
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
            System.out.print(grid[i][j] + " ");
        }
        System.out.println();
    }

WHAT IT DOES:
    Stores data in ROWS and COLUMNS (a table).
    First index  -> row
    Second index -> column
    .length on 2D array gives number of ROWS.

WHEN TO USE IT:
    - When you have table data (like the accident report).
    - When you need multiple values per item (cars + bikes per city).


================================================================
11. ARRAYLIST
================================================================
CODE:
    import java.util.ArrayList;

    ArrayList<String> names = new ArrayList<>();
    names.add("John");
    names.add("Sarah");
    names.add("Mike");

    names.get(0);          // "John"
    names.size();          // 3
    names.remove("Sarah"); // removes Sarah
    names.set(0, "Peter"); // replace index 0 with "Peter"

    // Loop through:
    for (String n : names) {
        System.out.println(n);
    }

WHAT IT DOES:
    Like an array but can GROW and SHRINK.
    add()    -> add item
    get(i)   -> get item at index i
    remove() -> remove item
    set(i,v) -> replace item at index i
    size()   -> number of items (WITH parentheses)

WHEN TO USE IT:
    - When you DON'T know the number of items in advance.
    - When you need to add/remove items often.

DIFFERENCE FROM ARRAY:
    Array     -> fixed size, uses .length  (no parens)
    ArrayList -> dynamic size, uses .size() (with parens)


================================================================
12. METHODS (with arguments & return values)
================================================================
CODE:
    // No return value (void):
    public void greet() {
        System.out.println("Hello!");
    }

    // With parameters and a return value:
    public int add(int a, int b) {
        return a + b;
    }

    // With a String return:
    public String getFullName(String first, String last) {
        return first + " " + last;
    }

    // Calling:
    greet();
    int result = add(5, 3);
    String name = getFullName("John", "Smith");

WHAT IT DOES:
    A method is a reusable block of code that does one job.
    - void     -> returns nothing
    - int      -> returns an integer
    - String   -> returns text
    - Parameters (a, b) -> values passed IN
    - return   -> sends a value back to the caller

WHEN TO USE IT:
    - When you want to reuse code.
    - When breaking a big problem into smaller pieces.
    - When the question asks for a specific method (e.g., printReport).


================================================================
13. CLASSES & OBJECTS (Creating Objects)
================================================================
CODE:
    // 1. Define the class:
    public class Car {
        private String brand;
        private int speed;

        public Car(String brand, int speed) {   // Constructor
            this.brand = brand;
            this.speed = speed;
        }

        public void drive() {
            System.out.println(brand + " driving at " + speed);
        }
    }

    // 2. Create objects (in main):
    Car car1 = new Car("Toyota", 120);
    Car car2 = new Car("BMW", 180);
    car1.drive();
    car2.drive();

WHAT IT DOES:
    A CLASS is a blueprint.
    An OBJECT is a real thing made from the blueprint.
    "new" creates the object and calls the constructor.

WHEN TO USE IT:
    - When you want to model real-world things.
    - When data + behaviour belong together.
    - When the question asks for OOP design.

SYNTAX:
    ClassName objectName = new ClassName(arguments);


================================================================
14. CONSTRUCTORS
================================================================
CODE:
    public class Student {
        private String name;
        private int age;

        // Constructor - same name as class, no return type
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

WHAT IT DOES:
    Runs AUTOMATICALLY when you use "new".
    Sets up the object's initial values.
    - Same name as the class.
    - NO return type (not even void).
    - Can be overloaded (multiple versions with different parameters).

WHEN TO USE IT:
    - ALWAYS when you need to set initial values.
    - When the question says "create a constructor that accepts..."


================================================================
15. GETTERS & SETTERS
================================================================
CODE:
    public class Student {
        private String name;
        private int age;

        // GETTER - reads the value
        public String getName() {
            return name;
        }

        // SETTER - changes the value
        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

WHAT IT DOES:
    Getter -> RETURNS the private variable (starts with "get").
    Setter -> CHANGES the private variable (starts with "set").

WHEN TO USE IT:
    - ALWAYS when variables are private (encapsulation).
    - When you want controlled access to data.
    - When the question asks for "get" and "set" methods.

TIP: In NetBeans, right-click inside the class -> Insert Code
     -> Getter and Setter. It writes them for you!


================================================================
16. ENCAPSULATION
================================================================
CODE:
    public class BankAccount {
        private double balance;   // HIDDEN

        public double getBalance() {          // Controlled read
            return balance;
        }

        public void deposit(double amount) {  // Controlled write
            if (amount > 0) {
                balance += amount;
            }
        }
    }

WHAT IT DOES:
    Hides data (private) and only allows access through methods.
    This is one of the four OOP pillars.

WHEN TO USE IT:
    - ALWAYS. This is good OOP practice.
    - When you want to protect data from being changed wrongly.
    - When you want to add validation when setting values.

THE 4 OOP PILLARS (memorize these!):
    1. Encapsulation -> Hide data, use getters/setters
    2. Inheritance   -> Child class inherits from parent
    3. Polymorphism  -> Same method, different behaviour
    4. Abstraction   -> Hide complexity (abstract classes/interfaces)


================================================================
17. INHERITANCE (extends, super)
================================================================
CODE:
    // PARENT CLASS
    public class Vehicle {
        protected String type;

        public Vehicle(String type) {
            this.type = type;
        }

        public void move() {
            System.out.println("Vehicle is moving");
        }
    }

    // CHILD CLASS
    public class Car extends Vehicle {
        private int doors;

        public Car(String type, int doors) {
            super(type);          // Call parent constructor FIRST
            this.doors = doors;
        }

        @Override
        public void move() {
            System.out.println("Car is driving");
        }
    }

WHAT IT DOES:
    Child INHERITS all public/protected variables and methods
    from parent.
    "extends" -> Child IS-A Parent
    "super()" -> Calls the parent's constructor (must be FIRST line)
    "@Override" -> Replaces parent's method with new behaviour

WHEN TO USE IT:
    - When two classes share common code (Car and Bike are Vehicles).
    - When the question says "X extends Y".
    - When you want to avoid repeating code.


================================================================
18. ABSTRACT CLASSES
================================================================
CODE:
    public abstract class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        // Abstract method - NO body, MUST be overridden
        public abstract void makeSound();

        // Normal method - can be inherited as-is
        public void sleep() {
            System.out.println(name + " is sleeping");
        }
    }

    public class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    // Usage:
    // Animal a = new Animal("Bob");  // ERROR! Cannot instantiate
    Dog d = new Dog("Rex");           // OK
    d.makeSound();                    // Woof!
    d.sleep();                        // Rex is sleeping

WHAT IT DOES:
    An abstract class CANNOT be instantiated directly.
    It can have:
      - Abstract methods (no body, child MUST implement)
      - Normal methods (with body, child can inherit)
    Child class MUST override all abstract methods (or be abstract too).

WHEN TO USE IT:
    - When you want a base class that should NEVER exist alone.
    - When you want to force children to implement certain methods.
    - When the question explicitly asks for an abstract class.


================================================================
19. CONCRETE CLASSES
================================================================
CODE:
    public class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

WHAT IT DOES:
    A CONCRETE class is a normal class that CAN be instantiated.
    It is the OPPOSITE of an abstract class.
    All abstract methods from the parent MUST be implemented here.

WHEN TO USE IT:
    - When you want to actually create objects.
    - Every class you write is concrete unless you write "abstract".

DIFFERENCE:
    Abstract Class -> Cannot do "new AbstractClass()"
    Concrete Class -> CAN do "new ConcreteClass()"


================================================================
20. INTERFACES
================================================================
CODE:
    public interface IAnimal {
        void makeSound();
        String getName();
    }

    public class Cat implements IAnimal {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public void makeSound() {
            System.out.println("Meow");
        }

        @Override
        public String getName() {
            return name;
        }
    }

WHAT IT DOES:
    A 100% abstract contract.
    Lists method NAMES only (no body).
    Any class that "implements" it MUST write ALL the methods.
    Interfaces use "implements" (not "extends").

WHEN TO USE IT:
    - When you want to GUARANTEE certain methods exist.
    - When the question says "implement interface X".
    - When multiple unrelated classes need the same rules.

INTERFACE vs ABSTRACT CLASS:
    Interface:      methods only, no fields, use "implements"
    Abstract Class: methods + fields, use "extends"


================================================================
21. POLYMORPHISM
================================================================
CODE:
    // Parent reference, child object:
    Animal myPet = new Dog("Rex");
    myPet.makeSound();   // Prints "Woof!" (Dog's version)

    Animal otherPet = new Cat("Whiskers");
    otherPet.makeSound(); // Prints "Meow" (Cat's version)

    // Array of mixed types:
    Animal[] pets = { new Dog("Rex"), new Cat("Whiskers") };
    for (Animal a : pets) {
        a.makeSound();   // Each one does its OWN sound
    }

WHAT IT DOES:
    "Poly" = many, "morph" = forms.
    The SAME method call behaves DIFFERENTLY depending on the object.
    A parent reference can hold a child object.

WHEN TO USE IT:
    - When you want one variable to handle many types.
    - When you loop through a list of mixed objects.
    - When the question mentions "same method, different behaviour".

TYPES OF POLYMORPHISM:
    1. Method Overloading  -> Same method name, DIFFERENT parameters
                              e.g., add(int,int) and add(int,int,int)
    2. Method Overriding   -> Same method name, same parameters, but
                              rewritten in the child class (@Override)


================================================================
22. TRY-CATCH (Error Handling)
================================================================
CODE:
    try {
        int result = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero!");
    }

    // For user input (number formats):
    try {
        int age = Integer.parseInt(input);
    } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number!");
    }

    // Multiple catches:
    try {
        // risky code
    } catch (NumberFormatException e) {
        System.out.println("Not a number!");
    } catch (Exception e) {
        System.out.println("Something went wrong!");
    }

WHAT IT DOES:
    "try"   -> runs the risky code.
    "catch" -> catches the error and prevents a crash.
    Java provides exception types like:
      - ArithmeticException (division by zero)
      - NumberFormatException (parsing bad numbers)
      - NullPointerException (using a null object)
      - ArrayIndexOutOfBoundsException (bad index)

WHEN TO USE IT:
    - When input might be wrong (JOptionPane input!).
    - When dividing by a variable that might be zero.
    - When parsing strings to numbers.
    - ALWAYS when using JOptionPane for input — it's the safe way.


================================================================
23. SCANNER (Keyboard Input)
================================================================
CODE:
    import java.util.Scanner;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = input.nextLine();

    System.out.print("Enter age: ");
    int age = input.nextInt();

    System.out.print("Enter price: ");
    double price = input.nextDouble();

    input.close();

WHAT IT DOES:
    Reads from the keyboard.
    - nextLine()   -> reads String (whole line)
    - nextInt()    -> reads int
    - nextDouble() -> reads double
    - next()       -> reads one word only

WHEN TO USE IT:
    - When the question says "use Scanner" or console input.

IMPORTANT TRAP:
    If you use nextInt() first and then nextLine(), the nextLine()
    will be SKIPPED because nextInt leaves the ENTER key in memory.
    FIX: put an extra input.nextLine() after nextInt() to "eat" it.

EXAMPLE FIX:
    int age = input.nextInt();
    input.nextLine();  // <-- eat the leftover ENTER
    String name = input.nextLine();


================================================================
24. JOPTIONPANE (showInputDialog & showMessageDialog)
================================================================
CODE:
    import javax.swing.JOptionPane;

    // INPUT - returns a String
    String name = JOptionPane.showInputDialog(null, "Enter your name:");

    // OUTPUT - shows a message box
    JOptionPane.showMessageDialog(null, "Hello, " + name);

    // With a title:
    String city = JOptionPane.showInputDialog(null,
                    "Enter your city:", "City Input",
                    JOptionPane.QUESTION_MESSAGE);

    JOptionPane.showMessageDialog(null, "You entered: " + city,
                    "Result", JOptionPane.INFORMATION_MESSAGE);

WHAT IT DOES:
    showInputDialog()    -> Pops up a small window to ask the user.
                            ALWAYS returns a STRING.
    showMessageDialog()  -> Pops up a message window.
    Both are from the package: javax.swing

WHEN TO USE IT:
    - When the question says "use JOptionPane".
    - When the exam wants GUI input instead of console.
    - When you want a nicer-looking input/output.

IMPORTANT NOTES:
    - showInputDialog ALWAYS returns a String.
      So if you need a number, you MUST parse it (see topic 25).
    - If the user clicks Cancel or X, it returns null.
      Always check for null before using it!

SAFE EXAMPLE:
    String input = JOptionPane.showInputDialog("Enter age:");
    if (input != null) {
        int age = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "Age: " + age);
    } else {
        JOptionPane.showMessageDialog(null, "Cancelled");
    }


================================================================
25. PARSING (Integer.parseInt & Double.parseDouble)
================================================================
CODE:
    String numText = "42";
    String priceText = "19.99";

    int num = Integer.parseInt(numText);          // 42
    double price = Double.parseDouble(priceText); // 19.99

    // With JOptionPane:
    String input = JOptionPane.showInputDialog("Enter your age:");
    int age = Integer.parseInt(input);

    String priceInput = JOptionPane.showInputDialog("Enter price:");
    double price2 = Double.parseDouble(priceInput);

    // With try-catch (SAFE - always do this with JOptionPane):
    try {
        String input2 = JOptionPane.showInputDialog("Enter age:");
        int age2 = Integer.parseInt(input2);
        JOptionPane.showMessageDialog(null, "Age: " + age2);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid number!");
    }

WHAT IT DOES:
    JOptionPane returns a STRING.
    To use it as a NUMBER, you must CONVERT (parse) it.
    Integer.parseInt("123")      -> int 123
    Double.parseDouble("19.99")  -> double 19.99

WHEN TO USE IT:
    - EVERY time you use JOptionPane and need a number.
    - When the exam forbids using (int) or (double) casting.
      (Casting like (double) is often marked as "AI" by examiners.)

WHY NOT USE (double) or (int)?
    Casting works differently. Integer.parseInt is the PROPER way
    to convert a String to a number, and most exam rubrics
    prefer this method.

WHAT IF THE USER TYPES SOMETHING WRONG?
    Integer.parseInt("hello") throws NumberFormatException.
    ALWAYS wrap in try-catch!


================================================================
26. DECIMALFORMAT (Formatting to .00)
================================================================
CODE:
    import java.text.DecimalFormat;

    DecimalFormat df = new DecimalFormat("0.00");

    double price = 19.5;
    System.out.println(df.format(price));   // 19.50

    double total = 1234.5678;
    System.out.println(df.format(total));   // 1234.57

    // With a currency symbol:
    DecimalFormat money = new DecimalFormat("R#,##0.00");
    System.out.println(money.format(1234.5)); // R1,234.50

    // With printf instead:
    System.out.printf("%.2f%n", price);      // 19.50

WHAT IT DOES:
    Formats numbers to a specific number of decimal places.
    "0.00"      -> always shows 2 decimals
    "R#,##0.00" -> adds R symbol and thousand separators
    df.format(number) -> returns the formatted STRING

WHEN TO USE IT:
    - When showing MONEY (Rands, Dollars).
    - When showing AVERAGES or percentages.
    - When the sample output shows ".00" format.
    - When the question says "format to two decimal places".

COMMON PATTERNS:
    "0"        -> 5          (no decimals)
    "0.0"      -> 5.0        (1 decimal)
    "0.00"     -> 5.00       (2 decimals)
    "#,##0.00" -> 1,234.50   (thousands separator)
    "R#,##0.00"-> R1,234.50  (with R symbol)

WHY USE DECIMALFORMAT INSTEAD OF CASTING?
    Casting doesn't give you .00 formatting.
    DecimalFormat is the PROPER tool the examiners want.


================================================================
27. VALIDATIONS (Input, Range, Null)
================================================================
CODE:
    // 1. Null check (JOptionPane cancel):
    String input = JOptionPane.showInputDialog("Enter name:");
    if (input == null || input.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Name cannot be empty!");
    }

    // 2. Range check (marks between 0-100):
    int mark = Integer.parseInt(JOptionPane.showInputDialog("Enter mark:"));
    if (mark < 0 || mark > 100) {
        JOptionPane.showMessageDialog(null,
            "Mark must be between 0 and 100!");
    }

    // 3. Number format check:
    try {
        int age = Integer.parseInt(input);
        if (age < 0) {
            JOptionPane.showMessageDialog(null, "Age cannot be negative!");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Please enter a number!");
    }

    // 4. Loop until valid (do-while):
    int age;
    do {
        String text = JOptionPane.showInputDialog("Enter age:");
        try {
            age = Integer.parseInt(text);
            if (age < 0 || age > 120) {
                JOptionPane.showMessageDialog(null, "Invalid age!");
                age = -1;  // force loop to repeat
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a number!");
            age = -1;
        }
    } while (age == -1);

WHAT IT DOES:
    Validation = checking that input is CORRECT before using it.
    Common types:
      - Null / empty check (user clicked Cancel or left blank)
      - Range check (0-100, positive numbers, etc.)
      - Format check (is it actually a number?)
      - Length check (password at least 8 chars)

WHEN TO USE IT:
    - ALWAYS when taking input from users.
    - When the question says "validate the input".
    - When you use JOptionPane (especially since Cancel returns null).

THE GOLDEN RULE:
    Never trust user input. Always validate first, use second.


================================================================
SUMMARY TABLE - WHICH ONE DO I USE?
================================================================

TASK                          | TOOL
------------------------------|---------------------------------
Console input                 | Scanner
GUI input                     | JOptionPane.showInputDialog
Console output                | System.out.println / printf
GUI output                    | JOptionPane.showMessageDialog
String to int                 | Integer.parseInt(str)
String to double              | Double.parseDouble(str)
Format to .00                 | DecimalFormat("0.00")
Fixed-size list               | Array
Dynamic-size list             | ArrayList
Read every item (no index)    | for-each loop
Read with index               | for loop
Unknown number of loops       | while / do-while
Handle errors                 | try-catch
Hide data                     | private + getters/setters
Reuse parent code             | extends + super()
Force methods in child        | interface or abstract method
Same method, different output | Polymorphism (@Override)


================================================================
EXAM TIPS (VERY IMPORTANT)
================================================================
1. ALWAYS check for null after JOptionPane input.
2. ALWAYS wrap parseInt / parseDouble in try-catch.
3. ALWAYS use DecimalFormat for money (not casting).
4. NEVER use (double) or (int) casting for Strings — parse instead.
5. Use printf or DecimalFormat for neat tables.
6. Use for-each when you don't need the index.
7. Use normal for when you need the index (i).
8. Use .length for arrays (no parens) and .size() for ArrayList.
9. Use super() as the FIRST line in a child constructor.
10. Match the sample output EXACTLY — dashes, asterisks, spacing.

================================================================
END OF CHEAT SHEET
================================================================