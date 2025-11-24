/* ==========================================
   ■■■ 실행 흐름의 컨트롤(제어문) ■■■
=============================================*/

// 1. 프로그램을 작성할 때 주어진 조건의 따라
// 분기 방향을 정하기 위해 사용되는 제어문에는
// if문, if-else문, 조건 연산자, 복합 if문(if문 중첩),
// switch문 등이 있다.

// 2. if문은 if 다음의 조건이 참(true)일 경우
// 특정 문장을 수행하고자 할 때 사용되는 구문이다.

// ○ 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 다음과 같은 형태로 출력하는 프로그램을 구현한다.
// 산출되는 등급은 평균 점수를 기준으로 처리한다.

// 90점 이상		   : A
// 80점 이상 90점 미만 : B
// 70점 이상 80점 미만 : C
// 60점 이상 70점 미만 : D
// 60점 미만		   : F	

// 단, BufferedReader를 활용하여 데이터를 입력받을 수 있도록 하며,
// printf() 메소드를 통해 출력할 수 있도록 한다.

// 실행 예)
// 이름 입력 : 홍길동
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// >> 당신의 이름은 홍길동입니다.
// >> 국어 점수는 90,
// >> 영어 점수는 80,
// >> 수학 점수는 70,
// >> 총점은 240이고, 평균은 80.00입니다.
// >> 등급은 B 입니다.
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, math, total;
		double avg;
		char grade;
		
		System.out.print("이름 입력 : ");
		name = br.readLine();
		
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학 점수 : ");
		math = Integer.parseInt(br.readLine());
		
		total = kor + eng + math;
		avg = total / 3;
		
		if(avg >= 90)
		{
			grade = 'A';
		}else if(avg >=80){
			grade = 'B';
		}else if(avg >=70){
			grade = 'C';
		}else if(avg>=60){
			grade = 'D';
		}else{
			grade ='F';
		}
		
		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n",name);
		System.out.printf(">> 국어 점수는 %d,\n",kor);
		System.out.printf(">> 영어 점수는 %d,\n",eng);
		System.out.printf(">> 수학 점수는 %d,\n",math);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n",total,avg);
		System.out.printf(">> 등급은 %c 입니다.\n",grade);
		
		
		
		
		
		
		
	}
}

// 실행 결과
/*
이름 입력 : 홍길동
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 홍길동입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80.00입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/