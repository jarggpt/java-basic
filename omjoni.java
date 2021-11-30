import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.print("Nama Siswa: ");
	String nama = in.nextLine();
	System.out.print("Kelas: ");
	String kelas = in.nextLine();
	System.out.println("PILIHAN OPERASI ARITMATIKA");
	System.out.println("1. PENJUMLAHAN");
	System.out.println("2. PENGURANGAN");
	System.out.println("3. PERKALIAN");
	System.out.print("Pilih Operasi Aritmatika? ");
	int pilih = in.nextInt();
	System.out.print("Nilai A: ");
	int A = in.nextInt();
  System.out.print("Nilai B: ");
	int B = in.nextInt();
	int C;
	if(pilih == 1){
		C = A + B;
		System.out.println("Nilai C= " + C);
	}
	else if(pilih == 2){
		C = A - B;
		System.out.println("Nilai C= " + C);
	}
	else{
		C = A * B;
		System.out.println("Nilai C= " + C);
	}
	}
}