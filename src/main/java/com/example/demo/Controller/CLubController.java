package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Club;
import com.example.demo.Service.CLubService;

@RestController
@RequestMapping("/club")
@CrossOrigin("*")

public class CLubController {
	@Autowired
	CLubService clubService;
	@RequestMapping(method=RequestMethod.GET)
	List<Club> getAllClubs(){
		return clubService.getAllClubs();
	}
	@RequestMapping(value = "/{id}",method=RequestMethod.GET)
	public Club getClubById(@PathVariable("id") Long id) {
		return clubService.getClub(id);
	}
	@RequestMapping(method=RequestMethod.POST)
	public Club createClub(@RequestBody Club club) {
		return clubService.saveClub(club);
	}
	@RequestMapping( method = RequestMethod.PUT)
	public Club updateClub(@RequestBody Club club) {
	    return clubService.UpdateClub(club);
	}
	@RequestMapping(value = "/{id}",method=RequestMethod.DELETE)
	public void deleteclub(@PathVariable("id") Long id) {
		clubService.deleteClubById(id);
	}
	 @RequestMapping(value = "/search", method = RequestMethod.GET)
	    public List<Club> searchClubs(@RequestParam("name") String clubName) {
	        return clubService.searchByClubName(clubName);
	    }
}