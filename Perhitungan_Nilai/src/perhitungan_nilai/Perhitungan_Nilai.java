package perhitungan_nilai;
import java.util.Scanner;
/**
 *
 * @author Apryandana
 */
public class Perhitungan_Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        final double n_tugas , n_uts , n_kuis , n_uas;
        Mahasiswa_Nilai mn = new Mahasiswa_Nilai();

    Scanner input = new Scanner (System.in);
    System.out.println("===== Menghitung Nilai Mahasiswa=====\n");
    
        System.out.print("Masukan Nama : ");
        mn.SetNama(input.nextLine());

        System.out.print("Masukan NIM : ");
        mn.SetNIM (input.nextLine());

        System.out.print("Nilai Tugas : ");
        n_tugas = input.nextInt();

        System.out.print("Nilai Kuis : ");
        n_kuis = input.nextInt();

        System.out.print("Nilai UTS : ");
        n_uts = input.nextInt();

        System.out.print("Nilai UAS : ");
        n_uas = input.nextInt();
        
        mn.SetNilai(n_tugas, n_kuis, n_uts, n_uas);
        if (mn.Getgrade() == 'A' || mn.Getgrade()== 'B' || mn.Getgrade() == 'C'){
            System.out.println("\n"+mn.GetNama()+" dengan NIM "+mn.GetNIM()+" memiliki Nilai Akhir "+mn.GetNilai()+" = ("+mn.Getgrade()+")"+""
                   + "\n dan dinyatakan Lulus");
        }
        else {
            System.out.println("\n"+mn.GetNama()+" dengan NIM "+mn.GetNIM()+" memiliki Nilai Akhir "+mn.GetNilai()+" \n Dengan Grade = ("+mn.Getgrade()+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
        }  
    }
    
}
