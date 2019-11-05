package assignment_java_basic;

public class Jadwal {
	private String materi;
	private String tanggal;
	private int lokasi;
	private int session;
	
	public Jadwal(String materi, String tanggal, int lokasi, int session) {
		super();
		this.materi = materi;
		this.tanggal = tanggal;
		this.lokasi = lokasi;
		this.session = session;
	}

	public void getInfo() {
		System.out.print(String.format("%s %-15s %5s %-9s %5s %-10s %5s %-5s %3s", "|",materi,"|",tanggal,"|",lokasi,"|",session,"|"));
	}
}
