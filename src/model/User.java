/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class User {
    private int ID;
    private String Username;
    private String Password;
    
    public User() {
        }
    
      public User(int ID, String Username, String Password) {
        this.ID = ID;
        this.Username = Username;
        this.Password = Password;
    }

    /**
     *
     * @param ID
     */
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
     public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
