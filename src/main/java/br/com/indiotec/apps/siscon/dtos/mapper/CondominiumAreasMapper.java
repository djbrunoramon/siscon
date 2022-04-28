package br.com.indiotec.apps.siscon.dtos.mapper;

import br.com.indiotec.apps.siscon.dtos.CondominiumAreasDto;
import br.com.indiotec.apps.siscon.dtos.views.CondominiumAreasView;
import br.com.indiotec.apps.siscon.model.CondominiumAreas;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CondominiumAreasMapper {
    CondominiumAreas condominiumAreasDtoToCondominiumAreas(CondominiumAreasDto condominiumAreasDto);

    CondominiumAreasDto condominiumAreasToCondominiumAreasDto(CondominiumAreas condominiumAreas);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCondominiumAreasFromCondominiumAreasDto(CondominiumAreasDto condominiumAreasDto, @MappingTarget CondominiumAreas condominiumAreas);

    CondominiumAreas condominiumAreasViewToCondominiumAreas(CondominiumAreasView condominiumAreasView);

    CondominiumAreasView condominiumAreasToCondominiumAreasView(CondominiumAreas condominiumAreas);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCondominiumAreasFromCondominiumAreasView(CondominiumAreasView condominiumAreasView, @MappingTarget CondominiumAreas condominiumAreas);
}
