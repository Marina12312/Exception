public class UserValidation {
    public static void validateCredentials(String login, String password,
                                           String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        // Проверка login
        if (login.length() > 20 || !login.matches("[A-Za-z0-9_]+")) {
            throw new WrongLoginException("Ошибка! Login должен содержить в себе только латинские буквы, цифры и знак подчеркивания");
        }

        // Проверка password
        if (password.length() > 20 || !password.matches("[A-Za-z0-9_]+")) {
            throw new WrongPasswordException("passwordОшибка! password должен содержить в себе только латинские буквы, цифры и знак подчеркивания");
        }

        // Проверка на совпадение password и confirmPassword
        if (password.length() != confirmPassword.length()) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
        System.out.println("Данные подходят");
    }

}
