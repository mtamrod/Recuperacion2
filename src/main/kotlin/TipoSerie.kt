open class TipoSerie {
    companion object {
        fun serieCreciente (valorMax: Double, numeroIntro: Int) {
            var cont = 0
            val resta: Double = valorMax - numeroIntro
            var sumaRestas: Double = resta

            println("$resta (0)")
            do {
                cont++
                println("${resta.toInt()} + ${resta.toInt()+cont} ($cont)")
                sumaRestas += resta.toInt()
            } while (resta.toInt() < valorMax.toInt())
            println("Suma => ${sumaRestas.toInt()}")
        }

        fun serieDecreciente(valorMin: Double, numeroIntro: Int) {
            var cont = 1
            val resta: Double = numeroIntro - valorMin
            var sumaRestas: Double = resta

            println("0$cont -> $resta")
            do {
                cont++
                println(" 0$cont -> ${resta.toInt()} - ${resta.toInt()+cont}")
                sumaRestas += resta.toInt()
            } while (resta.toInt() > valorMin)
            println("Total => ${sumaRestas.toInt()}")
        }
    }
}