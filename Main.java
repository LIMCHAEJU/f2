import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("로그인 하시겠습니까?");
    System.out.println("로그인\t 회원가입");

    Scanner scanner = new Scanner(System.in);
    string loginOrJoin = scanner.next();

    if (loginOrJoin == "로그인") {
      login("로그인");
    }
  }
}