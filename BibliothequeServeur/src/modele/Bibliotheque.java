package modele;


import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import infrastructure.jaxrs.HyperLien;
import infrastructure.jaxrs.HyperLiens;
import infrastructure.jaxrs.annotations.ReponsesPUTOption;
import configuration.JAXRS;

public interface Bibliotheque {
	
	@PUT
	@Consumes(JAXRS.TYPE_MEDIA)
	@Produces(JAXRS.TYPE_MEDIA)
	@ReponsesPUTOption
	Optional<HyperLien<Livre>> chercher(Livre l);

	@GET
	@Path(JAXRS.SOUSCHEMIN_CATALOGUE)
	@Produces(JAXRS.TYPE_MEDIA)
	HyperLiens<Livre> repertorier();
	
}
