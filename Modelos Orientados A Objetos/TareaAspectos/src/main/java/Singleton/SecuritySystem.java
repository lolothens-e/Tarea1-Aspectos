/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class SecuritySystem {
    
    private Logger log= Logger.getLog();
    
    public void logSuccessfulOperation(){
        log.log("Security risk prevented! Excellent!");
    }
    public void logUnsuccessfulOperation(){
        log.log("Security has been vulnerated.");
    }
    
}
