package com.bit.javaex.oop.song;

public class SongApp {

	public static void main(String[] args) {
    Song s1 = new Song();
    s1.setSong("아이유", "좋은날", "Real", 2010, 3, "이민수");
    s1.showInfo();
    Song s2 = new Song();
    s2.setSong("BIGBANG", "거짓말", "Always", 2007, 2, "G-DRAGON");
    s2.showInfo();
    Song s3 = new Song();
    s3.setSong("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, 4, "장범준");
    s3.showInfo();
	}

}
