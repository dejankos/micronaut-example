package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/users")
class UserController(
    private val userService: UserService
) {

    @Post
    fun create(user: UserDTO) = userService.save(user)

    @Get
    fun findAll() = userService.findAll()

    @Get("/{name}")
    fun findByName(name: String) = userService.findByName(name)
}