package com.example.demo.Repository;

import com.example.demo.Model.CompetencesAndHistorique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetencesAndHistoriqueRepository extends JpaRepository<CompetencesAndHistorique, Long> {
   
}
