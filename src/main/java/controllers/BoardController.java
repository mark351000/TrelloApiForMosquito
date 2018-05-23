package controllers;

import entityes.Board;

import javax.ws.rs.core.Response;
import org.codehaus.jackson.map.ObjectMapper;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

public class BoardController {

    public Board[] getAllBoards(){
        Board[] boards= null;
        String urlGetAllBoards = "https://api.trello.com/1/members/if086softserve/boards?key=9097df69617e33b2dd4d9fe573570eac&token=b30aab2aa99bd68be5f45032ce63c5568363b2bac0a5c6088743270acdb02493";

        try {

            ResteasyClient client = new ResteasyClientBuilder().build();
            ResteasyWebTarget target = client.target(urlGetAllBoards);

            Response response = target.request().get();

            String responseAsString = response.readEntity(String.class);

            ObjectMapper mapper = new ObjectMapper();

            boards = mapper.readValue(responseAsString, Board[].class);

        } catch (Exception e) {
            System.err.println(e);
        }

        return boards;
    }
}
