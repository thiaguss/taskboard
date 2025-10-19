package com.taskboard.dtos;

import java.util.List;

public record ProjectResponseDTO(
        Long id,
        String name,
        String description,
        List<UserRequestDTO> participants
) {
}
