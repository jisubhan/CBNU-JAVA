package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated	 method stub
		
		int data[] = {11,16,21,26,35,39,47};
		int k=0, cnt =0;
		int low = 0;
		int high = data.length-1;
		int middle;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ã���� �ϴ� ���ڸ� 2�ڸ��� �Է��ϼ���: ");
		try {
			k = Integer.parseInt(in.readLine());
		} catch (Exception e) {
			System.out.println("�Է� ����");
		}
		while (true) {
			if (low > high) {
				System.out.println("�˻� �����Ͱ� �����ϴ�");
				break;
			}
			middle = (low + high) / 2;
			cnt++;
			System.out.println("�񱳰�:" + data[middle]);
			if (data[middle] == k) {
				System.out.println(middle + 1 + "��° ��ġ �˻�Ƚ��=" + cnt + "��");
				break;
			}
			if (k > data[middle]) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}


	}

}
