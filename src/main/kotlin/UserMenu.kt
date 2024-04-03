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
        var valorMax: Double
        var valorMin: Double

        do {
            valorMax = Math.random()
            valorMax *= 100
            valorMin = Math.random()
            valorMin *= 100

            val resta: Double = valorMax - valorMin

        } while (valorMax.toInt() in 31..100 && valorMin.toInt() <= 69 && valorMin.toInt() >= 1 && resta.toInt() > 30)

        println("Introduce un número entre [${valorMin.toInt()} - ${valorMax.toInt()}]: ")
        val numeroIntro: Int = readln().toInt()

        if (valorMax.toInt() - numeroIntro > numeroIntro - valorMin.toInt()) {
            TipoSerie.serieCreciente(valorMax, numeroIntro)
        } else {
            TipoSerie.serieDecreciente(valorMin, numeroIntro)
        }
    }

    private fun jugarAhorcado() {
        //TODO:
    }
}