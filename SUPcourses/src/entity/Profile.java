/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Léon Hakeem
 */
@Entity
@Table(name = "profile", catalog = "learning", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profile.findAll", query = "SELECT p FROM Profile p")
    , @NamedQuery(name = "Profile.findById", query = "SELECT p FROM Profile p WHERE p.id = :id")
    , @NamedQuery(name = "Profile.findByNom", query = "SELECT p FROM Profile p WHERE p.nom = :nom")
    , @NamedQuery(name = "Profile.findByPrenom", query = "SELECT p FROM Profile p WHERE p.prenom = :prenom")
    , @NamedQuery(name = "Profile.findByDateNaissance", query = "SELECT p FROM Profile p WHERE p.dateNaissance = :dateNaissance")
    , @NamedQuery(name = "Profile.findByAdresse", query = "SELECT p FROM Profile p WHERE p.adresse = :adresse")
    , @NamedQuery(name = "Profile.findByCivilite", query = "SELECT p FROM Profile p WHERE p.civilite = :civilite")
    , @NamedQuery(name = "Profile.findByProfession", query = "SELECT p FROM Profile p WHERE p.profession = :profession")})
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_naissance", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "adresse", nullable = false, length = 50)
    private String adresse;
    @Size(max = 50)
    @Column(name = "civilite", length = 50)
    private String civilite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "profession", nullable = false, length = 50)
    private String profession;

    public Profile() {
    }

    public Profile(Integer id) {
        this.id = id;
    }

    public Profile(Integer id, String nom, String prenom, Date dateNaissance, String adresse, String profession) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.profession = profession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profile)) {
            return false;
        }
        Profile other = (Profile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.src.entity.Profile[ id=" + id + " ]";
    }
    
}
