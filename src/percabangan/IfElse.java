package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if (uangDiDompet<totalBelanja){
            System.out.println("Uang Kurang, kurangi jajan Anda");
        }else{
            System.out.println("Uang Cukup, Selamat menikmati");
        }
    }
}
