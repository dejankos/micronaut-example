package com.example

import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity(value = "users")
data class User(
        @field:Id
        @GeneratedValue(GeneratedValue.Type.AUTO)
        var id: Long?,
        val name: String
)