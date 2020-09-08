package ch.srf

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
    build()
            .args(*args)
            .packages("ch.srf")
            .start()
}

