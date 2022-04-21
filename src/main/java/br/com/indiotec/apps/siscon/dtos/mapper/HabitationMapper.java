package br.com.indiotec.apps.siscon.dtos.mapper;

import br.com.indiotec.apps.siscon.dtos.HabitationDto;
import br.com.indiotec.apps.siscon.model.Habitation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HabitationMapper {

    HabitationDto entityToDto (Habitation habitation);
    Habitation DtoToEntity (HabitationDto habitationDto);
}
