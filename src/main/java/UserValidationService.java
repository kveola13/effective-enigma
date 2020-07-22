public class UserValidationService {
    public boolean isUserValid(String user, String password) {
        return user.equals("rea") && password.equals("test");
    }
}
