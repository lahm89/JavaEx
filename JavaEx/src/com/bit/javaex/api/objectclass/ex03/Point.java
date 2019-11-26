package com.bit.javaex.api.objectclass.ex03;
// 복제 가능하도록 Clonable implement
public class Point implements Cloneable {
	// Clonable 인터페이스 구현 시 내부에서 clone 메소드 사용 가능
	// 필드
	private int x;
	private int y;
	// 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// Getter
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	// 문자열 출력을 위한 toString 메소드 오버라이드
	@Override
	public String toString() {
		return String.format("Point(%d, %d)%n", x, y);	// 출력할 데이터를 리턴
	}
	
	// 내부 값의 비교를 위해서 equals 메소드 오버라이드
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {		// obj는 Point의 객체인지 확인 -> 캐스팅 가능
			Point other = (Point)obj;	// 캐스팅을 하여 x, y의 값 비교 가능해짐
			return x == other.x && y == other.y;
		}
		return super.equals(obj);	// obj가 Point가 아닐 경우
	}
	
	// 복제 객체를 얻기 위한 메소드 작성
	public Point getClone() {
		// 현재 인스턴스를 복제(clone)해서 새 Point를 만들어서 return
		Point newPoint = null;
		
		try {
			newPoint = (Point)clone();	// clone 메소드는 object를 반환하므로 강제캐스팅
			// 현재 객체를 복제 후 캐스팅
		} catch (CloneNotSupportedException e) {
			// 복제 실패 시 CloneNotSupportedException이 발생
			e.printStackTrace();	// 에러메세지 출력
		}
		return newPoint;	// 복제된 새 겍체를 리턴
	}
}
