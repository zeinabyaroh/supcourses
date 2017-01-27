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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Léon Hakeem
 */
@Entity
@Table(name = "cours", catalog = "learning", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cours.findAll", query = "SELECT c FROM Cours c")
    , @NamedQuery(name = "Cours.findById", query = "SELECT c FROM Cours c WHERE c.id = :id")
    , @NamedQuery(name = "Cours.findByMatiereId", query = "SELECT c FROM Cours c WHERE c.matiereId = :matiereId")
    , @NamedQuery(name = "Cours.findByUtilisateurId", query = "SELECT c FROM Cours c WHERE c.utilisateurId = :utilisateurId")})
public class Cours implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "matiere_id", nullable = false)
    private int matiereId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "utilisateur_id", nullable = false)
    private int utilisateurId;

    public Cours() {
    }

    public Cours(Integer id) {
        this.id = id;
    }

    public Cours(Integer id, int matiereId, int utilisateurId) {
        this.id = id;
        this.matiereId = matiereId;
        this.utilisateurId = utilisateurId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMatiereId() {
        return matiereId;
    }

    public void setMatiereId(int matiereId) {
        this.matiereId = matiereId;
    }

    public int getUtilisateurId() {
        return utilisateurId;
    }

    public void setUtilisateurId(int utilisateurId) {
        this.utilisateurId = utilisateurId;
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
        if (!(object instanceof Cours)) {
            return false;
        }
        Cours other = (Cours) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.src.entity.Cours[ id=" + id + " ]";
    }
    
}
