# Part 3: Constructors in Java

Every time you create an object using the `new` keyword, a constructor is called automatically.

A constructor is a special member of a class that is automatically invoked when an object is created. Its primary purpose is to initialize the object's state.

## Properties of Constructor

1. It has the same name as the class.
2. It does not have any return type, not even `void`.
3. It can be `public`, `private`, or `protected`.
4. It can be `static` or non-static.
5. It can be overloaded.
6. It cannot be inherited.

## Types of Constructor

1. **Default Constructor**: A default constructor is automatically provided by the Java compiler ONLY if you don't write any constructor.
   * *Refer [DefaultConstructor.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part3_Constructors/DefaultConstructor.java)*
2. **No-Argument Constructor**: A constructor with no parameters is called a no-argument constructor.
   * *Refer [Non_ArgumentConstructor.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part3_Constructors/Non_ArgumentConstructor.java)*
3. **Parameterized Constructor**: A constructor with parameters is called a parameterized constructor.
   * *Refer [ParameterizedConstructor.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part3_Constructors/ParameterizedConstructor.java)*
4. **Copy Constructor**: A constructor that copies the values of an existing object to a new object is called a copy constructor.
   * *Refer [CopyConstructor.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part3_Constructors/CopyConstructor.java)*
5. **Private Constructor**: A constructor that is declared as private is called a private constructor.
   * *Refer [PrivateConstructor.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part3_Constructors/PrivateConstructor.java)*

## Constructor Overloading

Just like methods, constructors can also be overloaded.
* *Refer [ConstructorOverloading.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part3_Constructors/ConstructorOverloading.java)*

## Constructor Chaining

One constructor can call another constructor of the same class using `this()`. `this()` must be the first statement inside the constructor.
* *Refer [ConstructorChaining.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part3_Constructors/ConstructorChaining.java)*

If you don't use `this()` as the first statement, you will get a compile-time error.

### Incorrect Example (Compile-time Error):
```java
Student() {
    System.out.println("Hello");
    this("Rahul", 20); // Error: Constructor call must be the first statement
}
```

### Correct Example:
```java
Student() {
    this("Rahul", 20);
    System.out.println("Done");
}
```
