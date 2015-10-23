package persegiPanjang;

public class Main {
	public static void main(String[] args){
		//inisiasi class PersegiPanjang
		PersegiPanjang pp = new PersegiPanjang();
		
		//memanggil method dari class PersegiPanjang setPanjang dan memberi nilai
		pp.setPanjang(10);
		//memanggil method setLebar dari class PersegiPanjang dan memberi nilai
		pp.setLebar(30);
		
		//mengeprint nilai panjang dg memanggil method getPanjang() dari class PersegiPanjang
		System.out.println("Panjang : "+pp.getPanjang());
		//mengeprint nilai lebar dg memanggil method getLebar() dari class PersegiPanjang
		System.out.println("Lebar : "+pp.getLebar());
		//mengeprint nilai luas dg memanggil method getLuas() dari class PersegiPanjang
		System.out.println("Luas : "+pp.getLuas());
	}
}
