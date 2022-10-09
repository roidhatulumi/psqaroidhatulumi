import java.util.*;
import java.lang.Math;

public class biodata {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nIM, nama;
        
        System.out.print("Masukan NIM Anda : ");
        nIM = input.nextLine();
        System.out.print("Masukan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("NIM : " + nIM + ". Atas Nama : " + nama);
    }
}