package org.snorri1986;

import io.swagger.annotations.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Tag(name = "API", description = "First documented endpoint")
public class CommonEndpoint {

    /**
     * Source: <a href="https://dev.to/optnc/openapi-java-annotation-for-better-api-documentation-43oe">...</a>
     */

    @ApiResponse(code = 200, message = "All good")
    @GET
    @Operation(summary = "Hello endpoint",
            description = "Generate hello endpoint")
    @Produces(MediaType.TEXT_PLAIN)
    @Parameter(description = "Empty payload", example = "null")
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}