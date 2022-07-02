public interface Checker {
    void check(String login,
               String password,
               String confirmPassword) throws WrongLoginException, WrongPasswordException;
}
