package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class ContractPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContractPlayer;
    private String detailsContractuels;
    private String termesFinanciers;
    private String clausesSpecifiques;
    private List<String> objectifs;
    private Date date;
	public Long getIdContractPlayer() {
		return idContractPlayer;
	}
	public void setIdContractPlayer(Long idContractPlayer) {
		this.idContractPlayer = idContractPlayer;
	}
	public String getDetailsContractuels() {
		return detailsContractuels;
	}
	public void setDetailsContractuels(String detailsContractuels) {
		this.detailsContractuels = detailsContractuels;
	}
	public String getTermesFinanciers() {
		return termesFinanciers;
	}
	public void setTermesFinanciers(String termesFinanciers) {
		this.termesFinanciers = termesFinanciers;
	}
	public String getClausesSpecifiques() {
		return clausesSpecifiques;
	}
	public void setClausesSpecifiques(String clausesSpecifiques) {
		this.clausesSpecifiques = clausesSpecifiques;
	}
	public List<String> getObjectifs() {
		return objectifs;
	}
	public void setObjectifs(List<String> objectifs) {
		this.objectifs = objectifs;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ContractPlayer(Long idContractPlayer, String detailsContractuels, String termesFinanciers,
			String clausesSpecifiques, List<String> objectifs, Date date) {
		super();
		this.idContractPlayer = idContractPlayer;
		this.detailsContractuels = detailsContractuels;
		this.termesFinanciers = termesFinanciers;
		this.clausesSpecifiques = clausesSpecifiques;
		this.objectifs = objectifs;
		this.date = date;
	}
	public ContractPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}