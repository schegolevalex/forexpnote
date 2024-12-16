package com.schegolevalex.explanatorynote2.forexpnote.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.UUID;

/**
 * DTO for {@link com.schegolevalex.explanatorynote2.forexpnote.entity.Address}
 */
@Value
public class AddressDto implements Serializable {
    UUID id;
}