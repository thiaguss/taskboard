package com.taskboard.dtos;

import com.taskboard.enums.Status;

public record TaskDTO(
        String title,
        String description,
        Status status,
        ProjectRequestDTO project,
        UserDTO responsible
) {
}
