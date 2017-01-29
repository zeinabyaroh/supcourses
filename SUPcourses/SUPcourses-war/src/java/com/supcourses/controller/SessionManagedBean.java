/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Outils | Templates
 * and open the template in the editor.
 */

package com.supcourses.controller;

import com.supcourses.model.*;
import com.supcourses.util.*;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "sessionManagedBean")
@SessionScoped
public class SessionManagedBean {

    @EJB
    private SessionBean sessionBean;
    @EJB
    private UtilisateurBean utilisateurBean;
    
    Page page = null;
    
    // effectuer verification des credentials
    public Page connexion(){
        
        if (sessionBean.connecter()){
            page = Outils.redirectionVers(Page.MATIERES);
        }else{
            page = Outils.redirectionVers(Page.AUTHENTIFICATION);
        }
        return page;
    }
    
    // effectuer deconnexion
    public Page deconnexion(){
        // verrifier si la deconnection s'est bien passer
        if (sessionBean.deconnecter()) {
            page = Outils.redirectionVers(Page.ACCUEIL);
        }else{
            page = Outils.redirectionVers(Page.MATIERES);
        }
        
        return page;
    }
    
    public UtilisateurBean getUtilisateurBean() {
        return utilisateurBean;
    }

    public void setUtilisateurBean(UtilisateurBean utilisateurBean) {
        this.utilisateurBean = utilisateurBean;
    }
}
