package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String leagalefullname;
    private Date dateOfBirth;
    private String mailAdress;
    private String discordId ;
    private Number whatsappPhone;
    private String inGameName;
    private Double salary;
    private Date contratStart;
    private Date contratEnd;
    private String countryOfResidence;
    private String jerseySize;
    private String socialMediaLinks;
    
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ContractPlayer> contractPlayers;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLeagalefullname() {
		return leagalefullname;
	}
	public void setLeagalefullname(String leagalefullname) {
		this.leagalefullname = leagalefullname;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMailAdress() {
		return mailAdress;
	}
	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}
	public String getDiscordId() {
		return discordId;
	}
	public void setDiscordId(String discordId) {
		this.discordId = discordId;
	}
	public Number getWhatsappPhone() {
		return whatsappPhone;
	}
	public void setWhatsappPhone(Number whatsappPhone) {
		this.whatsappPhone = whatsappPhone;
	}
	public String getInGameName() {
		return inGameName;
	}
	public void setInGameName(String inGameName) {
		this.inGameName = inGameName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getContratStart() {
		return contratStart;
	}
	public void setContratStart(Date contratStart) {
		this.contratStart = contratStart;
	}
	public Date getContratEnd() {
		return contratEnd;
	}
	public void setContratEnd(Date contratEnd) {
		this.contratEnd = contratEnd;
	}
	public String getCountryOfResidence() {
		return countryOfResidence;
	}
	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}
	public String getJerseySize() {
		return jerseySize;
	}
	public void setJerseySize(String jerseySize) {
		this.jerseySize = jerseySize;
	}
	public String getSocialMediaLinks() {
		return socialMediaLinks;
	}
	public void setSocialMediaLinks(String socialMediaLinks) {
		this.socialMediaLinks = socialMediaLinks;
	}
	public Player(Long id, String leagalefullname, Date dateOfBirth, String mailAdress, String discordId,
			Number whatsappPhone, String inGameName, Double salary, Date contratStart, Date contratEnd,
			String countryOfResidence, String jerseySize, String socialMediaLinks) {
		super();
		this.id = id;
		this.leagalefullname = leagalefullname;
		this.dateOfBirth = dateOfBirth;
		this.mailAdress = mailAdress;
		this.discordId = discordId;
		this.whatsappPhone = whatsappPhone;
		this.inGameName = inGameName;
		this.salary = salary;
		this.contratStart = contratStart;
		this.contratEnd = contratEnd;
		this.countryOfResidence = countryOfResidence;
		this.jerseySize = jerseySize;
		this.socialMediaLinks = socialMediaLinks;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
    
    
    
    
    
}