open class tipoSerie {
    companion object {
        fun serieCreciente (valorMax: Double, numeroIntro: Int) {
            var cont = 0
            val resta: Double = valorMax - numeroIntro
            var sumaRestas: Double = resta

            println("$resta (0)")
            do {
                cont++
                println("$resta + ${resta+cont} ($cont)")
                sumaRestas += resta
            } while (resta.toInt() < valorMax)
        }

        fun serieDecreciente(valorMin: Double, numeroIntro: Int) {
            var cont = 0
            val resta: Double = numeroIntro - valorMin

            println("$resta (0)")
        }
    }
}