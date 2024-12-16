package com.schegolevalex.explanatorynote2.forexpnote.mapper;

import com.schegolevalex.explanatorynote2.forexpnote.dto.DescriptionForCourierDto;
import com.schegolevalex.explanatorynote2.forexpnote.entity.DescriptionForCourier;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)public interface DescriptionForCourierMapper {
    DescriptionForCourier toEntity(DescriptionForCourierDto descriptionForCourierDto);

    DescriptionForCourierDto toDto(DescriptionForCourier descriptionForCourier);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)DescriptionForCourier partialUpdate(DescriptionForCourierDto descriptionForCourierDto, @MappingTarget DescriptionForCourier descriptionForCourier);
}