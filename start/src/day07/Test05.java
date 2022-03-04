package day07;
/*
	5과목의 점수를 기억할 변수를 만들고 과목점수를 입력하고 총점도 배열의 마지막에 계싼하여 입력하고
	평균을 구하고 출력하세요 배열에 담긴 과목 점수도 같이 출력하세요.
*/
import java.util.*;
public class Test05 {
	public static void main(String[] args) {
		//배열을 만든다.
		int [] subj = new int[6];
		//맨 마지막방에는 총점이 들어가야되니 그 앞 방까지만
		for(int i = 0 ; i < subj.length-1 ; i++) {
			//과목점수 만들어서 입력
			int score = (int)(Math.random()*41+60);
			subj[i] = score;
		}
		System.out.println("1. "+Arrays.toString(subj));
		//총점 계산해서 입력
		for(int i = 0 ; i < subj.length-1 ; i++) {
			//subj[5] += subj[i];
			subj[subj.length-1] +=subj[i];
		}
		System.out.println("2. "+Arrays.toString(subj));		
		//평균 구하여 기억시킴
		//과목수
		double avg = (double)subj[subj.length-1]/subj.length-1;
		//과목점수 출력
		System.out.print("과목점수 : | ");
		for(int i = 0 ; i < subj.length-1 ; i++) {
			System.out.print(subj[i]+" | ");
		}
		//총점 출력
		System.out.println();//여기는 출바꿈
		System.out.println("총		점 : "+subj[subj.length-1]);//여기는 출바꿈
		//평균출력
		System.out.println("평		균 : "+avg);
		
	}

}
