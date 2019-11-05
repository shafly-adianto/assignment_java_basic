package assignment_java_basic;
import java.util.ArrayList;

public class Data {
	private static ArrayList<Karyawan> data_karyawan = new ArrayList<Karyawan>();
	private static ArrayList<Jadwal> data_jadwal = new ArrayList<Jadwal>();
	private static ArrayList<Nilai> data_nilai = new ArrayList<Nilai>();
	
	public static void input() {
		input_karyawan();
		input_jadwal();
		input_nilai();
	}
	
	public static void input_karyawan() {
		data_karyawan.add(new Karyawan("PEG01", "Yohana", "Jakarta", "12345"));
		data_karyawan.add(new Karyawan("PEG02", "Yohane", "Palembang", "23456"));
		data_karyawan.add(new Karyawan("PEG03", "Yohani", "Medan", "3457"));
		data_karyawan.add(new Karyawan("PEG04", "Yohano", "Surabaya", "45678"));
		data_karyawan.add(new Karyawan("PEG05", "Yohano", "Malang", "56789"));	
	}
	
	public static void input_jadwal() {
		data_jadwal.add(new Jadwal("Algoritma", "31-Oct-19", 711, 3));
		data_jadwal.add(new Jadwal("Spring Boot", "12-Nov-19", 724, 2));
		data_jadwal.add(new Jadwal("Android", "23-Nov-19", 728, 2));
		data_jadwal.add(new Jadwal("Phyton", "11-Nov-19", 706, 4));
		data_jadwal.add(new Jadwal("Ajax", "13-Nov-19", 711, 1));
	}
	
	public static void input_nilai() {
		data_nilai.add(new Nilai("PEG01","Algoritma",86));
		data_nilai.add(new Nilai("PEG01","Spring Boot",88));
		data_nilai.add(new Nilai("PEG01","Android",89));
		data_nilai.add(new Nilai("PEG01","Phyton",90));
		data_nilai.add(new Nilai("PEG02","Spring Boot",78));
		data_nilai.add(new Nilai("PEG02","Android",89));
		data_nilai.add(new Nilai("PEG02","Phyton",77));
		data_nilai.add(new Nilai("PEG03","Android",88));
		data_nilai.add(new Nilai("PEG03","Phyton",89));
		data_nilai.add(new Nilai("PEG03","Ajax",90));
		data_nilai.add(new Nilai("PEG04","Spring Boot",89));
		data_nilai.add(new Nilai("PEG04","Android",77));
		data_nilai.add(new Nilai("PEG04","Phyton",88));
		data_nilai.add(new Nilai("PEG04","Ajax",88));
		data_nilai.add(new Nilai("PEG05","Algoritma",89));
		data_nilai.add(new Nilai("PEG05","Spring Boot",90));
		data_nilai.add(new Nilai("PEG05","Android",100));
	}
	
	public static void get_list_karyawan() {
		System.out.println("-------------------------------------------------------");
		System.out.println(String.format("%s %-5s %5s %-6s %5s %-10s %5s %-5s %5s", "|","Kode","|","Nama","|","Alamat","|","Phone","|"));
		System.out.println("-------------------------------------------------------");
		for(Karyawan data:data_karyawan) {
			data.getInfo();
			System.out.print("\n");
		}
		System.out.println("-------------------------------------------------------");
	}
	
	public static void get_list_jadwal() {
		System.out.println("------------------------------------------------------------------");
		System.out.println(String.format("%s %-15s %5s %-9s %5s %-10s %5s %-5s %s", "|","Materi","|","Tanggal","|","Lokasi","|","Session","|"));
		System.out.println("------------------------------------------------------------------");
		for(Jadwal data:data_jadwal) {
			data.getInfo();
			System.out.print("\n");
		}
		System.out.println("------------------------------------------------------------------");
	}
	
	public static void get_list_nilai() {
		System.out.println("---------------------------------------------");
		System.out.println(String.format("%s %-20s %5s %-10s %5s","|","Nama","|","Nilai","|"));
		System.out.println("---------------------------------------------");
		
		float total = 0;
		int counter = 1;
		String kode = "";
		String nama = "";
		for(int i = 0; i < data_nilai.size(); i++) {
			if(i == 0) {
				kode = data_nilai.get(i).getKode_karyawan();
				total = (float) data_nilai.get(i).getNilai();
			}
			else if(i == data_nilai.size()-1) {
				for(int j = 0; j < data_karyawan.size(); j++) {
					if(kode == data_karyawan.get(j).getKode()) nama = data_karyawan.get(j).getNama();
				}
				System.out.println(String.format("%s %-20s %5s %-10s %5s","|",nama,"|",total/counter,"|"));
			}
			else {
				if(kode == data_nilai.get(i).getKode_karyawan()) {
					total = total + data_nilai.get(i).getNilai();
					counter++;
				}else {
					total = total / counter;
					for(int j = 0; j < data_karyawan.size(); j++) {
						if(kode == data_karyawan.get(j).getKode()) nama = data_karyawan.get(j).getNama();
					}
					System.out.println(String.format("%s %-20s %5s %-10s %5s","|",nama,"|",total,"|"));
					kode = data_nilai.get(i).getKode_karyawan();
					if(i < data_nilai.size()) {
						total = data_nilai.get(i).getNilai();
						counter = 1;
					}
				}
			}
		}

		System.out.println("---------------------------------------------");
	}
}
