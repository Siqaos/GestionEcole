package com.gestionecole.gi1718.entites;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "contact", catalog = "gestionecole")
@PrimaryKeyJoinColumn(name = "idPersonne")
public class Contact extends Personne  {

	private Fournisseur fournisseur;
	private Set<Personne> personnes = new HashSet<Personne>(0);

	public Contact() {
	}

	public Contact( Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Contact(Fournisseur fournisseur, Set<Personne> personnes) {
		this.fournisseur = fournisseur;
		this.personnes = personnes;
	}



	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fournisseur_idFournisseur", nullable = false)
	public Fournisseur getFournisseur() {
		return this.fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contact")
	public Set<Personne> getPersonnes() {
		return this.personnes;
	}

	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	}

}
