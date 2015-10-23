package persegiPanjang;

public class PersegiPanjang {
	//inisiasi double panjang dg modifier private
	private double panjang;
	//inisiasi double lebar dg modifier private
	private double lebar;
	
	//method PersegiPanjang()
	public PersegiPanjang(){
		panjang = 0;
		lebar = 0;
		}
	
	//method luas untuk mereturn nilai p*l
	private double luas(double p, double l){
		return p*l;
	}
	//method setPanjang untuk memberi nilai int panjang
	public void setPanjang(double panjang){
		this.panjang = panjang;
	}
	//method setLebar untuk memberi nilai int lebar
	public void setLebar(double lebar){
		this.lebar = lebar;
	}
	//method getPanjang untuk mereturn nilai panjang
	public double getPanjang(){
		return panjang;
	}
	//method getLebar untuk mereturn nilai lebar
	public double getLebar(){
		return lebar;
	}
	//method getLuas() untuk mereturn nilai luas, dengan parameter panjang dan lebar
	public double getLuas(){
		return luas(panjang,lebar);
	}
}
