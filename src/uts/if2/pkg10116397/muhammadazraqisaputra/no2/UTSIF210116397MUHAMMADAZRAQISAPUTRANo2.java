/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : UNTUK MENABUNG DAN MENARIK UANG
 */
package uts.if2.pkg10116397.muhammadazraqisaputra.no2;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class UTSIF210116397MUHAMMADAZRAQISAPUTRANo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=======Program Penarikan Uang========");
        System.out.print("Masukkan Saldo Awal : " );
        Scanner scn = new Scanner(System.in);
        int saldo = scn.nextInt();
        
        System.out.print("Jumlah Uang Yang diambil : " );
        int ambil = scn.nextInt();
        
        Tabungan tbg = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang : " +tbg.ambilUang(ambil));
    }
    }
    

