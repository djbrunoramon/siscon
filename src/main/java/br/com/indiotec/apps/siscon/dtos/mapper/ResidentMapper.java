package br.com.indiotec.apps.siscon.dtos.mapper;

import br.com.indiotec.apps.siscon.dtos.ResidentDto;
import br.com.indiotec.apps.siscon.dtos.views.ResidentView;
import br.com.indiotec.apps.siscon.model.Resident;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ResidentMapper {
    Resident residentDtoToResident(ResidentDto residentDto);

    ResidentDto residentToResidentDto(Resident resident);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateResidentFromResidentDto(ResidentDto residentDto, @MappingTarget Resident resident);

    Resident residentViewToResident(ResidentView residentView);

    ResidentView residentToResidentView(Resident resident);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateResidentFromResidentView(ResidentView residentView, @MappingTarget Resident resident);
}
