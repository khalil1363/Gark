package com.example.demo.Repository;

import com.example.demo.Model.ContractPlayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractPlayerRepository extends JpaRepository<ContractPlayer, Long> {
}
