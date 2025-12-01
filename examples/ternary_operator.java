/* ==================================
   ■■■ 연산자(Operator) ■■■
   - 조건 연산자 == 삼항 연산자
=====================================*/

// ○ 사용자로부터 임의의 한 문자를 입력받아
//	  입력받은 문자가 대문자이면 소문자로, 소문자이면 대문자로
//	  알파벳이 아닌 기타 문자라면 그 문자를 입력받은 그대로 출력하는
//	  프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : b
// b → B
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : 7
// 7
// 계속하려면 아무 키나 누르세요...


import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{	/*
		//[내 풀이]
		char result, a;
		int ch;
		
		System.out.print("한 문자 입력 : ");
		ch = System.in.read(); // int
		
		result = (ch >= 65 && ch <= 90)?(char)(ch+32) :(ch >= 97 && ch<=122) ? (char)(ch-32):(char)ch;
		
		System.out.println((char)ch + "→" + result);
		*/
		//------------------------------------------------------------------------------------------------
		
		//[모범 풀이]
		
		/*
		//char temp;
		int temp;
		
		System.out.print("한 문자 입력 : ");
		temp =System.in.read();
		
		//확인
		//System.out.println("입력 받은 값 확인 : " + temp);
		// 'A' → 65
		// 'B' → 66
		//  :
		// 'Z' → 90
		
		// 'a' → 97
		// 'b' → 98
		//  :
		// 'z' → 122
		
		// 대문자 → 소문자
		// 'A'(65) → 'a'(97) → +32
		// 'B'(66) → 'b'(98) → +32
		//			:
		// 'Z'(90) → 'z'(122) → +32
		
		//대문자? 소문자변환 : (소문자? 대문자변환 : 그대로);
		//(temp >= 65 && temp <= 90)? temp + 32 : (소문자? 대문자변환 : 그대로);
		//(temp >= 65 && temp <= 90)? temp + 32 : ((temp >= 97 && temp <= 122)? temp - 32 : temp);
		//(temp >= 'A' && temp <= 'Z')? temp + 32: ((temp >= 'a' && temp <= 'z')? temp - 32 : temp); -- temp가 char일 때
		
		*/
		
		
		char ch, result;
		
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();
		
		//대문자? 소문자변환 : (소문자? 대문자변환 : 그대로);
		result = (ch >= 'A' && ch <= 'Z')? ((char)(ch + 32)) : ((ch >= 'a' && ch <= 'z')? ((char)(ch - 32)) :ch);
		
		//'Q'(81)
		//result = (ch >= 'A' && ch <= 'Z')? ((char)(ch + 32)) : ((ch >= 'a' && ch <= 'z')? ((char)(ch - 32)) :ch);
		//result = ('q');
		
		//'m'(109)
		//result = (ch >= 'A' && ch <= 'Z')? ((char)(ch + 32)) : ((ch >= 'a' && ch <= 'z')? ((char)(ch - 32)) :ch);
		//result = ('M');
		
		//9(57)
		//result = (ch >= 'A' && ch <= 'Z')? ((char)(ch + 32)) : ((ch >= 'a' && ch <= 'z')? ((char)(ch - 32)) :ch);
		//result = ('9');
		
		System.out.println(ch + "→" + result);
	}
}

//실행 결과
/*
한 문자 입력 : C
C→c
계속하려면 아무 키나 누르십시오 . . .
*/

/*
한 문자 입력 : j
j→J
계속하려면 아무 키나 누르십시오 . . .
*/

/*
한 문자 입력 : 8
8→8
계속하려면 아무 키나 누르십시오 . . .
*/
