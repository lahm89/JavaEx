package com.bit.javaex.oop.song;

public class Song {
	// 필드
	private String title, artist, album, composer;
	private int year, track;
	
	// 생성자
	public Song() {
		
	}
	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}
	public Song(String artist, String title, String album, int year, int track, String composer) {
		this(artist, title);
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	// Getter & Setter
	public String getTitle() {
		return title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setSong(String artist, String title, String album, int year, int track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %d번 track, %s 작곡 )%n", artist, title, album, year, track, composer);
	}
	
}
