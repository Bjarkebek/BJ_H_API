package org.example.bj_h_api.Service;

import org.example.bj_h_api.Model.Game;
import org.example.bj_h_api.Repository.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
     GameRepo repo;


    public List<Game> getAllGames() {
        List<Game> games = new ArrayList<Game>();
        repo.findAll().forEach(games::add);
        return games;
    }

    public Game getGameById(int id) {
        return repo.findById(id).get();
    }

    public void saveOrUpdateGame(Game game) {
        repo.save(game);
    }

    //deleting a specific record
    public void deleteGame(int id) {
        repo.deleteById(id);
    }
}





