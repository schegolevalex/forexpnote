package com.schegolevalex.explanatorynote2.forexpnote.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.schegolevalex.explanatorynote2.forexpnote.entity.DescriptionForCourier}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record DescriptionForCourierDto(UUID id, String descriptionField, String descriptionOwner) implements Serializable {
  }