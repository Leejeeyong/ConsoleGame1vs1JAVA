package asd;

import java.util.Scanner;

public class play {

	public static void main(String[] args) {
		Player p1 = new attacker();
		Player p2 = new defender();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임 방법");
		System.out.println("공격자는 숫자 1~5의 숫자를 쓰면 랜덤으로 공격력 숫자가 정해진다.");
		System.out.println("플레이어1의 이름을 쓰시오");
		p1.name=sc.next();
		System.out.println("플레이어2의 이름을 쓰시오");
		p2.name=sc.next();
		
		p1.health();
		p2.health();
		
		int i=1;
		while(i<10){
		System.out.println("-------------------");
		p1.Now();
		p1.b=sc.nextInt();
		if(p1.b==1){
			p1.Attack();
			p2.h=p2.h-p1.a[p1.b-1]-p1.c;
			}
	      		
		p2.Now();
		p2.b=sc.nextInt();
		if(p2.b==1){
			p2.Attack();
			p1.h=p1.h-p2.a[p2.b-1]-p2.c;
			}
		
		p1.health();
		p2.health();
		
		if(p1.h==0){
			System.out.println(p1.name+"의 승리");
			break;
		}
		if(p2.h==0){
			System.out.println(p2.name+"의 승리");
			break;
		}
		}
	}

}
