package Array;
// 가능한 적은 수 의 동전으로 거슬러 주어야한다. (나눗셈연산자와 나머지 연산자 사용)
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinUnit = {500,100,50,10};
		
		int money = 2680;
		int[] count= {0,0,0,0};
		System.out.println("money = "+money);
		
		for(int i=0;i<coinUnit.length;i++) {
			count[i] = money/coinUnit[i];
			money=money%coinUnit[i];
		}
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원 : "+count[i]);
		}
	}

}
