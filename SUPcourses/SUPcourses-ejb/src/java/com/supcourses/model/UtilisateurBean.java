/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supcourses.model;

import javax.ejb.Local;

@Local
public interface UtilisateurBean {

    public Integer getId();
    
    public void setId(Integer id);
    
    public String getEmail();

    public void setEmail(String email);

    public String getPassword();

    public void setPassword(String password);

    public int getProfileId();

    public void setProfileId(int profileId);

    public int getRoleId();

    public void setRoleId(int roleId);
}
