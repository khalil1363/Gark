package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.AchivementsTeam;
import com.example.demo.Service.AchivementTeamService;
@RestController
@RequestMapping("/api/achivementTeam")
@CrossOrigin("*")

public class AchivementTeamController {
	@Autowired
	AchivementTeamService achievementTeamService;
	@RequestMapping(method=RequestMethod.GET)
	List<AchivementsTeam> getAllAchievementTeams(){
		return achievementTeamService.getAllAchivementsTeams();
	}
	@RequestMapping(value = "/{id}",method=RequestMethod.GET)
	public AchivementsTeam getAchivementsTeamById(@PathVariable("id") Long id) {
		return achievementTeamService.getAchivementsTeam(id);
	}
	@RequestMapping(method=RequestMethod.POST)
	public AchivementsTeam createAchivementsTeam(@RequestBody AchivementsTeam achivementTeam) {
		return achievementTeamService.saveAchivementsTeam(achivementTeam);
	}
	@RequestMapping( method = RequestMethod.PUT)
	public AchivementsTeam updateAchivementsTeam(@RequestBody AchivementsTeam achivementTeam) {
	    return achievementTeamService.UpdateAchivementsTeam(achivementTeam);
	}
	@RequestMapping(value = "/{id}",method=RequestMethod.DELETE)
	public void deleteAchivementsTeam(@PathVariable("id") Long id) {
		achievementTeamService.deleteAchivementsTeamById(id);
	}

}