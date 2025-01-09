/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.user;

import java.io.Serializable;

/**
 *
 * @author brimon
 */
public class User implements Serializable {
    
    private String nameU;
    private String password;
    private String  fullName;
    private String email;
    private String phone;
    
    
    public User(String data[]) {
            this.nameU = data[0];
            this.password = data[1];
            this.fullName = data[2];
            this.email = data[3];
            this.phone = data[4];
    }

    /**
     * @return the nameU
     */
    public String getNameU() {
        return nameU;
    }

    /**
     * @param nameU the nameU to set
     */
    public void setNameU(String nameU) {
        this.nameU = nameU;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
