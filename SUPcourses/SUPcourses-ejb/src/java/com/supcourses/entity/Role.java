package com.supcourses.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "administrateur", nullable = false, length = 50)
    private String administrateur;

    @NotNull
    @Column(name = "moderateur", nullable = false, length = 50)
    private String moderateur;

    @NotNull
    @Column(name = "utilisateur", nullable = false, length = 50)
    private String utilisateur;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(String administrateur) {
        this.administrateur = administrateur;
    }

    public String getModerateur() {
        return moderateur;
    }

    public void setModerateur(String moderateur) {
        this.moderateur = moderateur;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

}
