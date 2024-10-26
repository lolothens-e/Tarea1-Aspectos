/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareaaspectos;

import Adapter.*;
import Singleton.*;
import java.util.Scanner;

/**
 *
 * @author Anthony
 */
public class TareaAspectos {
    
    public static void main(String[] args) {
        
        System.out.println("\n\n\n-----Singleton model-----\n\n\n");
        SingletonConsole sc= new SingletonConsole(new SecuritySystem(), new FinanceSystem());
        
        sc.register();
        
        Logger.getLog().checkLog();
        
        System.out.println("\n\n\n-----Adapter model-----\n\n\n");
        WeatherApp wa=new WeatherApp(new TemperatureAdapter(new WeatherAPIK(),new WeatherAPIF()));
        
        System.out.println(wa.showTemperature());
        
    }
}
