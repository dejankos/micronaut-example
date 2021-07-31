package com.example


fun UserDTO.toEntity() = User(
        id = this.id,
        name = this.name
)

fun User.toDto() = UserDTO(
        id = this.id ?: 0,
        name = this.name
)