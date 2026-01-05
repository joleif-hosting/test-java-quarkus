package com.test;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;

@Path("/")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String home() {
        return """
            <div style="padding: 2rem; font-family: sans-serif;">
                <h1>Hello from Quarkus!</h1>
                <p>Framework test repository</p>
            </div>
        """;
    }

    @GET
    @Path("/health")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> health() {
        return Map.of("status", "ok", "framework", "quarkus");
    }
}