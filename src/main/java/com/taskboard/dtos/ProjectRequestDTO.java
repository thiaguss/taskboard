package com.taskboard.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record ProjectRequestDTO(
        @NotBlank String name,
        @NotNull String description,
        @NotNull List<UserRequestDTO> participants
) {
}
