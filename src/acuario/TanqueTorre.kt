package acuario
import kotlin.math.PI

class TanqueTorre (override var Alto: Int, var diametro: Int): Acuario(Alto = Alto, Ancho = diametro, Largo = diametro) {
    override var volumen: Int

        get() = (Ancho / 2 * Largo / 2 * Alto / 1000 * PI).toInt()
        set(valor) {
            Alto = ((valor * 1000 / PI) / (Ancho / 2 * Largo / 2)).toInt()
        }

    override var agua = volumen * 0.8
    override val forma = "cilindro"
}