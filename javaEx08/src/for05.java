package Ap01;

public class for05 {

	public static void main(String[] args) {
		String[] users= {"봄","여름","가을","겨울"};
		// 1~20 
		//3의 배수, 5의 배수 ==>"짝"
		//나머지는 숫자가 세로방향 출력
		//봄:1
		//여름:2
		//가울:짝
		//겨울:4
		//봄 :짝
		
		for (int i=0; i<20;i++) {
			
				System.out.print(users[i%users.length]+":");
				if ((i+1)%3==0||(i+1)%5==0) {
					System.out.print("짝");
										
				}
				else System.out.print((i+1));
				System.out.println();
			
			
			
		}
		
		
	}

}
