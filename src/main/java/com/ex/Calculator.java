package com.ex;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Calculator {
	
	@GET
	@Path("/sum/{left}/{right}")
	public int sum(@PathParam(value="left") int left , @PathParam(value="right") int right) {
		return left + right;
	}
	
	@GET
	@Path("/product/{left}/{right}")
	public int product(@PathParam(value="left") int left , @PathParam(value="right") int right) {
		return left * right;
	}
	
	@GET
	@Path("/minus/{left}/{right}")
	public int minus(@PathParam(value="left") int left , @PathParam(value="right") int right) {
		return left - right;
	}
}
