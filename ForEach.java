public class ForEach {
    public static void main(String[] args) {


        String[] names = {
                "Avisya", "Ayu", "Rahmawati",
                "Momon", "Strife", "Cooler"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        for (var nama : names){
            System.out.println(nama);
        }
    }
}
