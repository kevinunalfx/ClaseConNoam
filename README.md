//ClaseConNoam

# Conversión de Primitivos a Objetos en Java

Este repositorio contiene un ejemplo sencillo de cómo convertir datos primitivos a objetos (`Integer`, `Long`, etc) en Java utilizando:

- Nombre de persona
- Edad
- Carrera universitaria
- Teléfono

## Evidencias de Conversión

**Datos:**
- **Nombre:** Kevin Malagon Leal
- **Edad:** 25 años
- **Carrera:** Ingeniería en Sistemas y Computacion, Universidad Nacional de Colombia
- **Teléfono:** 3212843253L

**Conversiones realizadas:**

| Dato       | Primitivo | Objeto Wrapper        | Método Utilizado              |
|------------|-----------|------------------------|--------------------------------|
| Edad       | `int`     | `Integer`              | `Integer.valueOf(edad)`        |
| Teléfono   | `long`    | `Long`                 | `Long.valueOf(telefono)`       |
| Edad texto | `String`  | `Integer` (parseado)   | `Integer.parseInt(edadTexto)`  |
| Teléfono texto | `String`  | `Long` (parseado)     | `Long.parseLong(telefonoTexto)` |

## Ejecución
Compila y ejecuta el archivo `Main.java`.

```bash
javac src/Main.java
java src.Main

