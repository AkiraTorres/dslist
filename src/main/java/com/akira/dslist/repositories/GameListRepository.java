package com.akira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
