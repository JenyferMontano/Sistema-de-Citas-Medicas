/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import com.una.proyectoprogramadoiiv2.controller.user.UserController;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author brimo
 */
public class UserControllerTest {
  UserController instancia;
  public UserControllerTest(){
    instancia = new UserController();
  }  
  
  @Test
  public void testAddUser(){
  String data[] = {"juank","jk007","Juan Perez","juank@gmail.com","87536727"};
  
  
  String expected = "Guardado exitosamente";
  String result = instancia.add(data);
  
  assertEquals(expected,result);
  }
  
  @Test
  public void testUpdateUser(){
      String data[] = {"juank","jkaa007","Juan Perez Ruiz","juankPR@gmail.com","74637489"};
      
      String expected = "Usuario modificado correctamente.";
      String result = instancia.update(data);
      
      assertEquals(expected,result);
      }
  
  @Test
  public void testDeleteUser(){
      String username = "juank";
      
      String expected = "Usuario eliminado correctamente";
      String result = instancia.delete(username);
      
      assertEquals(expected,result);
  }
}

