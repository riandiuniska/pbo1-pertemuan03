package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 53000;

        if (uangDiDompet<totalBelanja){  //condition 1
            System.out.println("Uang Kurang, kurangi jajan Anda");  //statement 1
        }else if(uangDiDompet>totalBelanja){  //condition 2
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup, angsulnya : "+angsul);  //statement 2
        }else{
            System.out.println("Uang Cukup, Selamat menikmati");    //statement 3
        }
    }
}
