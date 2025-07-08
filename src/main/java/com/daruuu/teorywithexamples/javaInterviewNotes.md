
### 1) ¿Qué son los bloques estáticos y los inicializadores estáticos en Java?

Un **bloque estático** (también llamado **inicializador estático**) es un bloque de código <br>
que se ejecuta **una sola vez**, cuando la clase se **carga en memoria** <br>
por primera vez, **antes de crear cualquier objeto o llamar a métodos estáticos**.

```java
class Ejemplo {
    static {
        System.out.println("Bloque estático ejecutado");
    }

    public static void main(String[] args) {
        System.out.println("Método main");
    }
}
```
**Salida:**

```
Bloque estático ejecutado  
Método main
```

Se usa típicamente para **inicializar variables estáticas**.

---

### 2) ¿Cómo llamar a un constructor desde otro constructor?

Puedes llamar a otro constructor de la **misma clase** usando `this(...)` <br>
como **primera línea** en el constructor.

```java
class Persona {
    String nombre;
    int edad;

    Persona(String nombre) {
        this(nombre, 0); // llama al otro constructor
    }

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
```

---

### 3) ¿Qué es la sobrescritura de métodos (*method overriding*) en Java?

La **sobrescritura** es cuando una subclase proporciona su **propia implementación** de un método que ya existe en la clase padre, manteniendo la **misma firma del método**.

```java
class Animal {
    void sonido() {
        System.out.println("Sonido genérico");
    }
}

class Perro extends Animal {
    @Override
    void sonido() {
        System.out.println("Guau guau");
    }
}
```

---

### 4) ¿Qué es la palabra clave `super` en Java?

La palabra clave `super` se usa para:

* Llamar al **constructor de la clase padre**: `super(...)`
* Acceder a un **método o variable de la clase padre** que fue sobrescrita.

```java
class   Animal {
    void    sonido() {
        System.out.println("Sonido de animal");
    }
}

class Gato extends Animal {
    void sonido() {
        super.sonido(); // llama al método de la clase padre
        System.out.println("Miau miau");
    }
}
```
---

### 5) ¿Diferencia entre sobrecarga de métodos y sobrescritura de métodos en Java?

| Característica            | Sobrecarga (**Overloading**)                | Sobrescritura (**Overriding**)                  |
| ------------------------- | ------------------------------------------- | ----------------------------------------------- |
| ¿Dónde ocurre?            | En la **misma clase**                       | Entre **clase padre e hija**                    |
| ¿Firma del método?        | **Mismo nombre**, **diferentes parámetros** | **Mismo nombre y mismos parámetros**            |
| ¿Tipo de retorno?         | Puede variar                                | Debe ser **igual o compatible (covariante)**    |
| ¿Palabra clave necesaria? | No                                          | Se recomienda `@Override`                       |
| ¿Ejemplo clásico?         | `print(int)` vs `print(String)`             | Método `toString()` sobrescrito en una subclase |

---

### 6) ¿Diferencia entre clase abstracta e interfaz en Java?

| Característica               | Clase abstracta                           | Interfaz                                               |
| ---------------------------- | ----------------------------------------- | ------------------------------------------------------ |
| ¿Puede tener implementación? | Sí, métodos concretos y abstractos        | Desde Java 8, puede tener `default` y `static` métodos |
| ¿Palabra clave?              | `abstract`                                | `interface`                                            |
| ¿Constructores?              | Sí                                        | No                                                     |
| ¿Herencia múltiple?          | No (solo una clase abstracta a la vez)    | Sí (puede implementar múltiples interfaces)            |
| ¿Uso típico?                 | Cuando quieres **reutilizar código base** | Cuando defines un **contrato funcional**               |

---

### 7) ¿Por qué Java es independiente de la plataforma?

Java es independiente de la plataforma porque **compila a bytecode**, <br>
que se ejecuta en la **Java Virtual Machine (JVM)**. <br>
La JVM es específica para cada sistema operativo, por lo que el mismo bytecode puede ejecutarse en cualquier sistema donde haya una JVM instalada.

🔁 *Escribe una vez, ejecuta en cualquier parte* (Write Once, Run Anywhere - WORA)

---

### 8) ¿Qué es la sobrecarga de métodos (*method overloading*) en Java?

La **sobrecarga** ocurre cuando hay **múltiples métodos con el mismo nombre**, pero con **diferente número o tipo de parámetros**, en la misma clase.

```java
void saludar(String nombre) { }
void saludar(String nombre, int edad) { }
```

No depende del tipo de retorno. Se usa para mejorar la **legibilidad y flexibilidad**.

---

### 9) ¿Cuál es la diferencia entre C++ y Java?

| Aspecto            | C++                        | Java                                   |
| ------------------ | -------------------------- | -------------------------------------- |
| Lenguaje           | Compilado a código máquina | Compilado a bytecode (JVM)             |
| Gestión de memoria | Manual (con `delete`)      | Automática (Garbage Collector)         |
| Punteros           | Sí, uso explícito          | No, acceso seguro a memoria            |
| Herencia múltiple  | Sí (con conflictos)        | No (pero permite múltiples interfaces) |
| Paradigma          | Multiparadigma             | Principalmente orientado a objetos     |
| Portabilidad       | Baja                       | Alta (plataforma independiente)        |

---

### 10) ¿Qué es el compilador JIT?

**JIT (Just-In-Time Compiler)** es una parte del JVM que **convierte bytecode en código máquina nativo** justo en el momento de la ejecución. Esto permite que el código se **optimice en tiempo real**, aumentando la velocidad de ejecución respecto a la interpretación pura.

👉 Es una optimización **híbrida** entre compilación y ejecución, que analiza el comportamiento del programa y aplica técnicas como **inlining** y **eliminación de código muerto**.

---

