package day05.ex;

/*
	문제 12 ]
		5자리 숫자 하나를 입력받아서 
		이 숫자가 회문수 인지 아닌지 판별하는 프로그램을 작성하세요.
		
		참고 ]
			회문수란?
				첫번째 자리수와 마지막 자리수
				두번째 자리수와 마지막에서 두번째 자리수
				...
				가 동일한 수를 말한다.
 */
import java.util.*;
public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 숫자만 입력하셈");
		int no = sc.nextInt();
		if(no/10000==no%10) {
			if(no%10000/1000==no%100/10) {
				System.out.println("입력숫자 :"+no+"는 회문수가 맞음");
			}else {
				System.out.println("입력숫자 :"+no+"는 회문수가 아님");				
			}
		}else {			
			System.out.println("입력숫자 :"+no+"는 회문수가 아님");				
		}
	}

}
