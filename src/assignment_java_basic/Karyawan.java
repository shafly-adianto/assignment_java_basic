package assignment_java_basic;

public class Karyawan {
	private String kode_karyawan;
	private String nama;
	private String alamat;
	private String phone;
	
	public Karyawan(String kode_karyawan, String nama, String alamat, String phone) {
		super();
		this.kode_karyawan = kode_karyawan;
		this.nama = nama;
		this.alamat = alamat;
		this.phone = phone;
	}
	
	public void getInfo() {
		System.out.print(String.format("%s %-5s %5s %-6s %5s %-10s %5s %-5s %5s", "|",kode_karyawan,"|",nama,"|",alamat,"|",phone,"|"));
	}

	public String getNama() {
		return nama;
	}
	
	public String getKode() {
		return kode_karyawan;
	}
}