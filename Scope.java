public class Scope {
    public static void main(String[] args) {

        sayHello("Momon");
        sayHello("");
        // error System.out.println(hi);

    }

    static void sayHello(String name){
        String hello = "hello " + name;

        if(!name.isBlank()){
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
        // error System.out.println(hi);
    }
}
