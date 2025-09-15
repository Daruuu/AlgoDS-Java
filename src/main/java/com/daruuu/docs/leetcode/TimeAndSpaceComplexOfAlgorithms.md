📌 Notas aclaratorias
O(n) significa que el algoritmo escala linealmente con el número de elementos de entrada (n).

O(m * n) indica una doble iteración, común en estructuras bidimensionales (e.g., matrices).

Optimización espacial es posible solo si no se necesita conservar los datos originales (es decir, si puedes sobrescribir).

| #   | Problema                    | ⏱ Tiempo   | 🧠 Espacio      | Comentario / Mejora Posible                                        |
| --- | --------------------------- | ---------- | --------------- | ------------------------------------------------------------------ |
| ✅ 1 | **Running Sum of 1D Array** | `O(n)`     | `O(n)`          | Se recorre el array una vez y se crea uno nuevo.                   |
|     |                             |            | **`O(1)` opt.** | Si se permite mutar el input: se puede optimizar a `O(1)` espacio. |
| ✅ 2 | **Richest Customer Wealth** | `O(m * n)` | `O(1)`          | `m = clientes`, `n = cuentas`. Recorre toda la matriz.             |
|     |                             |            |                 | Uso de variables escalares sin estructuras extra.                  |
| ✅ 3 | **FizzBuzz**                | `O(n)`     | `O(n)`          | Se genera una lista de tamaño `n`.                                 |
|     |                             |            | **`O(1)` opt.** | Si imprimieras directamente en consola, sin guardar lista.         |
