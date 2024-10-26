/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Anthony
 */
public class TemperatureAdapter {
    private WeatherAPIK kelvin;
    private WeatherAPIF farenheit;
    
    
    public TemperatureAdapter(WeatherAPIK kelvin, WeatherAPIF farenheit) {
        this.kelvin = kelvin;
        this.farenheit = farenheit;
    }
    public float FtoCelcius(float farenheit){
        return (farenheit-32)*(5.0f/9.0f);
    }
    
    public float KtoCelcius(float kelvin){
        return (float) (kelvin-273.15);
    }
    
    public float getCelcius(){
        return (FtoCelcius(farenheit.getTemperature())+ KtoCelcius(kelvin.getTemperature()))/2;
    }
}
