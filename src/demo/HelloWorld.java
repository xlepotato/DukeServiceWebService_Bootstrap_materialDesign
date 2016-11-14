package demo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * Created by 152658F on 11/14/2016.
 */

@Path("/hello")
public class HelloWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage(){
        return "Hello World!";
    }

}


