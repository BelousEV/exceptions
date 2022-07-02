public class Validator {

    private static final Checker CHECKER_1 = new LoopChecker();
    private static final Checker CHECKER_2 = new RegexpChecker();


    private Validator() {
    }

    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
            CHECKER_1.check(login, password, confirmPassword);
            CHECKER_2.check(login, password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }




}











