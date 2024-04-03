import java.lang.Math.random

class UserMenu {
    interface IMenu {
        fun mostrarMenu()
        fun generarSerie()
        fun jugarAhorcado()
    }

    fun mostrarMenu() {
        do {
            println("MENÚ:")
            println("1. Generar serie")
            println("2. Jugar al ahorcado:")
            println("3. Salir")
            println("Por favor, selecciona una opción: ")

            val option = readln().toIntOrNull()

            when (option) {
                1 -> //generarserie
                2 -> //jugarahorcado
                3 -> println("Saliendo...")
                else -> println("Opción no válida")
            }
        } while (option != 3)
    }

    fun generarSerie(): Double {
        do {
            var max = Math.random()
            max *= 100
            var min= Math.random()
            min *= 100

            val resta = max-min

        }while (max.toInt() >= 31 && max.toInt() <= 100 && min.toInt() <= 69 && min.toInt() >= 1 && resta.toInt() > 30)

        do {
            println(max)
            println("Introduce un número entre el rango: ")
            val numeroIntro = readln().toInt()

        } while ()
    }
}