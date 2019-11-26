package com.bit.javaex.api.stringclass;

public class StringEx {
	public static void stringBasic() {
		// 문자열의 생성
		// 문자열 : char형 데이터 여러개가 연결된 자료 *한번 생성되면 변경 불가*
		String s1 = "Java";	// Literal -> 실제 소스코드에 직접 입력한 문자열
		String s2 = new String("Java");	// 메모리에 새로 생성된 문자열
		String s3 = "Java";	// Literal
		// Literal 문자열은 값이 같으면 같은 객체로 판단
		
		System.out.println(s1 == s2);	// s1과 s2는 같은 객체인가?
		System.out.println(s1 == s3);	// s1과 s3는 같은 객체인가?
		
		// 문자열은 char형의 집합->char 배열로 문자열 생성 가능
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		System.out.println(s4);	// char 배열로 만들어진 문자열
		
		// 기본 데이터형 자료가 있을 때->문자열로 변경(valueof 메소드)
		String s5 = String.valueOf(3.14159);
		System.out.println(s5);
	}
	
	public static void methodsEx() {
		// String의 유용한 메서드들
		String str = "Java Programming is Fun?";
		
		// 길이 : .length() 메소드
		System.out.println("length: " + str.length());
		
		// 변환 메소드
		System.out.println("UPPERCASE: " + str.toUpperCase());
		System.out.println("LOWERCASE: " + str.toLowerCase());
		// 문자열은 생성 후 변경 불가하기 때문에 변환 메소드를 사용해도 원본은 바뀌지 않고 새로 할당 받음
		
		// 검색 메소드
		System.out.println("contains: " + str.contains("Java"));
		
		// 5번 인덱스의 char
		System.out.println("charAt: " + str.charAt(5));
		System.out.println("indexOf: " + str.indexOf("Fun"));	// 문자열 내부에서 Fun의 인덱스 반환
		System.out.println("lastIndexOf: " + str.lastIndexOf("Fun"));	// 검색 방향 반대
		System.out.println("없는 검색어의 인덱스: " + str.indexOf("fun"));
		
		String str2 = "I Like Java, I Like Python";
		int i = str2.indexOf("Like");	// str2 내의 Like의 인덱스
		System.out.println("Like index: " + i);
		i += "Like".length();
		i = str2.indexOf("Like", i);	// 두번째 인자는 검색 시작 위치
		System.out.println("Like 2nd index: " + i);
		
		// 문자열 추출 : substring
		// str로부터 Programming 문자열 추출
		System.out.println("substring: " + str.substring(5, 16));
		// 두번째 인자값은 endIndex 직전까지 추출
		// str 5번 인덱스부터 끝까지->endIndex 생략
		System.out.println("substring 끝까지: " + str.substring(5));
		
		// 치환 메소드 : replace
		// str2의 Like->like로 변환
		System.out.println(str2.replace("Like", "like"));
		
		// 공백 문자 제거 : trim()
		String str3 = "       Hello     ";
		str3 = str3.trim();
		System.out.println(str3);
		
		// 문자열 분리 : split()
		String[] chunks = str.split(" ");
		for(String word: chunks) {
			System.out.println("word: " + word);
		}
	}
	
	public static void stringBUfferEx() {
		// String 버퍼는 내부에 버퍼(임시공간)을 가지고 잇는 자료형
		// String객체는 매번 새 객체를 생성하는데 반해 StringBuffer는 내부 버퍼에서 모든 작업 수행->메모리 효율 좋음
		StringBuffer sb = new StringBuffer("This");
		// 뒤에 문자열 추가 : .append();
		sb.append(" is pencil");	// 문자열 추가(마지막)
		sb.insert(7, " my");			// 문자열 삽입(중간)
		System.out.println( sb );
		sb.replace(7, 10," your");	// 문자열 변경
		System.out.println( sb );
		
		// 메소드 체이닝
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is")
				.append(" pencil")
				.insert(8, "my")
				.replace(8, 10, "your ");
		String s = sb2.toString();
		System.out.println(s);
		System.out.println(sb2);
	}
	public static void main(String[] args) {
//		stringBasic();
//		methodsEx();
		stringBUfferEx();
	}

}
