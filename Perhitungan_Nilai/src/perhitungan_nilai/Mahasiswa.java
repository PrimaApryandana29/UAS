/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perhitungan_nilai;

/**
 *
 * @author Apryandana
 */
public class Mahasiswa {
    private String Nama;
    private String NIM;
    
    public void SetNama(String nama){
        this.Nama = nama ;
    }
    
    public void SetNIM(String nim){
        this.NIM = nim ;
    }
    
    public String GetNama (){
        return this.Nama;
    }
    
    public String GetNIM (){
        return this.NIM;
    }
}

