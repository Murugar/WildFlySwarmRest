package com.iqmsoft.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.iqmsoft.service.AppService;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/")
@Produces(APPLICATION_JSON)
public class RootResource {

  @Inject
  AppService appService;

  @GET
  public List<String> get() {
    return appService.getResult();
  }
}
