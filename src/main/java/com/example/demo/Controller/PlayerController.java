package com.example.demo.Controller;


import com.example.demo.Model.Player;
import com.example.demo.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/player")
@CrossOrigin("*")
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping( value="/getall" ,method = RequestMethod.GET)
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @RequestMapping(value = "/getone/{id}", method = RequestMethod.GET)
    public Player getPlayerById(@PathVariable("id") Long id) {
        return playerService.getPlayer(id);
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public Player createPlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    @RequestMapping(value="/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Player> updatePlayer(@PathVariable("id") Long id, @RequestBody Player playerDetails) {
        Player existingPlayer = playerService.getPlayer(id);
        if (existingPlayer != null) {
            // Set the ID to ensure the correct player is updated
            existingPlayer.setId(id);
            // Update fields
            existingPlayer.setLeagalefullname(playerDetails.getLeagalefullname());
            existingPlayer.setDateOfBirth(playerDetails.getDateOfBirth());
            existingPlayer.setMailAdress(playerDetails.getMailAdress());
            existingPlayer.setDiscordId(playerDetails.getDiscordId());
            existingPlayer.setWhatsappPhone(playerDetails.getWhatsappPhone());
            existingPlayer.setInGameName(playerDetails.getInGameName());
            existingPlayer.setSalary(playerDetails.getSalary());
            existingPlayer.setContratStart(playerDetails.getContratStart());
            existingPlayer.setContratEnd(playerDetails.getContratEnd());
            existingPlayer.setCountryOfResidence(playerDetails.getCountryOfResidence());
            existingPlayer.setJerseySize(playerDetails.getJerseySize());
            existingPlayer.setSocialMediaLinks(playerDetails.getSocialMediaLinks());
            // Save the updated player
            Player updatedPlayer = playerService.updatePlayer(existingPlayer);
            return ResponseEntity.ok(updatedPlayer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable("id") Long id) {
        playerService.deletePlayerById(id);
    }
}