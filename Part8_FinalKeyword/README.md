# Part 8: The `final` Keyword in Java

The `final` keyword is used to **restrict modification**.

It can be applied to:
* Variables
* Methods
* Classes

```text
final
│
├── Variable
├── Method
└── Class
```

---

## Final Variable

A final variable can be assigned **only once**.
* *Refer [FinalVariableDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part8_FinalKeyword/FinalVariableDemo.java)*

### Final Local Variable
```java
final int x = 10;
```
`x` cannot be changed after assignment.

### Blank Final Variable
A blank final variable is declared without initialization but **must** be initialized exactly once (typically inside the constructor).
```java
class Student {
    final String name;

    Student(String name) {
        this.name = name;
    }
}
```

---

## Final Reference Variable

```java
final Student s = new Student();
```
You cannot change the reference variable to point to another object (e.g. `s = new Student();` is invalid). However, you **can** modify the object's internal fields (e.g. `s.name = "Rahul";` is valid).
* *Refer [FinalVariableDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part8_FinalKeyword/FinalVariableDemo.java)*

---

## Final Method

A final method **cannot be overridden** by subclasses.
```java
class Animal {
    final void sound() {
        System.out.println("Animal Sound");
    }
}
```
* *Refer [FinalMethodDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part8_FinalKeyword/FinalMethodDemo.java)*

---

## Final Class

A final class **cannot be inherited/extended**.
```java
final class Animal { }
```
`String` is a prominent example of a final class in Java.
* *Refer [FinalClassDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part8_FinalKeyword/FinalClassDemo.java)*

---

## Why is `String` Final?

* Security
* Immutability
* Thread safety
* Reliable hashing (important for collection keys like `HashMap`)

---

## `final` vs `finally` vs `finalize()`

| `final`                               | `finally`                                 | `finalize()`                                 |
| ------------------------------------- | ----------------------------------------- | -------------------------------------------- |
| Keyword                               | Block                                     | Method                                       |
| Restricts modification                | Executes cleanup code after `try`/`catch` | Called by the Garbage Collector (deprecated) |
| Used with variables, methods, classes | Used in exception handling                | Deprecated since Java 9                      |

