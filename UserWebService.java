/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Léon Hakeem
 */
@WebService(serviceName = "UserWebService")
public class UserWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AfficherId")
    public int AfficherId(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Affichermail")
    public String Affichermail(@WebParam(name = "email") String email) {
        //TODO write your implementation code here:
        return email;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Afficherpwd")
    public String Afficherpwd(@WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        return password;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AfficheridRole")
    public int AfficheridRole(@WebParam(name = "roleId") int roleId) {
        //TODO write your implementation code here:
        return roleId;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Afficheridprofile")
    public int Afficheridprofile(@WebParam(name = "profileId") int profileId) {
        //TODO write your implementation code here:
        return profileId;
    }

    
}
