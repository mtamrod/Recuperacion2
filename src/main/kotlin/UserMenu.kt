class UserMenu {
    interface IMenu {
        fun mostrarMenu()
        fun generarSerie()
        fun jugarAhorcado()
    }

    fun mostrarMenu() {
        do {
            println("MENÚ:")
            println("1. Generar TipoSerie")
            println("2. Jugar al ahorcado:")
            println("3. Salir")
            println("Por favor, selecciona una opción: ")

            val option: Int? = readln().toIntOrNull()

            when (option) {
                1 -> generarSerie()
                2 -> jugarAhorcado()
                3 -> println("Saliendo...")
                else -> println("Opción no válida")
            }
        } while (option != 3)
    }

    private fun generarSerie() {
        var valorMax: Int
        var valorMin: Int

        do {
            valorMax = Math.random().toInt()
            valorMax *= 100
            valorMin = Math.random().toInt()
            valorMin *= 100

            val resta = valorMax - valorMin

        } while (valorMax in 31..100 && valorMin <= 69 && valorMin >= 1 && resta > 30)

        println("Introduce un número entre [${valorMin} - ${valorMax}]: ")
        val numeroIntro: Int = readln().toInt()

        if (valorMax - numeroIntro > numeroIntro - valorMin) {
            TipoSerie.serieCreciente(valorMax, numeroIntro)
        } else {
            TipoSerie.serieDecreciente(valorMin, numeroIntro)
        }
    }

    private fun jugarAhorcado() {
        Ahorcado.jugar()
    }
}