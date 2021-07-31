package com.example

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class UserControllerTest(
        @Inject private val userClient: UserClient
) {

    @Test
    fun `should read test data from db`() {
        val found = userClient.findAll()
        assertTrue(found.isNotEmpty())

        val userNames = found.map { it.name }.toSet()

        // data from flyway migration script V2__test_data.sql
        assertTrue(userNames.contains("paro"))
        assertTrue(userNames.contains("muz"))
    }
}

@Client("/users")
interface UserClient {

    @Get
    fun findAll(): List<UserDTO>

}
