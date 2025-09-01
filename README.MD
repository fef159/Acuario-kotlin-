# Proyecto Acuario POO en Kotlin 🐟

Este repositorio contiene el desarrollo del **laboratorio de Programación Orientada a Objetos (POO)** en **Kotlin**, adaptado al tema de **acuarios**.  
Hasta el momento se ha trabajado **clases, constructores, getters/setters y herencia**.

---

## 🎯 Objetivo
- Comprender el uso de **clases y objetos** en Kotlin.  
- Implementar **constructores primarios y secundarios**.  
- Usar **`init`** para inicialización.  
- Aplicar **getters y setters personalizados**.  
- Extender una clase mediante **herencia** y sobrescribir (`override`) propiedades.  

---

## 📂 Estructura del proyecto
```
AcuarioPOO/
└── src/
    └── acuario/
        ├── Acuario.kt        # Clase base con constructores, init y métodos
        ├── TanqueTorre.kt    # Subclase que hereda de Acuario
        └── main.kt           # Pruebas y ejecución
```

---

## 🧩 Clases principales

### Clase `Acuario`
- Propiedades: `Ancho`, `Alto`, `Largo`.  
- Propiedad calculada `volumen` (con getter/setter).  
- Propiedad `agua` (90% del volumen).  
- Bloque `init` para mostrar mensaje al crear el objeto.  
- **Constructor secundario** que ajusta la altura en función del número de peces.  
- Método `imprimirTamaño()` para mostrar dimensiones, volumen y cantidad de agua.  

### Subclase `TanqueTorre`
- Hereda de `Acuario`.  
- Sobrescribe la propiedad `volumen` usando fórmula cilíndrica con `PI`.  
- Sobrescribe `agua` (80% del volumen).  
- Sobrescribe `forma` para mostrar `"cilindro"`.  

---

## ▶️ Ejemplo de uso (`main.kt`)

```kotlin
package acuario

fun main() {
    val a1 = Acuario()
    a1.imprimirTamaño()

    val a2 = Acuario(Ancho = 25)
    a2.imprimirTamaño()

    val a3 = Acuario(Alto = 35, Largo = 110)
    a3.imprimirTamaño()

    val a4 = Acuario(numeroPeces = 29)
    a4.imprimirTamaño()

    val torre = TanqueTorre(Diametro = 25, Alto = 40)
    torre.imprimirTamaño()
}
```

---

## ⚙️ Ejecución

En IntelliJ IDEA:  
1. Crear un proyecto Kotlin y copiar la carpeta `src`.  
2. Ejecutar `main.kt`.

En CLI:
```bash
kotlinc src -include-runtime -d AcuarioPOO.jar
java -jar AcuarioPOO.jar
```

---

## 📌 Estado actual
✔️ Clases y constructores  
✔️ Métodos `init`  
✔️ Getter y Setter personalizados  
✔️ **Herencia implementada (`TanqueTorre` hereda de `Acuario`)**  

🔜 Próximos pasos:  
- Clases abstractas (`Pez`).  
- Interfaces (`AccionPez`).  
- Polimorfismo con `Tiburon` y `PezPayaso`.  

