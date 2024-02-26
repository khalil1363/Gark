package com.example.demo.Service;

import com.example.demo.Model.ContractPlayer;
import com.example.demo.Repository.ContractPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractPlayerServiceImpl implements ContractPlayerService {

    @Autowired
    ContractPlayerRepository contractPlayerRepository;

    @Override
    public ContractPlayer saveContractPlayer(ContractPlayer contractPlayer) {
        return contractPlayerRepository.save(contractPlayer);
    }

    @Override
    public ContractPlayer updateContractPlayer(ContractPlayer contractPlayer) {
        return contractPlayerRepository.save(contractPlayer);
    }

    @Override
    public void deleteContractPlayer(ContractPlayer contractPlayer) {
        contractPlayerRepository.delete(contractPlayer);
    }

    @Override
    public void deleteContractPlayerById(Long idContractPlayer) {
        contractPlayerRepository.deleteById(idContractPlayer);
    }

    @Override
    public ContractPlayer getContractPlayer(Long idContractPlayer) {
        return contractPlayerRepository.findById(idContractPlayer).orElse(null);
    }

    @Override
    public List<ContractPlayer> getAllContractPlayers() {
        return contractPlayerRepository.findAll();
    }
}
