package com.schegolevalex.explanatorynote2.forexpnote.mapper;

import com.schegolevalex.explanatorynote2.forexpnote.dto.PersonDto;
import com.schegolevalex.explanatorynote2.forexpnote.entity.Person;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)public interface PersonMapper {
    Person toEntity(PersonDto personDto);

    @AfterMapping
    default void linkAddressList(@MappingTarget Person person) {
        person.getAddressList().forEach(addressList -> addressList.setPerson(person));
    }

    PersonDto toDto(Person person);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)Person partialUpdate(PersonDto personDto, @MappingTarget Person person);
}