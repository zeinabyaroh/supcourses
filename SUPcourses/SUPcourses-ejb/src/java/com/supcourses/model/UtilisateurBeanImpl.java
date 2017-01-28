/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supcourses.model;

import javax.ejb.Stateless;

@Stateless
public class UtilisateurBeanImpl implements UtilisateurBean {

    private Integer id;
    private String email;
    private String password;
    private int profileId;
    private int roleId;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int getProfileId() {
        return profileId;
    }

    @Override
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    @Override
    public int getRoleId() {
        return roleId;
    }

    @Override
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
