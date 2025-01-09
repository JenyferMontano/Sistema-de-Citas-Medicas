/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.user;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author brimo
 */
public class UserAdapter {
  private final String FILE_NAME = "users.ntr";

    protected void write(ArrayList<User> list)throws Exception{
        //crea un archivo
        ObjectOutputStream out = null;
        try{
            
            out = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            for(int i=0;i<list.size();i++){
                out.writeObject(list.get(i));
            }
            out.close();
        }catch(Exception e){
            e.printStackTrace(); //lanza la lista de errores pero cuando el programa este listo hay que eliminar
            throw new Exception("Error");
        }
    }

    protected ArrayList<User> read() throws Exception{
        ObjectInputStream in;
        ArrayList<User> list = new ArrayList<>();
        try{
            //VERIFICAR QUE EXISTA EL ARCHIVO
            in =new ObjectInputStream(
                    new FileInputStream(FILE_NAME));
            if(in!=null){
                User us = (User)in.readObject();
                while(us!=null){
                    list.add(us);
                    us =(User)in.readObject();
                }
            }
            in.close();
        }catch(IOException|ClassNotFoundException e){
            e.printStackTrace();
            if(!(e instanceof EOFException)){
                //NO HAY QUE ELIMINAR ESTO, HAY QUE VERIFICAR QUE EL ARCHIVO EXISTE
                //throw new Exception(e.getMessage());
            }
        }
        return list;
    }
}
