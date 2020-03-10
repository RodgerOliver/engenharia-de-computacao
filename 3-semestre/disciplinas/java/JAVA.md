# Java

Java is a high-level language, platform independent owned by Oracle.

## Hello World

```
class HelloWorld {
	public static void main(String[ ] args) {
		/* print line on the console */
		System.out.println("Hello World");
	}
}
```

In Java, each line of code that runs must be inside a class. The entry point of an application is the `main` method

The `public` means that any other class or instance can access it, it can run without an instance because of `static`, `void` is the type that it returns, meaning no return and `main` is its name.

## Variables

```
String name = "Bob";
int age = 26;
double height = 15.6;
char letter = 'C';
boolean online = true;
```

## Operators

### Math
- `+`: addition
- `-`: subtraction
- `*`: multiplication
- `/`: division
- `%`: modulo

**NOTE:** Java is smart with different type of variables when it comes to math.

### Condition
- `<`:  less than
- `>`:  greater than
- `!=`: not equal to
- `==`: equal to
- `<=`: less than or equal to
- `>=`: greater than or equal to

### Logical
- `&&`: and
- `||`: or
- `!`:  not (negation)

**NOTE**: string concatenation is made with `+`.

## Get Input

```
import java.util.Scanner;

class Main {
	public static void main(String[ ] args) {
		Scanner var = new Scanner(System.in);
		System.out.println(var.nextLine());
	}
}
```

Some other methods of Scanner object:

- `nextByte()`: read a byte
- `nextShort()`: read a short
- `nextInt()`: read an int
- `nextLong()`: read a long
- `nextFloat()`: read a float
- `nextDouble()`: read a double
- `nextBoolean()`: read a boolean
- `nextLine()`: read a complete line
- `next()`: read a word

## Conditionals

### If...Else
```
if (condition) {
   // if code
} else if(other condition) {
	// else if code
} else {
	 // else code
}
```

### Switch...Case

```
switch (expression) {
	case 'a' :
		// if expression equals 'a'
		break;
	case 'b' :
		// if expression equals 'b'
		break;
	default : //Optional
		// default code
}
```

## Loops

### While
```
while(condition) {
	// code
}
```

### For

```
for(initialization; condition; increment/decrement) {
	// code
}

for(int x = 1; x <=5; x++) {
	System.out.println(x);
}
```

### Do...While

```
do {
	// code
} while(condition);
```

### Loop Control
- `break`: exit loop
- `continue`: skip loop

## Array
In Java, arrays have a fixed length and there is support for multidimensional arrays.

```
int[] numbers = new int[5];
numbers[0] = 10;
numbers.length; // return array length

String letters[] = {"A", "B", "C"};

int[ ] primes = {2, 3, 5, 7};

for(int t: primes) {
	System.out.println(t);
}
```

## Classes and Objects

Java is an OOP (Object Oriented Programming) language intended to make the thinking about programming closer to the real world.

Objects have attributes (characteristics) and methods (actions). They also have an identity which is its name.

Classes are the abstraction of objects, the pattern.

A car is an object, while vehicle is its class. Objects are instances of a Class.

There are four core concepts in OOP:
- encapsulation
- inheritance
- polymorphism
- abstraction

### Methods

```
class Main {

	/* if omitted, the visibility is default (like public) */
	static void sayHello(String name) {
		System.out.println("Hello World and " + name);
	}
	
	static int sum(int val1, int val2) {
		return val1 + val2;
	}

	public static void main(String[ ] args) {
		sayHello("Bob");

		int num = sum(5, 6);
	}
}
```

### Classes

```
public class Animal {
	int age;
	String name;

	void eat() {
		System.out.println("Nice food!");
	}
}

class Main() {
	public static main(String[] args) {
		/* create object or instantiate */
		Animal dog = new Animal();

		/* set attributes */
		dog.name = "Bob";
		dog.age = 3;

		/* execute method */
		dog.eat();
	}
}
```

### Access Modifiers
- `default`:   available to any other class in the package
- `public`:    accessible by any other class
- `protected`: provides the same access as the default access modifier, with the addition that subclasses can access protected methods and variables of the superclass
- `private`:   accessible by only the class itself

It's a best practice to keep the variables within a class private and use `Getters` and `Setters` to manipulate this data.

### Getters and Setters

They are used to protect the class' data. This way, private attributes are changed ans set by those methods.

```
public class Vehicle {
	private String color;

	/* Getter */
	public String getColor() {
		return color;
	}

	/* Setter */
	public void setColor(String c) {
		this.color = c; // this refers to the current object
	}
}
```

### Constructor

Constructors are called when an object is created. Its name must be the same name as the class and it must have no explicit return value.

Constructors will setup the defaults for the object.

```
public class Vehicle {
	private String color;

	Vehicle() {
		this.setColor("red");
	}
	Vehicle(String c) {
		this.setColor(c);
	}

	/* Setter */
	public void setColor(String c) {
		this.color = c;
	}
}

public class Main {
	public static void main(String[ ] args) {
		Vehicle v1 = new Vehicle("blue"); // color is blue
		Vehicle v2 = new Vehicle(); // color is red
	}
}
```

### Value and Reference Types

Value types are `int`, `float`, `char`... When a method is called it operates on the variable's value, not in the variable itself.

Reference types are `String`, `Array`, `class`... They store a location to to other variable (like pointers). When they are passed as parameters, their actual value is changed.

### Math Class
- `Math.abs(int a)`: absolute value
- `Math.ceil(double a)`: round a floating point value up
- `Math.floor(double a)`: round a floating point value down
- `Math.max(int a, int b)`: return largest parameters
- `Math.min(int a, int b)`: return slowest parameters
- `Math.pow(int a)`: power first parameter to the second

### Static

Static methods or attributes belong to the class. There is only one instance of a static member.

```
public class Counter {
  public static int COUNT=0;
  Counter() {
    COUNT++; // count number of instances
  }
}
```

### Final

Final is used to create constants.

```
public static final double PI = 3.14;
```

### Packages

Packages are used to avoid name conflicts and to control the access to classes.

```
Java Project

├── MyProject
│   └── src/
│       └── default/ (package)
│           └── Main.java
│       └── package1/ (package)
│           └── Vehicle.java
│           └── Fruit.java
└── trunk/
```

All files on `package1/` folder must contain `package package1;` at the top, to indicate that this class is in the `package1` package.

To use the entire package of classes in the `Main.java` file put `import package1.*` at the top of the file. To import a specific class substitute the `*` by the class name.

### Encapsulation

This is one of the main concepts of OOP and its principle is to ensure that implementation details are not visible to users.
The variables will only be accessed through methods of the class. This is called "data hiding".

This is achieved setting the attributes as `private` and using getters and setters to manage them.

**Benefits**
- Control of the way data is accessed or modified
- More flexible and easily changed code
- Ability to change one part of the code without affecting other parts

### Inheritance

Other main concept of OOP is inheritance that enables one class to transfers or acquire properties from other class.

The class inheriting the properties of another is called `subclass` (child class or derived class). The class whose properties are inherited is called `superclass` (parent class or base class).

When one class is inherited from another class, it inherits all **non-private** properties.

```
class Animal {
	public String animal_class = "Mammal";
	protected int legs;

	public void eat() {
		System.out.println("Animal eats");
	}

	public Animal() {
		System.out.println("Animal constructor");
	}
}

class Dog extends Animal {
	// the Dog class inherits from the Animal class
	// Dog is a subclass and Animal is a superclass
	public Dog() {
		legs = 4;
		System.out.println("Dog constructor");
		System.out.println("Animal legs: " + super.animal_class); // super refers to the superclass
		System.out.println("Dog legs:    " + this.legs);
	}
}

class Main {
	public static void main(String[] args) {
		Dog bob = new Dog(); // runs the Animal and Dog constructors
		bob.eat();
	}
}
```

### Polymorphism

Another main concept of OOP is polymorphism. Its purpose is to change the behaviour of different subclasses inherited by the same superclass.

```
class Animal {
	public void makeSound() {
		System.out.println("Grr...");
	}
}
class Cat extends Animal {
	public void makeSound() {
		System.out.println("Meow");
	}
}
class Dog extends Animal {
	public void makeSound() {
		System.out.println("Woof");
	}
}
```

### Method Overriding (Runtime Polymorphism)

In polymorphism the method `makeSound` was overwritten by the subclasses in order to adapt itself for each subclass.

Rules for overriding:
- Should have the same return type and arguments
- The access level cannot be more restrictive than the overridden method's access level
- A method declared final or static cannot be overridden
- If a method cannot be inherited, it cannot be overridden
- Constructors cannot be overridden

### Method Overloading (Compile-Time Polymorphism)

When the methods have the same name but different parameters it is known as **method overloading**.

```
class Program {
	static double max(double a, double b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	static int max(int a, int b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		System.out.println(max(8, 17));
		System.out.println(max(3.14, 7.68));
	}

}
```

### Abstract Classes

Abstract classes cannot be instantiated and they are used as a pattern to mount another class that inherits its properties. **NOTE:** classes that contain an abstract method must be abstract too.

```
abstract class Animal {
	int legs = 0;
	abstract void makeSound();
	/*
	 * Every animal makes a sound, but each
	 * has a different way to do it, so the decision
	 * is made in the subclass not in the
	 * superclass, in this case the abstract class
	 *
	 */
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("Meow");
	}
}
```

### Interface

Interface is a completely abstract class that contains only abstract methods.

Some specifications for interfaces:
- May contain only `static final` variables
- Cannot contain a constructor because interfaces cannot be instantiated
- Interfaces can extend other interfaces
- A class can implement any number of interfaces
- An interface is implicitly abstract
- Each method in an interface is also implicitly public and abstract
- When an interface is implemented, all of its methods must be overwritten.

```
interface Animal {
	public void eat();
	public void makeSound();
}

class Cat implements Animal {
	public void makeSound() {
		System.out.println("Meow");
	}
	public void eat() {
		System.out.println("omnomnom");
	}
}
```

### Casting

#### Type

Assigning a value of a type to a variable of another type is known as casting.

```
int a = (int) 3.14;
```

#### Upcasting

Cast an instance of a subclass to its superclass.

```
Animal a = new Cat();
```

#### Downcasting

Cast an object of a superclass to its subclass.

```
Animal a = new Cat();
((Cat)a).makeSound();
```

### Anonymous Classes

Anonymous classes are a way to change or extend the exisisting classes on the fly. This change is applicable only for the current instance.

**NOTE:** `@Override` is and annotation in the code

```
class Machine {
	public void start() {
		System.out.println("Starting...");
	}
}

class Main {
	public static void main(String[ ] args) {
		Machine m = new Machine() {
			@Override public void start() {
				System.out.println("Wooooo");
			}
		};
		m.start();
	}
}
```

### Inner Classes

Class inside other class.

```
class Robot {
	int id;
	Robot(int i) {
		id = i;
		Brain b = new Brain();
		b.think();
	}

	private class Brain {
		public void think() {
			System.out.println(id + " is thinking");
		}
	}
}
```

### Comparing Objects

Comparing two objects from the same class and with the same value will note return true because the object is a pointer to a location in memory.

To compare them use the `equals` method in combination with the `hashCode` method.

```
class Animal {
	String name;
	Animal(String n) {
		name = n;
	}
	@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
	@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Animal other = (Animal) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
}
```

### Enum

Enum is used to define a small collection of constants.

```
enum Rank {
	SOLDIER,
	SERGEANT,
	CAPTAIN
}

Rank a = Rank.SOLDIER;

switch(a) {
	case SOLDIER:
		System.out.println("Soldier says hi!");
		break;
	case SERGEANT:
		System.out.println("Sergeant says Hello!");
		break;
	case CAPTAIN:
		System.out.println("Captain says Welcome!");
		break;
}
```

### Java API

This API contains a collection of packages with classes to use in Java applications. One of them is `awt` for creating user interfaces and drawing graphics and images. [Reference](http://docs.oracle.com/javase/7/docs/api).

```
import java.awt.*
```
