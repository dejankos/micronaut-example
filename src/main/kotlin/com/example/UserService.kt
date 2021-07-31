package com.example

import javax.inject.Singleton

@Singleton
class UserService(
        private val userRepository: UserRepository
) {

    fun save(user: UserDTO) = userRepository.save(user.toEntity()).toDto()

    fun findAll() = userRepository.findAll().map { it.toDto() }

    fun findByName(name: String) = userRepository.findByName(name)?.toDto()

}