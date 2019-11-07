/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118028.latihan52.siapakamu;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Siapa Kamu

 */
public class IF110118028Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Dosen dosen = new Dosen();
          
          dosen.setNip("41227829930");
          dosen.setMataKuliah("PBO");
          dosen.setUmur(29);
          dosen.setNama("Rizki Adam Kurniawan");
          System.out.println("NIP DOSEN : " + dosen.getNip());
          dosen.siapaKamu();
          dosen.mengajarApa();
          
          System.out.println();
          
          Mahasiswa mahasiswa = new Mahasiswa();
          mahasiswa.setNim("10118037");
          mahasiswa.setKelas("IF-1");
          mahasiswa.setNama("Muhammad Ihsan");
          mahasiswa.setUmur(19);
          System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
          mahasiswa.siapaKamu();
          mahasiswa.kelasApa();
    }
    
}
