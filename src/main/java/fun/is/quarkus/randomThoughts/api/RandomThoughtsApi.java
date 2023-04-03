package fun.is.quarkus.randomThoughts.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fun.is.quarkus.randomThoughts.dto.RandomThoughtDto;

@Path("/random-thoughts")
public interface RandomThoughtsApi {
    
    @POST
    @Path("/save-thought")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveThought(RandomThoughtDto thought);

    @GET
    @Path("/thoughts")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getThoughts();
}
