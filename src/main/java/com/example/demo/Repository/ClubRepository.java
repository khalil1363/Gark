package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {
	
    List<Club> findByClubNameContainingIgnoreCase(String clubName);

}