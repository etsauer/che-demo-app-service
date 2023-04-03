package fun.is.quarkus.randomThoughts.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import fun.is.quarkus.randomThoughts.api.RandomThoughtsApi;
import fun.is.quarkus.randomThoughts.dto.RandomThoughtDto;
import fun.is.quarkus.randomThoughts.mapper.RandomThoughtMapper;
import fun.is.quarkus.randomThoughts.model.RandomThought;

public class RandomThoughts implements RandomThoughtsApi{

    @Inject
    private RandomThoughtMapper mapper;

    @Override
    @Transactional
    public Response saveThought(RandomThoughtDto thought) {
        try {
            mapper.dtoToEntity(thought).persist();
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }
        return Response.ok().build();
    }

    @Override
    public Response getThoughts() {
        List<RandomThoughtDto> dtos;
        try {
            dtos = mapper.entitiesToDtos(RandomThought.findAll().list());
        } catch (Exception e) {
            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }
        return Response.ok(dtos).build();
    }
    
}
