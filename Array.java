public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Momon";
        stringArray[1] = "Strife";
        stringArray[2] = "Killer";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Avisya", "Rahmawati"
        };

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
                10L, 20L, 30L
        };

        System.out.println(arrayLong.length);


        String[][] members = {
                {"Momon", "Strife"},
                {"Eko", "Kurniawan"},
                {"Joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[2][0]);

    }
}
