public class Variable {
    public static void main(String[] args) {

        String name;
        name = "Momon Strife";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "Avisya Rahmawati";
        System.out.println(name);

        var firstName = "Momon";
        var lastName = "Strife";

        final String project = "Belajar JAVA";
        final var project2 = "Belajar PHP";

        //final var project2 = "Ngopi";   ---> ERROR variable final tidak bisa diganti valuenya

    }
}
