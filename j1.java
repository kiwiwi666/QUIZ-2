import java.util.Scanner;
public class j1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    for(int times=0; times<3; times++) {
        System.out.println("�п�J�K�X:");
               String pwd1 = sc.next();
        System.out.println("�ЦA����J�K�X:");
        String pwd2 = sc.next();
        if(pwd1.equals(pwd2)) {
          System.out.println("�n�J���\");
          return;
        }
    }
    System.out.println("�ЦA�����]");
  }
}