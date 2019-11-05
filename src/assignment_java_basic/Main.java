package assignment_java_basic;
import java.util.Scanner;

public class Main {
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		boolean valid;
		Data.input();
		
		System.out.println("List program: ");
		System.out.println("1. List karyawan");
		System.out.println("2. List jadwal");
		System.out.println("3. List nilai");
		
		while(true) {
			do {
				valid = true;
				try {
					System.out.print("\n\nMasukan nomor program: ");
					int nomor = input.nextInt();
					inputan(nomor);
				}
				catch(Exception e){
					valid = false;
					System.out.print("Format harus angka");
					input = new Scanner(System.in);
				}
			}while(!valid);
		}
	}
	
	public static void inputan(int nomor) {
		switch(nomor) {
		case 1:
			Data.get_list_karyawan();
			break;
		case 2:
			Data.get_list_jadwal();
			break;
		case 3:
			Data.get_list_nilai();
			break;
		default:
			System.out.print("\nNomor program tidak ada");
			break;
		}
		
	}
	
	
}
