package com.example.demo.Service;

import com.example.demo.Model.ContractPlayer;
import java.util.List;
import java.util.Optional;

public interface ContractPlayerService {
    ContractPlayer saveContractPlayer(ContractPlayer contractPlayer);
    ContractPlayer updateContractPlayer(ContractPlayer contractPlayer);
    void deleteContractPlayer(ContractPlayer contractPlayer);
    void deleteContractPlayerById(Long idContractPlayer);
    ContractPlayer getContractPlayer(Long idContractPlayer);
    List<ContractPlayer> getAllContractPlayers();
    ContractPlayer createContractPlayer(ContractPlayer contractPlayer);
    // Additional methods can be defined here
}