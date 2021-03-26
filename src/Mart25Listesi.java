
	public class Mart25Listesi {
		String liste[];
		int elemanSayisi;
		int sinir;	
		public Mart25Listesi(int elemanKapasitesi) {

		liste =new String[elemanKapasitesi];
		elemanSayisi =0;
		sinir=elemanKapasitesi;
	}
	public void listeyeEkle(String eklenecekOlan) {
		if (elemanSayisi < sinir) {
			liste[elemanSayisi]=eklenecekOlan;
			elemanSayisi++;
		}else {
			System.out.println("Bos yer kalmadi!");
		}
	}
	public void yaz() {
		for(int i=0; i< elemanSayisi; i++) {
			System.out.println(liste[i]);
		}
	}
	public void sondanSil() {
		if (elemanSayisi>0) {
			elemanSayisi --;
			liste[elemanSayisi]= "";
		}else {
			System.out.println("Liste bos!");
		}
	}
	public void bastanSil (){
		for (int i = 0; i < elemanSayisi -1; i++) {
			liste[i]=liste[i+1];
		}
		elemanSayisi --;
	}
	public void sil(int index) {
		for (int i = index; i < elemanSayisi -1; i++) {
			liste[i]=liste[i+1];
		}
		elemanSayisi--;
	}
	public void ekle(String eklenecekEleman,int index) {
		for (int i = elemanSayisi-1; i >=index; i--) {
			liste[i+1]=liste[i];
		}
		liste[index]=eklenecekEleman;
		elemanSayisi++;
}
}

