package org.snorri1986;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class CommonEndpoint {

    /**
     *
     * Source: <a href="https://dev.to/optnc/openapi-java-annotation-for-better-api-documentation-43oe">...</a>
     */

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}