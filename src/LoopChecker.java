public class LoopChecker implements Checker{

    private static final String VALID_CHARACTERS = "abcdifghijklmnopqrstuvwxyzABCDIFGHIJKLMNOPQRSTUVWXYZ0123456789_";
    @Override
    public void check(String login,
                      String password,
                      String confirmPassword) throws WrongLoginException, WrongPasswordException {

            if (login == null || login.length() > 20) {
                throw new WrongLoginException("Длина логина должна быть меньше или равно 20");
            }
            if (password == null || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли должны совпадать");
            }
            if (password == null && password.length() >= 20) {
                throw new WrongPasswordException("Длина пароля должна быть меньше 20");
            }

            checkCharacters(login, "Логин");
            checkCharacters(password, "Пароль");
        }


    private static void checkCharacters(String s, String word) throws WrongLoginException {
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                throw new WrongLoginException(String.format(" %s содержит неверный символ %c!", word, s.charAt(i)));
            }
        }
    }
}
