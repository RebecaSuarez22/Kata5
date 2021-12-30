/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author Rebe
 */
public class Histogram<T> {
    private final Map<T, Integer> map = new HashMap<T, Integer>();
    
    
    public Integer get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
       return  map.keySet();
    }
    
    public void increment(T key){
        map.put(key, map.containsKey(key) ? map.get(key) +1 : 1);
        
    }
}
