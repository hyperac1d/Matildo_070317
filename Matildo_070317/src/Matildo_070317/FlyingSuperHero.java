/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matildo_070317;

/**
 *
 * @author 3rd Year account
 */
public class FlyingSuperHero extends SuperHero{
    /**
     * This method will display power
     * @param 
     * This method does not have a parameter
     * @return 
     * This method does not return any value
     * @since 
     * it was made on August 18, 1998
     */
    @Override
    void displayPower(){
        System.out.println("Fly...");
    }
    void setSP(String superPowers[]){
        super.setSuperPowers(superPowers);
    }
    
}
