/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class SingletonConsole {
    SecuritySystem security;
    FinanceSystem finance;


    public SingletonConsole(SecuritySystem security,FinanceSystem finance) {
        this.finance=finance;
        this.security=security;
    }
    
    
    public void register(){
        greeting();
        security.logSuccessfulOperation();
        security.logUnsuccessfulOperation();
        finance.logSuccessfulOperation();
        finance.logUnsuccessfulOperation();
    }

    public void greeting(){
        System.out.println("Welcome [user]. \nPlease wait while we register today's events...");
        System.out.println("");
    }
}
