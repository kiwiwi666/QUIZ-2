import java.util.Scanner;
public class j1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    for(int times=0; times<3; times++) {
        System.out.println("請輸入密碼:");
               String pwd1 = sc.next();
        System.out.println("請再次輸入密碼:");
        String pwd2 = sc.next();
        if(pwd1.equals(pwd2)) {
          System.out.println("登入成功");
          return;
        }
    }
    System.out.println("請再次重設");
  }
}