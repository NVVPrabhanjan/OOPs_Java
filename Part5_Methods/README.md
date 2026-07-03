# Part 5: Methods in Java

A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.

## 1. Method Definition

A method definition consists of:
* **Access Modifier**: Defines the access type of the method (e.g. `public`, `private`).
* **Return Type**: The data type of the value returned by the method, or `void` if it doesn't return anything.
* **Method Name**: The name of the method.
* **Parameters**: The list of input parameters (if any).
* **Method Body**: The block of code to be executed.

```java
accessModifier returnType methodName(parameters) {
    // Method Body
}
```

## 2. Calling a Method

To execute a method, you must call it by using its name followed by parentheses `()`.

* **Instance Method**: `objectName.methodName()`
* **Static Method**: `ClassName.methodName()`

## 3. Types of Methods

* **Instance Methods**: Belong to an object. Must be called on an object. Can access instance variables.
  * *Refer [InstanceMethodsDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part5_Methods/InstanceMethodsDemo.java)*
* **Static Methods**: Belong to the class itself. Called on the class name. Cannot access instance variables directly.
  * *Refer [StaticMethodsDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part5_Methods/StaticMethodsDemo.java)*
* **Constructors**: Special type of method-like construct used to initialize objects. Must have the same name as the class and has no return type.
  * *Refer [ConstructorsDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part5_Methods/ConstructorsDemo.java)*
* **Predefined Methods**: Built-in library methods.
  * *Refer [PredefinedMethods.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part5_Methods/PredefinedMethods.java)*
* **Varargs Methods**: Accept variable arguments.
  * *Refer [VarargsMethodsDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part5_Methods/VarargsMethodsDemo.java)*
* **Abstract Methods**: Declared without a body in interfaces/abstract classes.
  * *Refer [AbstractMethodsDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part5_Methods/AbstractMethodsDemo.java)*
