package com.taskboard.dtos;

import com.taskboard.enums.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TaskRequestDTO(
        @NotBlank String title,
        String description,
        @NotNull Status status,
        @NotNull ProjectRequestDTO project,
        @NotNull UserRequestDTO responsible
) {
}
