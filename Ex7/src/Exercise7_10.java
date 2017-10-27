
class MyTv2 {
boolean isPowerOn;
 int channel;
int volume;
final int MAX_VOLUME = 100;
final int MIN_VOLUME = 0;
final int MAX_CHANNEL = 100;
final int MIN_CHANNEL = 1;

public void setChannel(int channel) {
	this.channel = channel;
}

public void print() {
	System.out.println("æ»≥Á«œººø‰");
}

public int getChannel() {
	return channel;
}

public void setVolume(int volume) {
	this.volume = volume;
}

public int getVolume() {
	return volume;
}
}
class Exercise7_10 {
public static void main(String args[]) {
MyTv2 t = new MyTv2();
t.setChannel(10);
System.out.println("CH:"+t.getChannel());
t.setVolume(20);
System.out.println("VOL:"+t.getVolume());

MyTv3 t1 = new MyTv3();
t1.print();
t.print();
}
}
