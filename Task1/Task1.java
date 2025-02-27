package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args){
        Scanner objInput = new Scanner(System.in);
        int choice;
        String username;
        String password;
        String student;

        System.out.println("Select login type: ");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.print("Masukkan Pilihan anda: ");
        choice = objInput.nextInt();
        objInput.nextLine();

        if (choice == 1) {
            System.out.print("Masukkan Admin username: ");
            username = objInput.nextLine();
            System.out.print("Masukkan Admin Password: ");
            password = objInput.nextLine()  ;
            if (username.equals("admin220") && password.equals("password220")) {
                System.out.print("Login berhasil");
            } else {
                System.out.print("Login Gagal, perikasa username atau password anda.");
            }
        } else if (choice == 2) {
            System.out.print("Masukkan Nama: ");
            username = objInput.nextLine();
            System.out.print("masukkan nim: ");
            student = objInput.nextLine();
            if (username.equals("Mukhammad Farhan Prayoga") && student.equals("202410370110220")) {
                System.out.print("Login berhasil.");
            } else {
                System.out.println( "gagal login nama atau nim anda salah.");
            }
        }else {
            System.out.print("pilihan invalid");

        }

    }
}

