package com.gestionecole.gi1718.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role", catalog = "gestionecole")
public class Role {

	private int idrole;
	private User user;
	private String nomRole;
	private int userPersonneIdPersonne;

	public Role() {
	}

	public Role(int idrole, User user, int userPersonneIdPersonne) {
		this.idrole = idrole;
		this.user = user;
		this.userPersonneIdPersonne = userPersonneIdPersonne;
	}

	public Role(int idrole, User user, String nomRole, int userPersonneIdPersonne) {
		this.idrole = idrole;
		this.user = user;
		this.nomRole = nomRole;
		this.userPersonneIdPersonne = userPersonneIdPersonne;
	}

	@Id

	@Column(name = "idrole", unique = true, nullable = false)
	public int getIdrole() {
		return this.idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_idUser", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "nomRole", length = 45)
	public String getNomRole() {
		return this.nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	@Column(name = "User_Personne_idPersonne", nullable = false)
	public int getUserPersonneIdPersonne() {
		return this.userPersonneIdPersonne;
	}

	public void setUserPersonneIdPersonne(int userPersonneIdPersonne) {
		this.userPersonneIdPersonne = userPersonneIdPersonne;
	}

	@Override
	public String toString() {
		return "Role [idrole=" + idrole + ", nomRole=" + nomRole + ", userPersonneIdPersonne=" + userPersonneIdPersonne
				+ "]";
	}

}
