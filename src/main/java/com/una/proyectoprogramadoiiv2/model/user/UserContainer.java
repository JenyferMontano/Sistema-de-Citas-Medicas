/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.una.proyectoprogramadoiiv2.model.user;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author brimo
 */
public class UserContainer extends UserAdapter{
  private static Map<String,User> container = new HashMap<>();
  public UserContainer() throws Exception{
       super();
      if(!(new File("users.ntr").exists())){
          String data[] = {"admin", "admin","","",""};
          User admin = new User(data);
          container.put(admin.getNameU(), admin);
       this.write(new ArrayList(container.values()));
       
   }
      this.loadFile();
   }
  
  private void loadFile() throws Exception{
       for(User u:this.read()){
           container.put(u.getNameU(),u);
       }
   }
  
 public boolean exist(String id){
       return container.containsKey(id);
   }
 
 public User find(String username){
     if(container.containsKey(username)){
         return container.get(username);
     }
     return null;
   }
    
  public boolean add(User u)throws Exception{
       if(!container.containsKey(u.getNameU())){
           container.put(u.getNameU(),u);
           this.write(new ArrayList(container.values()));
           return true;
       }
       return false;
   }
   
   public boolean update(User u) throws Exception{
       if(container.containsKey(u.getNameU())){
           container.put(u.getNameU(), u);
           this.write(new ArrayList(container.values()));
           return true;
       }
       return false;
   }
   
   public boolean delete(String id) throws Exception{
       if(container.containsKey(id)){
           container.remove(id);
           this.write(new ArrayList(container.values()));
           return true;
       }
       return false;
   }

   public List getAll(){
       return new ArrayList<>(container.values());
   }
}
