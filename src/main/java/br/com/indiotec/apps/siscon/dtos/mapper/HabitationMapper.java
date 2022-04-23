package br.com.indiotec.apps.siscon.dtos.mapper;

import br.com.indiotec.apps.siscon.dtos.HabitationDto;
import br.com.indiotec.apps.siscon.dtos.views.HabitationView;
import br.com.indiotec.apps.siscon.model.Habitation;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HabitationMapper {
    Habitation habitationDtoToHabitation(HabitationDto habitationDto);

    HabitationDto habitationToHabitationDto(Habitation habitation);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateHabitationFromHabitationDto(HabitationDto habitationDto, @MappingTarget Habitation habitation);

    Habitation habitationViewToHabitation(HabitationView habitationView);

    HabitationView habitationToHabitationView(Habitation habitation);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateHabitationFromHabitationView(HabitationView habitationView, @MappingTarget Habitation habitation);
}
