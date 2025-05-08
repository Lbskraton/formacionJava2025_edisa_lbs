package com.edisa.formacion.mayo2025;

//Clase con las funciones que llamará cada ruta

//Indicamos las caracteristicas de la ruta, como son enviados los parametros a dicha funcion
//Etc con annotaciones (usando @)

//necesario importar ej ws.rs para obtener dichas anotaciones
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/QR")
@Produces(MediaType.APPLICATION_JSON)
public class ExerciseQRWizardResources {

    @POST
    @Path("/decipherQR")
    public Response decipherQR(){

    }








}
