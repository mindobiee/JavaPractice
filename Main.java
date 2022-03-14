import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!"); 
    Practice1 p1 = new Practice1(); 
    while(true){
      System.out.printf("메뉴를 선택하세요.(1:로그인, 2: 쪽지확인, 3:종료) ==>");
      Scanner scan = new Scanner(System.in);  
      String num=scan.next();

      switch(num){
        case "1" : 
          p1.login();
          break;
        case "2":
          p1.check();
          break;
        case "x":
          System.exit(0);
          break;
        default:
          System.out.println("잘못된 입력입니다. ");
      }
    }
}
}