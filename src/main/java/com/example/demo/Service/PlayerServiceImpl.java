package com.example.demo.Service;

import com.example.demo.Model.Player;
import com.example.demo.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    @Override
    public Player savePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player updatePlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public void deletePlayer(Player player) {
        playerRepository.delete(player);
    }

    @Override
    public void deletePlayerById(Long idPlayer) {
        playerRepository.deleteById(idPlayer);
    }

    @Override
    public Player getPlayer(Long idPlayer) {
        return playerRepository.findById(idPlayer).orElse(null);
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
    @Override
    public Optional<Player> findPlayerByName(String leagalefullname) {
        return playerRepository.findFirstByLeagalefullnameIgnoreCase(leagalefullname);
    }
}