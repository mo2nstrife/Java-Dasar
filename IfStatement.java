public class IfStatement {
    public static void main(String[] args) {

        var nilai = 75;
        var absen = 70;

        if(nilai >= 75 && absen >= 75){
            System.out.println("Selamat Anda LULUS");
        }else {
            System.out.println("Silahkan coba lagi tahun depan");
        }


        if(nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if(nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if(nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else if(nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }
    }
}
