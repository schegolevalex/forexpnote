package com.schegolevalex.explanatorynote2.forexpnote.mapper;

import com.schegolevalex.explanatorynote2.forexpnote.dto.AddressDto;
import com.schegolevalex.explanatorynote2.forexpnote.entity.Address;
import org.mapstruct.*;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE
        , componentModel = MappingConstants.ComponentModel.SPRING
)
public interface AddressMapper {
    Address toEntity(AddressDto addressDto);

    AddressDto toDto(Address address);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Address partialUpdate(AddressDto addressDto, @MappingTarget Address address);
}
