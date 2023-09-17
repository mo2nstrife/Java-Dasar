public class TernaryOperator {
    public static void main(String[] args) {

        //Tanpa Ternary Operator
        var nilai = 75;
        String ucapan;

        if(nilai >= 75) {
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Silahkan Coba Lagi";
        }
        System.out.println(ucapan);

        //dengan Ternary Operator
        var nilai2 = 75;
        String ucapan2 = nilai2 >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba Lagi";
        System.out.println(ucapan2);
    }
}
