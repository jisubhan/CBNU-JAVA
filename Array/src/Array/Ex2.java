package Array;
// ������ ���� �� �� �������� �Ž��� �־���Ѵ�. (�����������ڿ� ������ ������ ���)
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
			System.out.println(coinUnit[i]+"�� : "+count[i]);
		}
	}

}
