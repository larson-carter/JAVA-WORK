package api;

import javax.ws.rs.*;


@Path("/")
public class main {

	private static int wins, losses, ties;

	@GET
	@Path("/main")
	@Produces("application/json")
	public String getScore() {
		String pattern = "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
		return String.format(pattern, wins, losses, ties);
	}
	
	//localhost:8000/api/main?wins=1&losses=2&ties=3
	
	@PUT
	@Path("/main")
	@Produces("application/json")
	public String updateScore(@QueryParam("wins")int wins,@QueryParam("losses")int losses,@QueryParam("ties")int ties) {
		main.wins = wins;
		main.losses = losses;
		main.ties = ties;
		String pattern = "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
		return String.format(pattern, wins, losses, ties);
		
	}
	
	
	@POST @ Path("/main/wins")@Produces("text/plain")
	public int increaseWins() {
		return ++wins;
	}
	@POST @ Path("/main/losses")@Produces("text/plain")
	public int increaseLosses() {
		return ++losses;
	}
	@POST @ Path("/main/ties")@Produces("text/plain")
	public int increaseTies() {
		return ++losses;
	}
	@GET @ Path("/main/wins")@Produces("text/plain")
	public int getWins() {
		return wins;
	}
	@GET @ Path("/main/losses")@Produces("text/plain")
	public int getLosses() {
		return losses;
	}
	@GET @ Path("/main/ties")@Produces("text/plain")
	public int getTies() {
		return ties;
	}
}
