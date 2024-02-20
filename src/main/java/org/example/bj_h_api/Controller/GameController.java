package org.example.bj_h_api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/games/")
public class GameController {

    @GetMapping
    public static String getAllGames(){
        return "games woo";
    }
}