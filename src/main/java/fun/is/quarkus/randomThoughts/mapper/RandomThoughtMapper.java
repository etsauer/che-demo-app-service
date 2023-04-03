package fun.is.quarkus.randomThoughts.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import fun.is.quarkus.randomThoughts.dto.RandomThoughtDto;
import fun.is.quarkus.randomThoughts.model.RandomThought;

@Mapper(componentModel = "cdi")
public interface RandomThoughtMapper {
    
    RandomThoughtDto entityToDto(RandomThought entity);
    RandomThought dtoToEntity(RandomThoughtDto dto);

    List<RandomThoughtDto> entitiesToDtos(List<RandomThought> entities);
    List<RandomThought> dtosToEntities(List<RandomThoughtDto> dtos);
}
