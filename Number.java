package asd;

public class Number {
	int [] a=new int[5];
	int b;
	int c=0;
	public void randNum(){
		for(int i=0;i<5;i++){
			a[i]=(int)(Math.random()*(5)+(1));
		}
	}
}
