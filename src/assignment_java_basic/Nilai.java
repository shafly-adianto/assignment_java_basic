package assignment_java_basic;

public class Nilai {
	private String kode_karyawan;
	private String materi;
	private int nilai;
	
	public Nilai(String kode_karyawan, String materi, int nilai) {
		super();
		this.kode_karyawan = kode_karyawan;
		this.materi = materi;
		this.nilai = nilai;
	}
	
	public void getInfo() {
		System.out.print(String.format("%5s %5s %5s %20s %5s %10s %5s", "|",kode_karyawan,"|",materi,"|",nilai,"|"));
	}

	public String getKode_karyawan() {
		return kode_karyawan;
	}
	
	public int getNilai() {
		return nilai;
	}
}
