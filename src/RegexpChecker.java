public class RegexpChecker implements Checker {

    @Override
    public void check(String login,
                      String password,
                      String confirmPassword) throws WrongLoginException, WrongPasswordException{

    if (login==null || !login.matches("^\\w{1,20}$")){
        throw new WrongLoginException("Длина логина должна быть меньше или равной 20 и должен содержать валидные символы");
    }

        if (password == null || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
        if (!password.matches("^\\w{1,19}$")){
            throw new WrongLoginException("Длина пароля должна быть меньше  20 и должен содержать валидные символы");
        }


    }
}
