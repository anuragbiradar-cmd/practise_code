package interview;

public class Video extends Thread {
	public void run() {
		int i=0;
		while(i<20)
		{
		System.out.println("video is started");
		i++;
		}
	}

}
