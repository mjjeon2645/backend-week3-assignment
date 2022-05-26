// 1. 마름모의 크기를 입력받는다.
// 2. 범위 외의 값(2 미만 또는 20 이상의 값 또는 짝수)을 입력받으면 다시 입력하라는 메시지와 함께 재입력 요청한다.
// 3. 범위 내의 값(2 이상 20 미만이면서 홀수)을 입력받으면 처리한다.
// 4. 아스키코드 마름모의 특징은 아래와 같다. (마름모 크기 n을 입력받았을 경우)
//    => 총 행의 수는 n개임
//    => n / 2 몫에 1을 더하면 가장 긴 행(가운데줄)이 몇째줄인지를 알 수 있다.
//    => 1 ~ 가운데줄까지 : 삼각형 만들기와 동일한 공식으로 첫번째 아스키코드 결과를 내놓는다.
//    => 가운데줄 + 1번째 줄 ~ 마지막줄까지 : 삼각형 만들기의 역순으로 두번째 아스키코드 결과를 내놓는다.
//    => 두 결과를 더해서 출력한다.

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.println("마름모의 크기를 입력해 주세요(2 이상 20 미만의 홀수)");
        int height = scanner.nextInt();

        // 2. 처리
        // 2-1. 범위 외 숫자
        while (height % 2 == 0 || height < 2 || height >= 20) {
            System.out.println("다시 입력해주세요");
            height = scanner.nextInt();
        }

        // 2-2. 범위 내 숫자 입력 시 위쪽 결과값 처리
        int minddleLineNumber = height / 2 + 1;
        String result = "";

        for (int i = 0; i < minddleLineNumber; i += 1) {
            String blank = "";
            String star = "";

            for (int j = 0; j < minddleLineNumber - (i + 1); j += 1) {
                blank += " ";
            }

            for (int k = 0; k < 2 * i + 1; k += 1) {
                star += "*";
            }

            result += (blank + star + "\n");
        }

        // 2-2. 범위 내 숫자 입력 시 아래쪽 결과값 처리
        for (int i = minddleLineNumber; i < height; i += 1) {
            String blank = "";
            String star = "";

            for (int j = minddleLineNumber; j < i + 1; j += 1) {
                blank += " ";
            }

            for (int k = height; k > 2 * i - 1; k -= 1) {
                star += "*";
            }

            result += (blank + star + "\n");
        }

        // 3. 출력
        System.out.println(result);

    }
}
