/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

/**
 *
 * @author Anthony
 */
public class FinanceSystem {
    
    private Logger log= Logger.getLog();
    
    public void logSuccessfulOperation(){
        log.log("Finance operation done! You just made a lot of money");
    }
    public void logUnsuccessfulOperation(){
        log.log("Finance operation failed. You should sell your stocks...");
    }
}
