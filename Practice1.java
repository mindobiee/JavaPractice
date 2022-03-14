import java.util.Scanner;

public class Practice1{
  void login(){
    Scanner scan = new Scanner(System.in);// 스캐너 객체 
    
    System.out.print("아이디 입력:");//출력
    String name = scan.next();//입력

    System.out.print("비밀번호 입력:");
    String pwd = scan.next();

    if(name.equals("hong")&& pwd.equals("1234")){
      System.out.println("인증확인!");
    }else{
      System.out.println("아이디나 비밀번호가 틀렸습니다.!");
    }
    
  }
  void check(){
    int cnt = 10; 
    String msg = cnt>0? "새로운 쪽지가 있습니다" : "새로운 쪽지가 없습니다.";
    System.out.println(msg);    
  }
}