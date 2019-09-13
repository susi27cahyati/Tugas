package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan Jumlah data: ");
        int jumlah = Integer.parseInt(input.readLine());

        String[] nama = new String[jumlah];
        int[] umur = new int[jumlah];
        int x = 1;
        for (int a=0; a < jumlah; a++){

            System.out.println("Silahkan Input data ke : " + x++);
            System.out.print("Nama : ");
            nama[a] = input.readLine();
            System.out.print("Umur : ");
            umur[a] = Integer.parseInt(input.readLine());
        }
        System.out.print("    ||   ");
        System.out.print("Nama");
        System.out.print("    ||   ");
        System.out.print("Umur");
        System.out.println("   ||  ");
        for (int a=0; a < jumlah; a++){
//            System.out.println("Data Mahasiswa ke- " + a);
            System.out.print("    ||   ");
            System.out.print(nama[a]);
            System.out.print("    ||   ");
            System.out.print(umur[a]);
            System.out.println("   ||  ");
        }
    }
}
