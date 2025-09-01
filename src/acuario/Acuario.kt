package acuario

open class Acuario(
    open var Ancho: Int = 20,
    open var Alto: Int = 40,
    open var Largo:Int = 100) {

  open var volumen: Int
        get() = Ancho * Alto * Largo / 1000
        set(valor){
            Alto = (valor * 1000) / (Ancho * Largo)
        }

    open val forma: String = "rectangulo"

    open var agua: Double = 0.0
        get() = volumen * 0.9


    constructor(numeroPeces: Int) : this() {

        val tanque = numeroPeces * 2000 * 1.1
        Alto = (tanque / (Largo * Ancho)).toInt()
    }

    init {
        println("inicializando acuario")
    }

    fun imprimirTamaño() {
        println()
        println(forma)
        println(
        "Ancho:$Ancho cm " +
        "Alto:$Alto cm " +
        "Largo:$Largo cm")

        println("Volumen: $volumen l Agua: $agua l (${agua/volumen*100.0}% lleno)")


    }


}