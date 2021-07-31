package com.example

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import javax.transaction.Transactional

@JdbcRepository(dialect = Dialect.POSTGRES)
interface UserRepository : CrudRepository<User, Long> {

    fun findByName(name: String): User?
}