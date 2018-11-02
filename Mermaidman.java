public class Mermaidman extends Hero{
	public int stockBolaAir=100;
	public Mermaidman(String nama){
		super(nama);//construktor Hero
		System.out.println("Stok bola air = "+showStockBA());
	}
	//overloading construktor
	public Mermaidman(String nama, int stockBolaAir){
		super(nama);
		this.stockBolaAir = stockBolaAir;
		System.out.println("Stok bola air = "+showStockBA());
	}
	public void shotKekuatan( int penggunaan){
		System.out.println("bola air yang digunakan = "+penggunaan);
		if (penggunaan>100){ 
			System.out.println("Stok bola air habis");
		}else{
			stockBolaAir -=penggunaan;
			System.out.println("sisa kekuatan = "+stockBolaAir);
		}
	}
	public int showStockBA(){
		return stockBolaAir;
	}

}