package com.example.demo.Controller;


import com.example.demo.Model.Player;
import com.example.demo.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
@CrossOrigin("*")
public class PlayerController {

    @Autowired
  private  PlayerService playerService;

    @GetMapping("/getAll")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/get/{id}")
    public Player getPlayerById(@PathVariable("id") Long id) {
        return playerService.getPlayer(id);
    }

    @PostMapping("/add")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    @PutMapping("/update/{id}")
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


    @DeleteMapping("/delete/{id}")
    public void deletePlayer(@PathVariable("id") Long id) {
        playerService.deletePlayerById(id);
    }
    @GetMapping("/getbyname/{leagalefullname}")
    public ResponseEntity<Player> getPlayerByName(@PathVariable("leagalefullname") String leagalefullname) {
        return playerService.findPlayerByName(leagalefullname)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}