package asd;

import java.util.Scanner;

public class Player extends Number {
	String name="선공자";
	Integer h=100;
	Scanner sc = new Scanner(System.in);
	
        public void Buildup(){
		System.out.println("숫자 1~5의 숫자를 쓰시오");
		b=sc.nextInt();
		randNum();
		c=c+a[b-1];
		System.out.println("+"+a[b-1]+"강화 성공");
	}
	public void Attack(){
		System.out.println(name+"의 공격 숫자 1~5의 숫자를 쓰시오 ");
		b=sc.nextInt();
		randNum();
		System.out.println(a[b-1]+"의 데미지를 입힘");
	}
	public void Now(){
		System.out.println("플레이어:"+name+" 체력: "+h);
		System.out.println("현재 강화 수치: "+c);
		System.out.println(name+"의 턴");
		System.out.println("1은 공격||2은 무기강화");
	}
	public void health(){
		System.out.println("플레이어1:"+name+" 체력: "+h);
	}
}
