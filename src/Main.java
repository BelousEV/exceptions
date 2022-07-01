public class Main {
    public static void main(String[] args) {
        boolean result = Validator.validate("Nataha", "Hki_098jfjkI_k_k", "Hki_098jfjkI_k_k");
        if (result) {
            System.out.println("Логин и пароль верны");
        } else {
            System.out.println("Логин и/или пароль н/верны");
        }



    }
}