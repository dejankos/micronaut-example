package com.example

import io.micronaut.runtime.Micronaut.build


private val log = logger("main")

fun main(args: Array<String>) {
    build()
            .args(*args)
            .packages("com.example")
            .start().also {
                log.info("Running with env = ${it.environment.activeNames}")
            }
}

