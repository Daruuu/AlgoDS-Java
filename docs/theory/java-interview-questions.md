# Java Interview Questions & Answers

## 🔧 Core Java Concepts

### 1) What are static blocks and static initializers in Java?

A **static block** (also called **static initializer**) is a block of code that executes **only once**, when the class is **loaded into memory** for the first time, **before creating any object or calling static methods**.

```java
class Example {
    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
```

**Output:**
```
Static block executed  
Main method
```

It's typically used to **initialize static variables**.

---

### 2) How to call a constructor from another constructor?

You can call another constructor of the **same class** using `this(...)` as the **first line** in the constructor.

```java
class Person {
    String name;
    int age;

    Person(String name) {
        this(name, 0); // calls the other constructor
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

### 3) What is method overriding in Java?

**Method overriding** occurs when a subclass provides its **own implementation** of a method that already exists in the parent class, maintaining the **same method signature**.

```java
class Animal {
    void sound() {
        System.out.println("Generic sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof woof");
    }
}
```

---

### 4) What is the `super` keyword in Java?

The `super` keyword is used to:

* Call the **parent class constructor**: `super(...)`
* Access a **method or variable from the parent class** that was overridden.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        super.sound(); // calls the parent class method
        System.out.println("Meow meow");
    }
}
```

---

### 5) Difference between method overloading and method overriding in Java?

| Characteristic | Overloading | Overriding |
| -------------- | ----------- | ---------- |
| Where it occurs? | In the **same class** | Between **parent and child class** |
| Method signature? | **Same name**, **different parameters** | **Same name and same parameters** |
| Return type? | Can vary | Must be **same or compatible (covariant)** |
| Required keyword? | No | Recommended `@Override` |
| Classic example? | `print(int)` vs `print(String)` | `toString()` method overridden in subclass |

---

### 6) Difference between abstract class and interface in Java?

| Characteristic | Abstract Class | Interface |
| -------------- | -------------- | --------- |
| Can have implementation? | Yes, concrete and abstract methods | Since Java 8, can have `default` and `static` methods |
| Keyword? | `abstract` | `interface` |
| Constructors? | Yes | No |
| Multiple inheritance? | No (only one abstract class at a time) | Yes (can implement multiple interfaces) |
| Typical use? | When you want to **reuse base code** | When you define a **functional contract** |

---

### 7) Why is Java platform independent?

Java is platform independent because it **compiles to bytecode**, which runs on the **Java Virtual Machine (JVM)**. The JVM is specific to each operating system, so the same bytecode can run on any system where a JVM is installed.

🔁 *Write Once, Run Anywhere* (WORA)

---

### 8) What is method overloading in Java?

**Method overloading** occurs when there are **multiple methods with the same name**, but with **different number or type of parameters**, in the same class.

```java
void greet(String name) { }
void greet(String name, int age) { }
```

It doesn't depend on the return type. It's used to improve **readability and flexibility**.

---

### 9) What's the difference between C++ and Java?

| Aspect | C++ | Java |
| ------ | --- | ---- |
| Language | Compiled to machine code | Compiled to bytecode (JVM) |
| Memory management | Manual (with `delete`) | Automatic (Garbage Collector) |
| Pointers | Yes, explicit use | No, safe memory access |
| Multiple inheritance | Yes (with conflicts) | No (but allows multiple interfaces) |
| Paradigm | Multi-paradigm | Mainly object-oriented |
| Portability | Low | High (platform independent) |

---

### 10) What is the JIT compiler?

**JIT (Just-In-Time Compiler)** is a part of the JVM that **converts bytecode to native machine code** just at execution time. This allows the code to be **optimized in real-time**, increasing execution speed compared to pure interpretation.

👉 It's a **hybrid** optimization between compilation and execution, which analyzes program behavior and applies techniques like **inlining** and **dead code elimination**.

---

## 🎯 Interview Tips

### Common Follow-up Questions:
- Explain the Java memory model
- What is garbage collection?
- Difference between `==` and `.equals()`
- What are generics?
- Explain exception handling hierarchy

### Best Practices:
- Always use `@Override` annotation
- Prefer composition over inheritance
- Use `StringBuilder` for string concatenation in loops
- Understand the difference between checked and unchecked exceptions

---
