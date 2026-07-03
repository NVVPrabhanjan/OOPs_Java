# Part 4: Variables in Java

Variables are used to store data. In Java, variables are categorized based on where they are declared and how long they live.

There are three main types of variables:
1. Local Variables
2. Instance Variables
3. Static (Class) Variables

Understanding these is essential because they determine scope, lifetime, and memory allocation.

## 1. Local Variables

* Declared inside the body of a method, constructor, or block.
* They only exist while the method/block is executing.
* Memory is allocated on the stack.
* Must be initialized before use.
* *Refer [LocalVariables.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part4_Variables/LocalVariables.java)*

## 2. Instance Variables

* Declared inside a class, but outside any method.
* Each object has its own copy of the instance variable.
* Memory is allocated on the heap (when the object is created).
* Can be accessed from anywhere within the class.
* *Refer [InstanceVariables.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part4_Variables/InstanceVariables.java)*

## 3. Static (Class) Variables

* Declared with the `static` keyword inside a class, but outside any method.
* Shared among all objects of the class (only one copy exists).
* Memory is allocated only once in the method area/heap (when class is loaded).
* *Refer [StaticVariables.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part4_Variables/StaticVariables.java)*

## Variable Shadowing

A local variable can hide (shadow) an instance variable with the same name.
