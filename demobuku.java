public class demobuku
{
	public static void main (String args[])
		{ buku a,b;
		a=new buku();
		b=new buku();
		
		a.pengarang="Felix Siauw";
		a.judul="Beyond The Inspiration";
		b.pengarang="Budi Raharjo";
		b.judul="Mudah Belajar Java";
	  System.out.println("judul: "+a.judul+" pengarang: "+ a.pengarang);
	  System.out.println("judul: "+b.judul+" pengarang: "+ b.pengarang);	
	}
}