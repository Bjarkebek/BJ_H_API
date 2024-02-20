package org.example.bj_h_api.Controller;


import org.example.bj_h_api.Model.Data;
import org.example.bj_h_api.Model.Game;
import org.example.bj_h_api.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {
    @Autowired
    GameService gameService;


    @GetMapping
    public List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable int id) {
        return gameService.getGameById(id);
    }

    @PostMapping
    void createGame(@RequestBody Game game) {
        gameService.saveOrUpdateGame(game);
    }

    @PutMapping("/{id}")
    void updateGameById(@RequestBody Game updGame) {
        gameService.saveOrUpdateGame(updGame);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteGame(@PathVariable int id) {
        Game game = gameService.getGameById(id);
        if (game != null) {
            gameService.deleteGame(id);
            return true;
        }
        return false;
    }
}
