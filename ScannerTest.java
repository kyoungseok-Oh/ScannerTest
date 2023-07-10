import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        int num = s.nextInt(); // 정수 입력
        float num_0 = s.nextFloat(); // 실수 입력
        double num_1 = s.nextDouble(); // 실수입력
        String str = s.next(); // 문자열입력(공백 앞까지 입력 받음)
        String str_0 = s.nextLine(); // 문자열입력(엔터까지 입력 받음)
        */
        //Q. 아래의 책 정보를 키보드로 입력 받아서 출력하세요.
        Scanner scan = new Scanner(System.in);
        System.out.print("제목 : ");
        String title = scan.next();
        System.out.print("가격 : ");
        int price = scan.nextInt();

        scan.nextLine();

        System.out.print("출판사 : ");
        String company = scan.nextLine();
        System.out.print("저자 : ");
        String author = scan.nextLine();
        System.out.print("페이지 수 : ");
        int page = scan.nextInt();

        scan.nextLine();

        System.out.print("ISBN : ");
        String isbn = scan.nextLine();
    }
}
