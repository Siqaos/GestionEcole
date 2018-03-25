package com.gestionecole.gi1718.entites;

import java.util.HashSet;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "personne", catalog = "gestionecole")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Personne {

	private int idPersonne;
	private Contact contact;
	private Directeur directeur;
	private Femmedemenage femmedemenage;
	private Gardien gardien;
	private Gestionnaire gestionnaire;
	private Secretaire secretaire;
	private String sexe;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private String email;
	private String adresse;
	private String tel;
	private String codePostale;
	private String ville;
	private String pays;
	private Set<Professeur> professeurs = new HashSet<Professeur>(0);
	private Set<User> users = new HashSet<User>(0);
	private Set<Responsable> responsables = new HashSet<Responsable>(0);
	private Set<Eleve> eleves = new HashSet<Eleve>(0);
	private Set<Aide> aides = new HashSet<Aide>(0);

	public Personne() {
	}

	public Personne(int idPersonne, Contact contact, Directeur directeur, Femmedemenage femmedemenage, Gardien gardien,
			Gestionnaire gestionnaire, Secretaire secretaire) {
		this.idPersonne = idPersonne;
		this.contact = contact;
		this.directeur = directeur;
		this.femmedemenage = femmedemenage;
		this.gardien = gardien;
		this.gestionnaire = gestionnaire;
		this.secretaire = secretaire;
	}

	public Personne(int idPersonne, Contact contact, Directeur directeur, Femmedemenage femmedemenage, Gardien gardien,
			Gestionnaire gestionnaire, Secretaire secretaire, String sexe, String nom, String prenom,
			String dateDeNaissance, String email, String adresse, String tel, String codePostale, String ville,
			String pays, Set<Professeur> professeurs, Set<User> users, Set<Responsable> responsables, Set<Eleve> eleves,
			Set<Aide> aides) {
		this.idPersonne = idPersonne;
		this.contact = contact;
		this.directeur = directeur;
		this.femmedemenage = femmedemenage;
		this.gardien = gardien;
		this.gestionnaire = gestionnaire;
		this.secretaire = secretaire;
		this.sexe = sexe;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.email = email;
		this.adresse = adresse;
		this.tel = tel;
		this.codePostale = codePostale;
		this.ville = ville;
		this.pays = pays;
		this.professeurs = professeurs;
		this.users = users;
		this.responsables = responsables;
		this.eleves = eleves;
		this.aides = aides;
	}

	@Id

	@Column(name = "idPersonne", unique = true, nullable = false)
	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_idContact", nullable = false)
	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "directeur_idDirecteur", nullable = false)
	public Directeur getDirecteur() {
		return this.directeur;
	}

	public void setDirecteur(Directeur directeur) {
		this.directeur = directeur;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "femmedemenage_idFemmedemenage", nullable = false)
	public Femmedemenage getFemmedemenage() {
		return this.femmedemenage;
	}

	public void setFemmedemenage(Femmedemenage femmedemenage) {
		this.femmedemenage = femmedemenage;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gardien_idGardien", nullable = false)
	public Gardien getGardien() {
		return this.gardien;
	}

	public void setGardien(Gardien gardien) {
		this.gardien = gardien;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gestionnaire_idGestionnaire", nullable = false)
	public Gestionnaire getGestionnaire() {
		return this.gestionnaire;
	}

	public void setGestionnaire(Gestionnaire gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "secretaire_idSecretaire", nullable = false)
	public Secretaire getSecretaire() {
		return this.secretaire;
	}

	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
	}

	@Column(name = "Sexe", length = 45)
	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Column(name = "Nom", length = 45)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "Prenom", length = 45)
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Column(name = "Date de naissance", length = 45)
	public String getDateDeNaissance() {
		return this.dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	@Column(name = "Email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Adresse", length = 45)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column(name = "Tel", length = 45)
	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Column(name = "Code postale", length = 45)
	public String getCodePostale() {
		return this.codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	@Column(name = "Ville", length = 45)
	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Column(name = "Pays", length = 45)
	public String getPays() {
		return this.pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Professeur> getProfesseurs() {
		return this.professeurs;
	}

	public void setProfesseurs(Set<Professeur> professeurs) {
		this.professeurs = professeurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Responsable> getResponsables() {
		return this.responsables;
	}

	public void setResponsables(Set<Responsable> responsables) {
		this.responsables = responsables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Eleve> getEleves() {
		return this.eleves;
	}

	public void setEleves(Set<Eleve> eleves) {
		this.eleves = eleves;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personne")
	public Set<Aide> getAides() {
		return this.aides;
	}

	public void setAides(Set<Aide> aides) {
		this.aides = aides;
	}

}
