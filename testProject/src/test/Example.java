//자바 파일 첫 줄에는 반드시 소속 패키지를 선언해야 함
// 패키지 선언문 : package 소속 패키지명;
package test;

//import 선언문 작성하는 부분 : import 소속패키지명.클래스명;
//클래스명은 무조건 대문자
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.lang.System;
/*
 여러 행을 주석 처리할 때는 지금처럼 작성함
 자바 언어의 기본 패키지 java.lang 패키지임
 자바 파일 안에서 java.lang 패키지에 소속된 클래스는 import 선언을 생략하고 사용할 수 있음
 컴파일 시에 자동으로 import java.lang.*: 추가됨 
 */
//클래스 작성부 : 클래스명이 바로 파일명임

public class Example{ //클래스 시작
	//메인은 실행을 시키기 위해 존재 (가전제품을 생각해 보면 됨 시작 버튼은 유일함)
	//main() 메소드가 들어 있으면, 실행용 클래스임
	//main() 메소드가 없으면, 기능 재공용 클래스임(대부분임)
	public static void main(String[] args){ //왜 static을 사용하는가???, 이름 뒤에 ()가 들어가는 애들은 메소드라고 함, main() 시작
//		소스 코드 구문 작성함, 영역은 {}로 표시
		String todayFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		System.out.println(todayFormat);
	} // main() 끝
} //클래스 끝