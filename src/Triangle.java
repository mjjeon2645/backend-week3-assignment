// 1. 삼각형의 높이(height)를 입력받는다.
// 2. 입력받은 숫자가 2 미만, 또는 20 이상일 경우 "다시 입력해주세요"라는 문구 출력 후 다시 입력받는다.
// 3. 범위 내의 숫자가 들어온 경우 삼각형 출력을 위한 처리를 진행한다.
//    => height = n이 입력되었을 경우
//    => 각 행당 별의 갯수는 가장 윗줄부터 1, 3, 5, 7, ... , 2n-1개로 산정된다.
//    => 별 앞에 공백은 가장 윗줄부터 n-1개, n-2개, n-3개, ... 1개, 0개로 산정된다.
// 4. 첫 행의 공백 배열을 산정하고, 그 배열 뒤에 별 배열을 붙여넣는다.
// 5. 다음 행의 공백 배열을 산정하고, 별 배열을 붙여넣은 뒤 전 행의 결과값의 다음줄에 붙여넣는다.
// 6. 이를 n번째 줄까지 반복한 후 결과값을 출력한다.

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // 0. 준비
        Scanner scanner = new Scanner(System.in);

        // 1. 입력
        System.out.println("삼각형의 높이를 입력해 주세요(2 이상 20 미만)");
        int height = scanner.nextInt();

        // 2. 처리
        while (height < 2 || height >= 20) {
            System.out.println("다시 입력해주세요");
            height = scanner.nextInt();
        }

        String result = "";

        for (int k = 0; k < height; k += 1) {
            String blank = "";
            String star = "";

            for (int i = 0; i < height - (k + 1); i += 1) {
                blank += " ";
            }

            for (int j = 0; j < 2 * k + 1; j += 1) {
                star += "*";
            }

            result += (blank + star + "\n");
        }

        // 3. 출력
        System.out.println(result);
    }
}
