package com.taskboard.dtos;

import java.util.List;

public record ProjectDTO(
        String name,
        String description,
        List<UserDTO> participants
) {
}
