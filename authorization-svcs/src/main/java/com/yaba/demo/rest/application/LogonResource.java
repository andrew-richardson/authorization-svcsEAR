package com.yaba.demo.rest.application;

import com.yaba.demo.bo.LogonBO;
import com.yaba.demo.model.domain.UserCredential;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by andrew on 8/31/16.
 */
@Path("logon")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LogonResource {

    private static Logger LOG = Logger.getLogger(LogonResource.class.getName());

    @Inject
    LogonBO logonBO;

    @POST
    public Response logonUser(UserCredential userCredential) {
        LOG.log(Level.INFO, userCredential.toString());
        logonBO.logon(userCredential);
        return Response.ok().build();
    }
}
