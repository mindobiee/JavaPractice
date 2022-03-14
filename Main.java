import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world! press 1 or 2");
    System.out.println("1. 사용자 ");
    System.out.println("2. pet ");
    Scanner scan = new Scanner(System.in);  
    int num0 = scan.nextInt();
    if(num0==1){
      Practice1 p1 = new Practice1(); 
      while(true){
        System.out.printf("메뉴를 선택하세요.(1:로그인, 2: 쪽지확인, 3:종료) ==>");
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
    }else if(num0==2){
      System.out.println("강아지 울음소리");
      Pet pet = new Dog();
      pet.bark();
    
    }else{
      System.out.println("다시 누루세요.");
    }
    }
}