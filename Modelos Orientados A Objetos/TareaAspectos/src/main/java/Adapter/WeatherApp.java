/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Anthony
 */
public class WeatherApp {

    private TemperatureAdapter tempAdapter;
    
    public WeatherApp(TemperatureAdapter tempAdapter){
        this.tempAdapter=tempAdapter;
    }
    
    public void retrieveAPI(){
        System.out.println("Retrieving dataa from APIs...");
    }
    public String showTemperature(){
        retrieveAPI();
        return "The temperature is "+ tempAdapter.getCelcius() +"C°";
    }
}
