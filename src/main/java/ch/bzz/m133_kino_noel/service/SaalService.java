package ch.bzz.m133_kino_noel.service;

import ch.bzz.m133_kino_noel.data.DataHandler;
import ch.bzz.m133_kino_noel.model.Saal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;


/**
 * Saal service
 *
 * @author noel
 * @version 1.0
 */
@Path("Saal")
public class SaalService {

    /**
     * @return List of all saals
     * @throws JsonProcessingException
     */
    @GET
    @Path("list")
    @Produces(MediaType.APPLICATION_JSON)

    public Response listSaal() {
        List<Saal> saalList = DataHandler.getInstance().readallSaele();
        try {
            return Response
                    .status(200)
                    .entity(new ObjectMapper().writeValueAsString(saalList))
                    .build();
        } catch (JsonProcessingException e) {
            return Response
                    .status(500)
                    .entity("Fehler beim Serialisieren der Saale")
                    .build();
        }
    }

    /**
     * Read a saal by uuid
     *
     * @param saalUUID
     */
    @GET
    @Path("read/{uuid}")
    @Produces(MediaType.APPLICATION_JSON)

    public Response readSaal(
            @PathParam("uuid") String saalUUID

    ) {
        Saal saal = DataHandler.getInstance().readSaalByUUID(saalUUID);
        if (saal == null) {
            return Response
                    .status(404)
                    .entity("Saal nicht gefunden")
                    .build();
        }

        return Response
                .status(200)
                .entity(saal)
                .build();
    }
}
