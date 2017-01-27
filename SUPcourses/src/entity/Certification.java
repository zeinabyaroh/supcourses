/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Léon Hakeem
 */
@Entity
@Table(name = "certification", catalog = "learning", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Certification.findAll", query = "SELECT c FROM Certification c")
    , @NamedQuery(name = "Certification.findById", query = "SELECT c FROM Certification c WHERE c.id = :id")
    , @NamedQuery(name = "Certification.findByNom", query = "SELECT c FROM Certification c WHERE c.nom = :nom")
    , @NamedQuery(name = "Certification.findByUtilisateurId", query = "SELECT c FROM Certification c WHERE c.utilisateurId = :utilisateurId")
    , @NamedQuery(name = "Certification.findByMatiereId", query = "SELECT c FROM Certification c WHERE c.matiereId = :matiereId")})
public class Certification implements Serializable {

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
    @Column(name = "utilisateur_id", nullable = false)
    private int utilisateurId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "matiere_id", nullable = false)
    private int matiereId;

    public Certification() {
    }

    public Certification(Integer id) {
        this.id = id;
    }

    public Certification(Integer id, String nom, int utilisateurId, int matiereId) {
        this.id = id;
        this.nom = nom;
        this.utilisateurId = utilisateurId;
        this.matiereId = matiereId;
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

    public int getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(int utilisateurId) {
        this.utilisateurId = utilisateurId;
    }

    public int getMatiereId() {
        return matiereId;
    }

    public void setMatiereId(int matiereId) {
        this.matiereId = matiereId;
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
        if (!(object instanceof Certification)) {
            return false;
        }
        Certification other = (Certification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.src.entity.Certification[ id=" + id + " ]";
    }
    
}
