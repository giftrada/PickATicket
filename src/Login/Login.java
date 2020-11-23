/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author giftradakorn
 */
public class Login {
    private String user ="Piek";
    private String password="1111";
    
    public void Login(String User,String Password){
                this.user=User;
                this.password=Password;
    }
    public String getUser(){
                return user;
    }
    public String getPassword(){
                return password;
    }

    @Override
    public String toString() {
        return user;
    }
    
    
}
