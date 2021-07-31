package com.example

import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
    val ctx = build()
            .args(*args)
            .packages("com.example")
            .start()

    val env = if (ctx.environment.activeNames.isEmpty()) {
        setOf("default")
    } else {
        ctx.environment.activeNames
    }

    println("Running with env = $env")
}

