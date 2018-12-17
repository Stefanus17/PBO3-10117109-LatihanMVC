/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stefanus.latihanmvc.model;

import edu.stefanus.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF3
 */
public class PelangganModel {
    private String nama;
    private String email;
    private String noTelp;
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireonChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireonChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireonChange();
    }
    
    protected void fireonChange(){
        
        if (pelangganListener!=null){
            pelangganListener.onChange(this);
        }
    }
    
    public void resetForm(){
        
        setNama("");
        setEmail("");
        setNoTelp("");
    }
    
    public void simpanForm(){
        
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();
        
        
    }
}
