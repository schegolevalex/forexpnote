package com.schegolevalex.explanatorynote2.forexpnote.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

/**
 * DTO for {@link com.schegolevalex.explanatorynote2.forexpnote.entity.Person}
 */
@Value
public class PersonDto implements Serializable {
    UUID id;
    String firstName;
    String lastName;
    List<AddressDto> addressList;
}