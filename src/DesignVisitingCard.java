/*save and display a user's full profile :name,email,mobilr number.
input: name=riya , mobile= 7465727, email= riya@gmail.com
output: clean format like a visiting card */
public class DesignVisitingCard {
    public static void main(String[] args) {
        //input
        String name = "Riya";
        String mobile = "6584678";
        String email = "riya@gmail.com";
//output of visiting card
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@@@@           VISITING CARD          @@@@");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(" *  NAME    : " + name);
        System.out.println(" *  MOBILE  : " + mobile);
        System.out.println(" *  EMAIL   : " + email);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
}
