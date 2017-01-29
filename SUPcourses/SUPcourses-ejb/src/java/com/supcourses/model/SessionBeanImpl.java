package com.supcourses.model;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class SessionBeanImpl implements SessionBean {

    @EJB
    private UtilisateurBean utilisateurBean;

    private static boolean estConnecter = false;

    @Override
    public boolean connecter() {
        boolean etatConnexion = false;

        if (estConnecter) {
            etatConnexion = true;
        } else {
            if (utilisateurBean.getEmail().equals("a@test.lan")) {
                etatConnexion = true;
                estConnecter = true;
            } else {
                etatConnexion = false;
                estConnecter = false;
            }
        }

        return etatConnexion;
    }

    @Override
    public boolean deconnecter() {
        estConnecter = false;
        return true;
    }
}
