public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "D";

        switch (nilai){
            case "A":
                System.out.println("Wow, Anda Lulus dengan Baik!");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus dengan Baik!");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D" -> System.out.println("Anda tidak Lulus");
            default -> System.out.println("Mungkin Anda Salah Jurusan");
        }

        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus dengan Baik!";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D" -> ucapan = "Anda tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";

        }
        System.out.println(ucapan);



        ucapan = switch (nilai){
            case "A":
                yield "Wow, Anda Lulus dengan Baik!";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D":
                yield "Anda tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";
        };
        System.out.println(ucapan);

    }
}
