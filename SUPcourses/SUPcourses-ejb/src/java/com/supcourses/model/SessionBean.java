package com.supcourses.model;

import javax.ejb.Local;

@Local
public interface SessionBean {
    
    // authentification utilisateur
    public boolean connecter();
    
    // deconnexion utilisateur
    public boolean deconnecter();
}
