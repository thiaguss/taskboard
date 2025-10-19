package com.taskboard.dtos;

import com.taskboard.enums.Status;

public record TaskResponseDTO(
        Long id,
        String title,
        String description,
        Status status,
        ProjectRequestDTO project,
        UserRequestDTO responsible
) {
}
