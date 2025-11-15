import java.util.Scanner;
public class Permission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name : ");
        String name=sc.nextLine();
        String permission = "yes";
        permission=sc.nextLine();
        while(permission.equals("yes")) {
            System.out.println("enter your permission yes :again return your name and no: program end :");
        }
    }
}
