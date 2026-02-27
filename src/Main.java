public class Main{
    public static void main(String[] args){
        User user1 = new User("ALI",19);
        User user2 = new User("AKBAR", 17);

        try {
            Validator.validate(user1);
            System.out.println("User1 uğurla keçdi ✅");
        } catch (Exception e) {
            System.out.println("User1 xəta: " + e.getMessage());
        }

        try {
            Validator.validate(user2);
            System.out.println("User2 uğurla keçdi ✅");
        } catch (Exception e) {
            System.out.println("User2 xəta: " + e.getMessage());
        }
    }
}