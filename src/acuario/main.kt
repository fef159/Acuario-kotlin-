package acuario

fun construirAcuario() {
    val miAcuario = Acuario()
    miAcuario.imprimirTamaño()
    miAcuario.Alto = 60
    miAcuario.imprimirTamaño()

    val acuario1 = Acuario()
    acuario1.imprimirTamaño()

    val acuario2 = Acuario(Ancho = 25)
    acuario2.imprimirTamaño()

    val acuario3 = Acuario(Largo = 25, Alto = 35)
    acuario3.imprimirTamaño()

    val acuario4 = Acuario(Ancho = 25, Alto = 35, Largo = 110)
    acuario4.imprimirTamaño()

    val acuario6 = Acuario(numeroPeces = 29)
    acuario6.imprimirTamaño()

    val acuario7 = Acuario(numeroPeces = 29)
    acuario7.imprimirTamaño()
    acuario7.volumen = 70
    acuario7.imprimirTamaño()

    val acuario8 = Acuario(Largo = 25, Alto = 40, Ancho = 25)
    acuario8.imprimirTamaño()


    val miTorre = TanqueTorre(diametro = 25, Alto = 40)
    miTorre.imprimirTamaño()

}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El Tiburón es de color: ${tiburon.color}")
    tiburon.comer()

    println("El Pez Payaso es de color: ${pezPayaso.color}")
    pezPayaso.comer()
}


    fun main() {
        construirAcuario()
        crearPeces()

    }
