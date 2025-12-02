/* ==========================================
   ■■■ 실행 흐름의 컨트롤(제어문) ■■■
   - if문
   - if ~ else문 실습
=============================================*/

// ○ 과제
// ○ 사용자로부터 임의의 연도를 입력받아
//	  입력받은 연도가... 윤년인지 평년인지 판별하여
//	  그 결과를 출력하는 프로그램을 구현한다.
//	  단, 입력은 BufferedReader를 활용하고
//    if 조건문을 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2000
// 2000년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2012
// 2012년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2025
// 2025년 → 평년
// 계속하려면 아무 키나 누르세요...

// ※ 2월이 28일까지 있는 해 → 평년
//			29일까지 있는 해 → 윤년

// ※ 윤년의 판별조건
//	  연도가 4의 배우시면서 100배수가 아니거나
//    400의 배수이면 윤년
//    그 이외의 연도는 평년

//연도가 4의 배수이면서 100의 배수가 아니거나 400의 배수면 윤년(leap)/ 그 외의 연도는 평년(common)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034{
	public static void main(String[] args) throws IOException{
		
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year;													// 사용자에게 입력 받을 연도 담을 변수
		String strLeap;												// 조건의 판별로 평년인지 윤년인지를 담을 문자열 변수
		
		System.out.print("임의의 연도 입력 : ");					// 사용자에게 임의의 정수 입력 받기
		year = Integer.parseInt(br.readLine());						// 입력 받은 정수를 year 변수에 정수형태로 담기
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){	// year의 값이 4의 배수이면서 100의 배수가 아니거나 400의 배수인 조건
			strLeap = "윤년";										// strLeap에 값 담기
		}else{														// year의 값이 그 외의 조건
			strLeap = "평년";										// strLeap에 값 담기
		}
		
		// 결과 출력
		System.out.printf("\n%d년 → %s\n",year,strLeap);
		
		
	}
}

//실행 결과

/*
임의의 연도 입력 : 2000

2000년 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 연도 입력 : 1994

1994년 → 평년
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 연도 입력 : 2025

2025년 → 평년
계속하려면 아무 키나 누르십시오 . . .
*/
