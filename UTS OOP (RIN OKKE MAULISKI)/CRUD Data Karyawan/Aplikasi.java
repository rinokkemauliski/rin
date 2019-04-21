import data.Data;
import proses.Operasi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplikasi {
    private static Scanner scn;
    private static Operasi op;

    public static void main(String args[]){
        int m;
        op = new Operasi();


        do {
            menu();
            try {
                scn = new Scanner(System.in);
                m = scn.nextInt();
                pilih(m);
            }catch (InputMismatchException e){
                System.out.println("Masukan pilihan 1 - 5");
                m=0;
            }

        }while (m !=5);
    }
    private static void pilih(int p){
        if (p==1) {
            tambah();
        }
        else if (p==2){
            ubah();

        }
        else if (p==3){
            hapus();

        }
        else if (p==4){
            op.tampilData();

        }
    }
    private static void ubah(){
        scn = new Scanner(System.in);
        String id, nama, divisi, alamat;
        int gaji;

        try {
            System.out.println("Ubah Data\n");
            System.out.print("ID        : ");
            id = scn.nextLine();
            System.out.print("Nama      : ");
            nama = scn.nextLine();
            System.out.print("Jabatan Kerja    : ");
            divisi = scn.nextLine();
            System.out.print("Alamat    : ");
            alamat = scn.nextLine();
            System.out.print("gaji(Rp.) : ");
            gaji = Integer.parseInt(scn.nextLine());
            op.ubah(new Data(id, nama, divisi, alamat, gaji));
        }catch (NumberFormatException e){
            System.out.print("Mohon isi form Gaji dengan angka\n");
            ubah();
        }

    }
    private static void hapus(){
        scn = new Scanner(System.in);
        String id, nama = null, divisi = null, alamat = null;
        int gaji = 0;
        System.out.println("Hapus Data\n");
        System.out.print("ID    : ");
        id = scn.nextLine();
        op.hapus(new Data(id, nama, divisi, alamat, gaji));
    }

    private static void tambah(){
        scn = new Scanner(System.in);
        String id, nama, divisi, alamat;
        int gaji;

        try {
            System.out.println("Tambah Data\n");
            System.out.print("ID        : ");
            id = scn.nextLine();
            System.out.print("Nama      : ");
            nama = scn.nextLine();
            System.out.print("Jabatan Kerja    : ");
            divisi = scn.nextLine();
            System.out.print("Alamat    : ");
            alamat = scn.nextLine();
            System.out.print("gaji(Rp.) : ");
            gaji = Integer.parseInt(scn.nextLine());
            op.simpan(new Data(id, nama, divisi, alamat, gaji));
        }catch (NumberFormatException e){
            System.out.print("Mohon isi form Gaji dengan angka\n");
            tambah();
        }

    }

    private static void menu(){
        System.out.println("Aplikasi Olah Data Karyawan\n");
        System.out.println("Menu");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. Keluar\n");
        System.out.print("Pilih Menu >");

    }
}
