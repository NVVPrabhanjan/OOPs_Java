# Part 7: The `static` Keyword in Java

The `static` keyword is one of the most important Java concepts. It belongs to the **class** rather than to any specific object.

Without `static`, every object gets its own copy of members. With `static`, there is **only one shared copy**.

---

## What is `static`?

The `static` keyword makes a member belong to the **class** instead of the object.

```java
class Student {
    static String college = "BMSCE";
}
```

Here, `college` belongs to the class `Student`, not to individual objects.
* *Refer [StaticVariableDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part7_StaticKeyword/StaticVariableDemo.java)*

---

## Why Do We Need `static`?

Suppose every student belongs to the same college.

Without `static`:
```java
class Student {
    String name;
    String college = "BMSCE";
}
```
Every object stores the same college name, wasting memory.

Using `static`:
```java
class Student {
    String name;
    static String college = "BMSCE";
}
```
Only one copy exists in the Method Area, saving memory.

---

## Static Variables (Class Variables)

Static variables are shared by all objects.

```java
class Student {
    String name;
    static String college = "BMSCE";
}
```

Usage:
```java
System.out.println(Student.college);
```
* *Refer [StaticVariableDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part7_StaticKeyword/StaticVariableDemo.java)*

---

## Instance Variable vs Static Variable

| Instance Variable   | Static Variable                |
| ------------------- | ------------------------------ |
| Belongs to object   | Belongs to class               |
| One copy per object | One copy for entire class      |
| Stored in Heap      | Stored in Method Area          |
| Access using object | Prefer access using class name |

---

## Static Methods

Static methods belong to the class.

```java
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}
```

Usage:
```java
System.out.println(Calculator.add(10,20));
```
* *Refer [StaticMethodDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part7_StaticKeyword/StaticMethodDemo.java)*

---

## Can a Static Method Access Instance Variables?

No.
Static methods cannot access instance variables directly because instance variables belong to objects, and static methods do not know which object's variable should be accessed.
To access them, a static method must instantiate an object first:
```java
class Student {
    int age = 20;

    static void display() {
        Student s = new Student();
        System.out.println(s.age); // Valid
    }
}
```
* *Refer [StaticMethodDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part7_StaticKeyword/StaticMethodDemo.java)*

---

## Can an Instance Method Access Static Members?

Yes. Instance methods can access both static and instance members.

---

## Static Block

A static block executes **only once**, when the class is loaded. It runs before the `main` method.
* *Refer [StaticBlockDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part7_StaticKeyword/StaticBlockDemo.java)*

---

## Static Nested Class

A class declared static inside another class.
```java
Outer.Inner obj = new Outer.Inner();
```
* *Refer [StaticNestedClassDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part7_StaticKeyword/StaticNestedClassDemo.java)*

---

## Static Import

Allows calling static members directly without the class name qualifier.
```java
import static java.lang.Math.*;
```
* *Refer [StaticImportDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part7_StaticKeyword/StaticImportDemo.java)*
