package com.github.goblinbr.example.web.rest;

import com.github.goblinbr.example.domain.entities.AccessCount;
import com.github.goblinbr.example.services.TestService;

import javax.inject.Inject;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestRest {

    @Inject
    private TestService testService;

    @PUT
    @Path("/count/{page}")
    @Produces(MediaType.APPLICATION_JSON)
    public AccessCount count(@PathParam("page") String page) {
        return testService.incrementAccessCount(page);
    }

}
