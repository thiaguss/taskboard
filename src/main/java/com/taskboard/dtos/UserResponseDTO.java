package com.taskboard.dtos;

public record UserResponseDTO(
        Long id ,
        String name,
        String email
) {
}
