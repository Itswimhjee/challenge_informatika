import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("DIKETAHUI :");
        Scanner Massa = new Scanner(System.in);
        System.out.print("Massa (kg)  = ");
        int m = Massa.nextInt();

        Scanner Kalor_es = new Scanner(System.in);
        System.out.print("Kalor Es (J/kg/°C) = ");
        int Ces = Kalor_es.nextInt();

        Scanner Kalor_lebur = new Scanner(System.in);
        System.out.print("Kalor Lebur (J/kg) = ");
        int L = Kalor_lebur.nextInt();
        
        Scanner Suhu_awal = new Scanner(System.in);
        System.out.print("Suhu Awal (°C) = ");
        int T1 = Suhu_awal.nextInt();
        
        Scanner Suhu_akhir = new Scanner(System.in);
        System.out.print("Suhu Akhir (°C) = ");
        int T2 = Suhu_akhir.nextInt();

        System.out.println("DITANYA : Total Kalor (Qtotal)??");
        System.out.println("-----------------------------------------");
        System.out.println("Beda Suhu      = "+ (Beda_Suhu(T1, T2)));
        System.out.println("Kalor1 (Q1)    = "+ (Kalor1(m, Ces, Beda_Suhu(T1, T2) )));
        System.out.println("Kalor2 (Q2)    = "+ (Kalor2(m, L)));
        System.out.println("Jadi total dari kedua kalor (Qtotal) tersebut adalah "+ (Total_Kalor(Kalor1(m, Ces, Beda_Suhu(T1, T2)), Kalor2(m, L))));
    }

    private static int Beda_Suhu( int T1, int T2 ){
        int Beda_Suhu = T2 - T1;
        return Beda_Suhu;
    }
    
    private static int Kalor1( int m, int Ces, int Beda_Suhu ){
       int Kalor1 = m * Ces * Beda_Suhu;
       return Kalor1;
    }

    private static int Kalor2( int m, int L ){
       int Kalor2 = m * L;
       return Kalor2;
    }

    private static int Total_Kalor( int Kalor1, int Kalor2){
        int Total_Kalor = Kalor1 + Kalor2;
        return Total_Kalor;
    }

}
