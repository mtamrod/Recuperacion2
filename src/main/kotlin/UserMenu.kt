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
}