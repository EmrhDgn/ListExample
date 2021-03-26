import java.util.Scanner;

public class Mart25 {

		public static void main(String arg[]) {
			Scanner scan=new Scanner(System.in);
			Mart25Listesi liste=new Mart25Listesi(5);
			liste.listeyeEkle("Ekmek");
			liste.listeyeEkle("Su");
			liste.listeyeEkle("Peynir");
			liste.listeyeEkle("Zeytin");
			liste.yaz();
			System.out.print("Index giriniz :");
			int a=scan.nextInt();
			System.out.print("Index giriniz");
			String b=scan.next();
			liste.sil(a);
			liste.ekle(b, a);
			System.out.println("Buradan sonrasý silinen liste");
			liste.yaz();
		}
	}

	


