open class TipoSerie {
    companion object {
        fun serieCreciente (valorMax: Int, numeroIntro: Int) {
            var cont = 0
            var numeroIntro1 = numeroIntro
            var sumaRestas = numeroIntro1
            val numeros: MutableList<String> = mutableListOf()

            numeros.add(numeroIntro1.toString())
            println("$numeroIntro1 ($cont)")
            do {
                cont++
                numeroIntro1 += 1
                numeros.add(numeroIntro1.toString())
                val numerosConMas = numeros.joinToString("+")
                println("$numerosConMas ($cont)")
                sumaRestas += numeroIntro
            } while (numeroIntro1 < valorMax)

            println("Suma => ${sumaRestas}")
        }

        fun serieDecreciente(valorMin: Int, numeroIntro: Int) {
            var cont = 0
            var numeroIntro1 = numeroIntro
            var sumaRestas = numeroIntro1
            var sumaDeSumas = numeroIntro1
            val numeros: MutableList<String> = mutableListOf()

            numeros.add(numeroIntro1.toString())
            println("0$cont-> $numeroIntro1 = $numeroIntro1")
            do {

                cont++
                numeroIntro1 -= 1
                numeros.add(numeroIntro1.toString())
                val numerosConMas = numeros.joinToString("+")
                sumaRestas += numeroIntro1
                sumaDeSumas += sumaRestas
                if (cont < 10) {
                    println("0$cont-> $numerosConMas = $sumaRestas")
                } else {
                    println("$cont-> $numerosConMas = $sumaRestas")
                }

            } while (numeroIntro1 > valorMin)

            println("Suma => ${sumaDeSumas}")
        }
    }
}