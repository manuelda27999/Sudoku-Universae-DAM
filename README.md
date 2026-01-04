# Sususudoku - Java Swing Sudoku Game

**Sususudoku** es una aplicación de escritorio desarrollada en **Java** utilizando la biblioteca **Swing**. Permite a los usuarios jugar al Sudoku clásico con diferentes niveles de dificultad, validación en tiempo real y herramientas de ayuda.

## 🚀 Características

El proyecto incluye las siguientes funcionalidades principales:

* **Generación de Puzzles:** Crea tableros de Sudoku aleatorios con tres niveles de dificultad:
    * **Fácil:** 49 elementos eliminados.
    * **Medio:** 56 elementos eliminados.
    * **Difícil:** 61 elementos eliminados.
* **Validación de Reglas:** Comprueba automáticamente que no se repitan números en filas, columnas o regiones de 3x3.
* **Herramientas de Ayuda:**
    * **Get Clue (Obtener Pista):** Rellena una celda vacía aleatoria con el número correcto.
    * **Resolve Sudoku (Resolver):** Muestra la solución completa del tablero actual.
    * **Correct Sudoku (Corregir):** Verifica si el Sudoku completado es correcto y muestra un mensaje de felicitación o error.
* **Gestión del Tablero:**
    * **Clean Sudoku:** Limpia todo el tablero para empezar de nuevo.
    * **Celdas Estáticas:** Los números iniciales generados por el juego se bloquean (no editables) y cambian de color para diferenciarlos de las entradas del usuario.
* **Entrada de Datos Restringida:** Utiliza una clase personalizada `PersonalizedTextField` que limita la entrada a un solo dígito del 1 al 9.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java.
* **Interfaz Gráfica:** Java Swing (JFrame, JPanel, JButton, etc.).
* **IDE Recomendado:** NetBeans (el proyecto incluye archivos de configuración de NetBeans).

## 📂 Estructura del Proyecto

* **`src/sudoku/Sudoku.java`**: Contiene la lógica principal del juego, la generación de números aleatorios y el diseño de la interfaz.
* **`src/sudoku/PersonalizedTextField.java`**: Implementa un `DocumentFilter` para asegurar que el usuario solo introduzca números del 1 al 9.

## 💻 Instalación y Ejecución

1.  **Clonar el repositorio** o descargar los archivos fuente.
2.  **Abrir el proyecto** en NetBeans o tu IDE de Java preferido.
3.  **Compilar y ejecutar** la clase `Sudoku.java`.

### Requisitos
* Java JDK 8 o superior instalado.

---

**Autor:** Manuel David Castillo Pérez.
