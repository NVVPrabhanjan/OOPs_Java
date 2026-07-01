# Part 2: Classes and Objects

Classes and Objects are the core building blocks of Object-Oriented Programming (OOP).

## Class

A **class** is a blueprint (template) for creating objects. 
A class itself does not occupy memory for its data. Memory is allocated only when objects are created.

> [!NOTE]
> Refer to [Classes.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part2_Classes%26Objects/Classes.java) for code.

---

## Object

An **object** is a real instance of a class. If a class is a blueprint, an object is the actual thing created from it.

> [!NOTE]
> Refer to [Objects.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part2_Classes%26Objects/Objects.java) for code.

---

## Understanding Object Creation

Let's look at the following instantiation:
```java
Car car1 = new Car();
```

This single line performs three key steps:
1. **Memory Allocation**: The `new` keyword allocates memory in the Heap for the `Car` object.
2. **Constructor Execution**: The constructor initializes the object.
3. **Reference Assignment**: The reference variable `car1` stores the memory address of the created object.

### Memory Representation

```text
Stack Memory                                         Heap Memory
[ car1 ] ----------------------------------------->  [ Car Object ]
                                                     - brand: null
                                                     - color: null
```

> [!IMPORTANT]
> `car1` is not the object itself. It only stores a reference (address) to the object. The actual object lives in the Heap, and `car1` points to it.

For example:
```java
Car car1 = new Car();
Car car2 = car1;
```
Here, both references `car1` and `car2` point to the exact same object.

> [!NOTE]
> Refer to [ObjectReference.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part2_Classes%26Objects/ObjectReference.java) for code.

---

## Anonymous Objects

An object without any name is called an **anonymous object**.

```java
new Car(); // This is an anonymous object.
```

> [!NOTE]
> Refer to [AnonymousObject.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part2_Classes%26Objects/AnonymousObject.java) for code.

---

## Object Life Cycle

An object's life generally follows these stages:

1. **Class is loaded.**
2. **Object is created** using `new`.
3. **Constructor executes** to initialize the state.
4. **Object is used** via references.
5. **Object becomes unreachable** (no reference variable points to it).
6. **Garbage Collector** may reclaim its memory.
