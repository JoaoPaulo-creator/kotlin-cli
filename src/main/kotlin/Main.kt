package org.example

fun main(args: Array<String>) {
    for ((i, v) in args.withIndex()) {
        when (val arg = args[i]) {
            "--search" -> {
                if (arg == v) {
                    println("Consultando por dólar americano...")
                }
            }
            else -> println("Flag inválida")
        }
    }
}
