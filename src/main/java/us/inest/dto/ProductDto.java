package us.inest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record ProductDto(Long id, @NotBlank String name, @Positive Double price) {
}
