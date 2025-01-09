/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.controller.user;

/**
 *
 * @author brimo
 */
public interface UserInterface {
    public String add(String data[]);
    public String[] find(String username);
    public String update(String data[]);
    public String delete(String username);
    public String[][] getAll();   
}
