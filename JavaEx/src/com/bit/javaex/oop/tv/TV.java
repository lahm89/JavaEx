package com.bit.javaex.oop.tv;

public class TV {
	private int channel, volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	
	public void power(boolean on) {
		if(on) {
			System.out.println("TV 전원 ON");
		} else {
			System.out.println("TV 전원 OFF");
		}
		this.power = on;
	}
	public void channel(int channel) {
		System.out.println("SET 채널" + channel);
		if(channel <= 255 && channel >= 1) {
			this.channel = channel;
		} else {
			System.out.println("없는 채널입니다.");
		}
	}
	public void channel(boolean up) {
		 if(up) {
			 System.out.println("채널 UP");
			 if(channel < 255)
				 channel++;
			 else
				 System.out.println("없는 채널입니다.");
		 } else {
			 System.out.println("채널 DOWN");
			 if(channel > 1)
				 channel--;
			 else
				 System.out.println("없는 채널입니다.");
		 }
	}
	public void volume(int volume) {
		System.out.println("SET 볼륨" + volume);
		if(volume <= 100 && volume >= 0) {
			this.volume = volume;
		} else {
			System.out.println("볼륨 범위를 초과하였습니다.");
		}
	}
	public void volume(boolean up) {
		if(up) {
			System.out.println("볼륨 UP");
			if(volume < 100)
				 volume++;
			else
				 System.out.println("최대 음량입니다.");
		 } else {
			 System.out.println("볼륨 DOWN");
			 if(this.volume > 0)
				 this.volume--;
			 else
				 System.out.println("최소 음량입니다.");
		 }
	}
	public void status() {
		if(power) {
			System.out.printf("현재 채널 : %d, 현재 음량 : %d%n" , channel, volume);
		} else {
			System.out.println("TV 전원이 꺼져있습니다.");
		}
	}
}
