package com.huawei.servicecomb.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2019-08-02T08:09:05.885Z")


@RestSchema(schemaId = "servicecombjaxrs")
@Path("/rest")

@Produces({ "application/json" })
public class ServicecombjaxrsImpl  {

    @Autowired
    private ServicecombjaxrsDelegate servicecombjaxrsDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return servicecombjaxrsDelegate.helloworld(name);
    }
}

