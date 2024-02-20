package org.example.bj_h_api.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Data {
    public static List<Game> games = new ArrayList<>(){};


    public Data(){
        Game g1 = new Game();
        g1.setName("Minecraft");
        g1.setCategory(Game.Category.Sandbox);
        games.add(g1);

        Game g2 = new Game();
        g2.setName("League of Legends");
        g2.setCategory(Game.Category.MOBA);
        games.add(g2);
    }
}
