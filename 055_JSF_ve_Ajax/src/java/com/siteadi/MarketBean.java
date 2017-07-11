/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class MarketBean {

    /**
     * Creates a new instance of MarketBean
     */
    private SelectItem[] firma = new SelectItem[]{
        new SelectItem("firma1", "abc"),
        new SelectItem("firma2", "bca")
    };
    
    private SelectItem[] firma2 = new SelectItem[]{
        new SelectItem("elma", "falan"),
        new SelectItem("armut", "felan"),
        new SelectItem("vişne", "inter"),
        new SelectItem("kayısı", "milan"),
        new SelectItem("nektari", "cevoo")
    };
    
    private SelectItem[] firma3 = new SelectItem[]{
        new SelectItem("muz", "dede"),
        new SelectItem("babanas", "nene"),
        new SelectItem("ananas", "ada"),
        new SelectItem("burokoli", "tropik"),
        new SelectItem("kiraz", "otantik")
    };
    
    private SelectItem[] urun = firma;
    private String firmaAdi;
    private String firmaNo;
    
    public MarketBean() {
    }

    public SelectItem[] getFirma() {
        return firma;
    }

    public void setFirma(SelectItem[] firma) {
        this.firma = firma;
    }

    public SelectItem[] getUrun() {
        return urun;
    }

    public void setUrun(AjaxBehaviorEvent evt) {
        if(firmaAdi.equalsIgnoreCase("firma1")){
            this.urun = firma2;
        }
        else if(firmaAdi.equalsIgnoreCase("firma2")){
            this.urun = firma3;
        }
        System.out.println("çalıştı");
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getFirmaNo() {
        return firmaNo;
    }

    public void setFirmaNo(String firmaNo) {
        this.firmaNo = firmaNo;
    }
    
    
}
