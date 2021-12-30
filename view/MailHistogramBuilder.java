/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.List;
import model.Histogram;

/**
 *
 * @author Rebe
 */
public class MailHistogramBuilder {   
    
    public Histogram<String> getHisto(List<String> list) {
        Histogram histo = new Histogram();
        for(String i : list){
            histo.increment(i);
        }
        return histo;
    }    
    
    
}
