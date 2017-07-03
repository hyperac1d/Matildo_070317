/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Matildo_070317;

/**
 *
 * @author 3rd Year account
 */
public class AbstractDemo {
    public static void main(String[] args) {
        FlyingSuperHero fsh = new FlyingSuperHero();
//        fsh.displayPower();
        Spiderman spd = new Spiderman();
//        spd.displayPower();
        fsh.setSuperPowers("New Power", 2);
        fsh.printSuperPowers();
        
    }
}
