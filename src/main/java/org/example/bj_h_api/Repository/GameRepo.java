package org.example.bj_h_api.Repository;

import org.springframework.data.repository.CrudRepository;
// or
import org.springframework.data.jpa.repository.JpaRepository;

import org.example.bj_h_api.Model.Game;

public interface GameRepo extends CrudRepository<Game, Integer> {

}
