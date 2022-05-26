// 1.  정사각형 한 변의 길이를 입력받는다.
// 2. 크기가 2 미만이거나, 20 이상일 경우 다시 입력해주세요 라는 메시지를 출력하고 재입력받는다.
// 3. 범위 내의 수 n이 들어왔을 경우 행 당 "*" 을 n개만큼 출력, 그 행을 개행 후 n번 만큼 반복하여 출력하고 종료한다.

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.println("한 변의 길이를 입력해 주세요(2 이상 20 미만)");
        int side = scanner.nextInt();

        // 2. 처리
        while (side < 2 || side >= 20) {
            System.out.println("다시 입력해주세요");
            side = scanner.nextInt();
        }

        String star = "*";
        String result = "";

        for (int j = 0; j < side; j += 1) {
            for (int i = 0; i < side; i += 1) {
                result += star;
            }
            result += "\n";
        }

        // 3. 출력
        System.out.println(result);
    }
}
