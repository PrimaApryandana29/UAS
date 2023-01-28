/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perhitungan_nilai;

/**
 *
 * @author Apryandana
 */
public class Mahasiswa_Nilai extends Mahasiswa {
    private char grade;
    private double Nilai;
    
    public void SetNilai (double n_tugas, double n_kuis, double n_uts, double n_uas){
        this.Nilai = 0.15 * n_tugas + 0.20 * n_kuis + 0.30 * n_uts + 0.35 * n_uas ;
        if (this.Nilai >= 85 && this.Nilai <=100){
            this.grade = 'A';
        }
        else if (this.Nilai > 75 && this.Nilai < 85){
            this.grade = 'B';
        }
        else if (this.Nilai > 65 && this.Nilai < 75){
            this.grade = 'C';
        }
        else if (this.Nilai > 50 && this.Nilai < 65){
            this.grade = 'D';
        }
        else {
            this.grade = 'E';
        }
    }
    
    public double GetNilai(){
        return this.Nilai;
    }
    
    public char Getgrade (){
        return this.grade;
    }

}
