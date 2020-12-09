import java.util.Scanner;
public class KTP {
 
    public static void main (String [] args ) {
       
        Scanner input= new Scanner (System.in);
        System.out.println("Selamat Datang");
        System.out.println("Silahkan Inputkan Data diri Anda"); 
        
        System.out.println("Masukkan Data Diri Anda"); 
        System.out.println("NIK=");   int NIK = input.nextInt();
       
        System.out.println("Nama=");   String nama = input.next();
        
        System.out.println("Tempat Tanggal Lahir=");  int TTL = input.nextInt();
        
        System.out.println("Jenis Kelmin="); String JenisKelamin = input.next();
         
        System.out.println("Alamat="); String Alamat = input.nextLine();
         
        System.out.println("Pekerjaan="); String Pekerjaan = input.nextLine();
         
        System.out.println("Berlaku Hingga=");  String Exp = input.nextLine();
         
        System.out.println("Kewarganegaraan=");   String Kewarganegraan = input.next();
        
        
         System.out.println("Selesai"); 
    }

    }

