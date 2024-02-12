package interview;

public class Music extends Thread{
public void run() {
	int i=0;
	while(i<20) {
	System.out.println("music has started");
	i++;
	}
}
}
