package br.com.indiotec.apps.siscon.dtos.mapper;

import br.com.indiotec.apps.siscon.dtos.ResidentHabitationDto;
import br.com.indiotec.apps.siscon.dtos.views.ResidentHabitationView;
import br.com.indiotec.apps.siscon.model.ResidentHabitation;
import org.mapstruct.BeanMapping;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ResidentHabitationMapper {
    @Mapping(source = "residentId", target = "resident.id")
    @Mapping(source = "habitationId", target = "habitation.id")
    ResidentHabitation residentHabitationDtoToResidentHabitation(ResidentHabitationDto residentHabitationDto);

    @InheritInverseConfiguration(name = "residentHabitationDtoToResidentHabitation")
    ResidentHabitationDto residentHabitationToResidentHabitationDto(ResidentHabitation residentHabitation);

    @InheritConfiguration(name = "residentHabitationDtoToResidentHabitation")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateResidentHabitationFromResidentHabitationDto(ResidentHabitationDto residentHabitationDto, @MappingTarget ResidentHabitation residentHabitation);

    @Mapping(source = "residentId", target = "resident.id")
    @Mapping(source = "residentFirstName", target = "resident.firstName")
    @Mapping(source = "residentLastName", target = "resident.lastName")
    @Mapping(source = "residentBirthDate", target = "resident.birthDate")
    @Mapping(source = "residentContact", target = "resident.contact")
    @Mapping(source = "habitationId", target = "habitation.id")
    @Mapping(source = "habitationBlock", target = "habitation.block")
    @Mapping(source = "habitationFloor", target = "habitation.floor")
    @Mapping(source = "habitationNumber", target = "habitation.number")
    @Mapping(source = "habitationType", target = "habitation.type")
    ResidentHabitation residentHabitationViewToResidentHabitation(ResidentHabitationView residentHabitationView);

    @Mapping(target = "residentId", source = "resident.id")
    @Mapping(target = "residentFirstName", source = "resident.firstName")
    @Mapping(target = "residentLastName", source = "resident.lastName")
    @Mapping(target = "residentBirthDate", source = "resident.birthDate")
    @Mapping(target = "residentContact", source = "resident.contact")
    @Mapping(target = "habitationId", source = "habitation.id")
    @Mapping(target = "habitationBlock", source = "habitation.block")
    @Mapping(target = "habitationFloor", source = "habitation.floor")
    @Mapping(target = "habitationNumber", source = "habitation.number")
    @Mapping(target = "habitationType", source = "habitation.type")
    ResidentHabitationView ResidentHabitationToResidentHabitationView(ResidentHabitation residentHabitation);
}
