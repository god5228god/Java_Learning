/* ==========================================
   ■■■ 실행 흐름의 컨트롤(제어문) ■■■
   - switch 구문
=============================================*/

// ○ 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch문을 활용하여 처리할 수 있도록 하며,
// 연산의 결과는 편의상 정수 형태로 처리할 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 3
// 두 번째 정수 입력 : 12
// 연산자 입력(+ - * /) : +

// 3 + 12 = 15
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		
		// [내 풀이]
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, op;
		int result=0;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력(+ - * /) :");
		op = System.in.read();					//아스키코드값 반환
		
		//+(43),-(45),*(42),/(47)
		switch(op)
		{ 
			default: System.out.println("입력오류");break;
			case 43: result = a + b; break; 
			case 45: result = a - b; break; 
			case 42: result = a * b; break; 
			case 47: result = a / b; break; 
		}
		
		System.out.printf("%d %c %d = %d\n",a,(char)op,b,result);
		
		//-------------------------------------------------------------------------
		
		// [모범 풀이]
		/*
		// ①
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result;
		int op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) :");
		op = System.in.read();	
		
		//테스트(확인)
		//System.out.println("op : " + op);
		// '+' → 43, '-' → 45, '*' → 42, '/' → 47
		
		switch (op)
		{
			case 43 : result = a + b; break;
			case 45 : result = a - b; break;
			case 42 : result = a * b; break;
			case 47 : result = a / b; break;
			default : return;		// 1. 값의 반환
									// 2. 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}
		System.out.println();		//개행
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		*/
		/*
		// ②
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result;
		//int op;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) :");
		//op = System.in.read();	
		op = (char)System.in.read();
		
		switch(op)
		{
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
			default : return;
		}
		
		System.out.println();		//개행
		System.out.printf(">> %d %c %d = %d\n", a, op, b, result);
		*/
		
		/*
		// ③
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a, b, result;
		//int op;
		//char op;
		String op;								//switch문에서는 문자열 비교 가능
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력(+ - * /) :");
		//op = System.in.read();	
		//op = (char)System.in.read();
		op = br.readLine();						// 문자열 그대로 받음
		
		switch(op)
		{
			//case '+': result = a + b; break;
			case "+": result = a + b; break;
			//case '-': result = a - b; break;
			case "-": result = a - b; break;
			//case '*': result = a * b; break;
			case "*": result = a * b; break;
			//case '/': result = a / b; break;
			case "/": result = a / b; break;
			default : return;
		}
		
		System.out.println();		//개행
		System.out.printf(">> %d %s %d = %d\n", a, op, b, result);
		*/
	}
}

//실행결과
/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
연산자 입력(+ - * /) :+
10 + 20 = 30
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
연산자 입력(+ - * /) :-
10 - 20 = -10
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
연산자 입력(+ - * /) :*
10 * 20 = 200
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 100
두 번째 정수 입력 : 2
연산자 입력(+ - * /) :/
100 / 2 = 50
계속하려면 아무 키나 누르십시오 . . .
*/