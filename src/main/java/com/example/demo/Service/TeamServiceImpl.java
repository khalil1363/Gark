package com.example.demo.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Team;
import com.example.demo.Repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {
@Autowired
TeamRepository teamRepository;

@Override
public Team saveTeam(Team team) {
	
	return teamRepository.save(team);
}

@Override
public Team UpdateTeam(Team team) {
	return teamRepository.save(team);
}

@Override
public void deleteTeam(Team team) {
	teamRepository.delete(team);
	
}

@Override
public void deleteTeamById(Long idTeam) {
	teamRepository.deleteById(idTeam);
	
}

@Override
public Team getTeam(Long idClub) {
	
	return teamRepository.findById(idClub).get();
}

@Override
public List<Team> getAllTeams() {
	return teamRepository.findAll();
}
@Override
public List<Team> searchByTeamName(String teamName) {
    return teamRepository.findByTeamNameContainingIgnoreCase(teamName);
}
@Override
public List<String> findParticipatingTournamentsByTeamName(String teamName) {
    Optional<Team> team = teamRepository.findByTeamName(teamName);
    return team.map(Team::getParticipatingTournaments).orElse(Collections.emptyList());
}
}