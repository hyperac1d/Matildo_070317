/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matildo_070317;

/**
 *
 * @author 3rd Year account
 */
abstract public class SuperHero {
    String superPowers[];
    SuperHero(){
        this.superPowers = new String[]{"First Power", "Second Power", "Third Power", "Fourth Power", "Fifth Power"};
    }
    void setSuperPowers(String power, int element){
        this.superPowers[element] = power;
     }
    void setSuperPowers(String superPowers[]) {
        this.superPowers = superPowers;
    }
    void printSuperPowers(){
        for (int i=0; i<superPowers.length; i++){
            System.out.println(superPowers[i]);
        }
    }
    abstract void displayPower();
}
