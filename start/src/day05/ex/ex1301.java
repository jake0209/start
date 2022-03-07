package day05.ex;

/*
	문제 13 ]
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
		
		최대 공약수 :
			두 수의 약수중 제일 큰 수.
			두 수를 나눌 수 있는 수중 제일 큰 수
			
		extra ]
			위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보세요.
 */
public class ex1301 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random()*91+10);
		int no2 = (int)(Math.random()*91+10);
		
		System.out.println(no1+"|"+no2);
		int tmp = (no1>no2)?(no1):(no2);
		for(int i = tmp ; ; i++) {
			if(i%no1==0&&i%no2==0) {
				System.out.print(i+"는 no1과, no2의 최소공배수이다.");
				break;
			}
		}
	}
}
