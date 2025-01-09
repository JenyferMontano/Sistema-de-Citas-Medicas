/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.controller.user;

import com.una.proyectoprogramadoiiv2.model.user.User;
import com.una.proyectoprogramadoiiv2.model.user.UserContainer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brimo
 */
public class UserController implements UserInterface{

    private UserContainer container;

    public UserController() {
        try {
            container = new UserContainer();
        } catch (Exception e) {
 
        }
    }
    @Override
    public String add(String[] data) {
         String response = "Usuario ya existe";
        if (!container.exist(data[0])) {
            try {
                User u = new User(data);
                if (container.add(u)) {
                    response = "Guardado exitosamente";
                } else {
                    response = "Error al guardar los datos";
                }
            } catch (Exception e) {
                response = e.getMessage();
            }
        }
        return response;
    }
    
    @Override
    public String[] find(String username) {  
        if(container.exist(username)){
            User user=container.find(username);
            String data[]={user.getNameU(),user.getPassword(),user.getFullName(),
                user.getEmail(),user.getPhone()};
            return data;
        }
        return null;
    }

    @Override
    public String update(String[] data) {
        try {
            String user = data[0];
            String[] pU = {data[0], data[1], data[2], data[3], data[4]};
            
            if (container.exist(user)) {
                User u = new User(pU);
                container.update(u);
                return "Usuario modificado correctamente.";
            } else {
                return "Error al modificar. El ID no existe.";
            }
        } catch (NumberFormatException e) {
            return "Error al convertir ID a número.";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    @Override
    public String delete(String user) {
        if (container.exist(user)) {
            if(!user.equals("admin")){
            try{
            if (container.delete(user)) {
                return "Usuario eliminado correctamente";
            }
            }catch(Exception e){
                return e.getMessage();
                }
            return "Error al eliminar al usuario";
        } else{
                return "No se puede elimiar al usuario administrador";
            }
        
    }else {
            return "Error al eliminar. El usuario no existe.";
        }
    }

    @Override
    public String[][] getAll() {
         List<User> user = new ArrayList(container.getAll());
        String[][] result = new String[user.size()][8];
        
        for(int i=0;i<user.size();i++){
            User u = user.get(i);
            result[i][0] = u.getNameU();
            result[i][1] = u.getPassword();
            result[i][2] = u.getFullName();
            result[i][3] = u.getEmail();
            result[i][4] = u.getPhone(); 
        }
        return result;
    }
  
}
