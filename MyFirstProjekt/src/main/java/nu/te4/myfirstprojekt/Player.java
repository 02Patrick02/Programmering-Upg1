/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.myfirstprojekt;

/**
 *
 * @author Elev
 */
public class Player {
    private String name;
    private int dmg;
    private int hp = 5;
    
    public Player (int dmg, int hp){
        this.dmg = dmg;
        this.hp = hp;
    }
    
    public int getDmg(){
        return dmg;
    }
    public void setDmg(int dmg){
        this.dmg = dmg; 
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public int getHp() {
        return hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
}
