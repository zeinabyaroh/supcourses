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
@Table(name = "matiere", catalog = "learning", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Matiere.findAll", query = "SELECT m FROM Matiere m")
    , @NamedQuery(name = "Matiere.findById", query = "SELECT m FROM Matiere m WHERE m.id = :id")
    , @NamedQuery(name = "Matiere.findByNom", query = "SELECT m FROM Matiere m WHERE m.nom = :nom")
    , @NamedQuery(name = "Matiere.findByDescription", query = "SELECT m FROM Matiere m WHERE m.description = :description")
    , @NamedQuery(name = "Matiere.findByVersion", query = "SELECT m FROM Matiere m WHERE m.version = :version")
    , @NamedQuery(name = "Matiere.findByDateCreation", query = "SELECT m FROM Matiere m WHERE m.dateCreation = :dateCreation")
    , @NamedQuery(name = "Matiere.findByAuteur", query = "SELECT m FROM Matiere m WHERE m.auteur = :auteur")
    , @NamedQuery(name = "Matiere.findByQuizId", query = "SELECT m FROM Matiere m WHERE m.quizId = :quizId")})
public class Matiere implements Serializable {

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
    @Column(name = "description", nullable = false, length = 50)
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "version", nullable = false, length = 50)
    private String version;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_creation", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "auteur", nullable = false, length = 50)
    private String auteur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quiz_id", nullable = false)
    private int quizId;

    public Matiere() {
    }

    public Matiere(Integer id) {
        this.id = id;
    }

    public Matiere(Integer id, String nom, String description, String version, Date dateCreation, String auteur, int quizId) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.version = version;
        this.dateCreation = dateCreation;
        this.auteur = auteur;
        this.quizId = quizId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
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
        if (!(object instanceof Matiere)) {
            return false;
        }
        Matiere other = (Matiere) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.src.entity.Matiere[ id=" + id + " ]";
    }
    
}
