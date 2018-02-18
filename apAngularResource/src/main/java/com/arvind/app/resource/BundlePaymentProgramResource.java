package com.arvind.app.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.context.annotation.Scope;

@Path(BundlePaymentProgramResource.ROOT)
@Scope("request")
public class BundlePaymentProgramResource {
	public static final String ROOT = "programs";

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getPrograms() {
		return Response.status(Status.OK).entity("Hello Arvind").build();
	}
}
