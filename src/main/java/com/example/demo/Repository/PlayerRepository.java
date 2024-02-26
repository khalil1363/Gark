package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	  Optional<Player> findFirstByLeagalefullnameIgnoreCase(String leagalefullname);
}