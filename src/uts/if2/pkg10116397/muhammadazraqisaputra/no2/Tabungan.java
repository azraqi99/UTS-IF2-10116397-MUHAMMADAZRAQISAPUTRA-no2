/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : UNTUK MENABUNG DAN MENARIK UANG
 */
package uts.if2.pkg10116397.muhammadazraqisaputra.no2;

/**
 *
 * @author Zetro
 */
public class Tabungan {
    private int saldo;
      
    public Tabungan(int saldo){
         this.saldo = saldo;
    }
   
    public int ambilUang(int jumlah){
       return saldo - jumlah; 
    }
}
