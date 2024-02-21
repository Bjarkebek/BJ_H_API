package org.example.bj_h_api.Model;

import jakarta.persistence.*;

@Entity
@Table
public class Android {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = true)
    private String model;
    @Column(nullable = true)
    private String os;
    @Column(nullable = true)
    private int releaseyear;




    public int getId() { return id; }
    public void setId() { this.id = id; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    public String getIos() { return os; }
    public void setIos(String ios) { this.os = ios; }
    public int getReleaseYear() { return releaseyear; }
    public void setReleaseYear() { this.releaseyear = releaseyear; }
}
