package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Team;
import com.example.demo.Service.TeamService;

@RestController
@RequestMapping("/api/team")
@CrossOrigin("*")

public class TeamController {
	@Autowired
	TeamService teamService;
	@RequestMapping(method=RequestMethod.GET)
	List<Team> getAllTeams(){
		return teamService.getAllTeams();
	}
	@RequestMapping(value = "/{id}",method=RequestMethod.GET)
	public Team getTeamById(@PathVariable("id") Long id) {
		return teamService.getTeam(id);
	}
	@RequestMapping(method=RequestMethod.POST)
	public Team createTeam(@RequestBody Team team) {
		return teamService.saveTeam(team);
	}
	@RequestMapping( method = RequestMethod.PUT)
	public Team updateClub(@RequestBody Team team) {
	    return teamService.UpdateTeam(team);
	}
	@RequestMapping(value = "/{id}",method=RequestMethod.DELETE)
	public void deleteclub(@PathVariable("id") Long id) {
		teamService.deleteTeamById(id);
	}
	 @RequestMapping(value = "/search", method = RequestMethod.GET)
	    public List<Team> searchTeams(@RequestParam("name") String teamName) {
	        return teamService.searchByTeamName(teamName);
	    }
	 @GetMapping("/tournaments/{teamName}")
	    public List<String> getTournamentsByTeamName(@PathVariable String teamName) {
	        return teamService.findParticipatingTournamentsByTeamName(teamName);
	    }
}