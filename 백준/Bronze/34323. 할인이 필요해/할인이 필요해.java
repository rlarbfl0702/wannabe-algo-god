import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();
        scanner.close();

        // N% 할인 계산
        // (M+1)개 상품의 원래 가격
        long originalPrice = (long)(M + 1) * S;
        // 할인율 (100 - N)%을 적용한 분자 계산
        long discountedNumerator = originalPrice * (100 - N);
        // 100으로 나눔 (정수 나눗셈이 소수점 이하를 버림)
        long costNPercent = discountedNumerator / 100;

        // M+1 할인 계산
        // M개를 구매하고 1개는 무료, 총 M개를 구매한 가격
        long costMPlus1 = (long)M * S;

        // 두 할인 방식 중 더 저렴한 최소 금액 선택
        long minCost = Math.min(costNPercent, costMPlus1);

        System.out.println(minCost);
    }
}