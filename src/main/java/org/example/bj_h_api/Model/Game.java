package org.example.bj_h_api.Model;

import jakarta.persistence.*;

import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Table
public class Game {
//    private final static AtomicInteger idGenerator= new AtomicInteger(0);
//    public Game(){ id = idGenerator.incrementAndGet(); }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Category category;




    public int getId() { return id; }
    public void setId() { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }


    enum Category{
        Survival, Sandbox, IdleGaming, FPS, RTS, RPG, MMORPG, MOBA, BattleRoyal, Rouge, Turnbased, Strategy, Simulation, Sport, Racing, Platform
    }
}
