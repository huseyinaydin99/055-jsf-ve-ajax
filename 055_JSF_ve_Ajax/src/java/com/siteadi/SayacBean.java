/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@ViewScoped
public class SayacBean implements Serializable{

    /**
     * Creates a new instance of SayacBean
     */
    private int sayi;
    public SayacBean() {
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
    
    public void artir(){
        sayi++;
    }
    
    public void azalt(){
        sayi--;
    }
}
