import java.util.Scanner;

public class Boj_10808 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] c = {"a", "b", "c", "d", "e", "f", "g", "h", "i", 
				      "j", "k", "l", "m", "n", "o", "p", "q", "r", 
				      "s", "t", "u", "v", "w", "x", "y", "z"}; //���ĺ� �迭 ����
		
		int arr[] = new int[26]; //�� ���ĺ� �ڸ� �� �迭 ����
		
		String str = sc.next(); // ���ڿ� �Է�
		String[] x = str.split(""); //�Է¹��� ���ڿ��� �ڸ���
		
		for(int i=0; i<x.length; i++) //���ڿ� ���̸�ŭ �ݺ�
		{
			for(int j=0; j<c.length; j++) //���ĺ� �迭 ���̸�ŭ �ݺ�
			{
				if(x[i].equals(c[j])) //�ڸ� ���ڿ��� �ϳ��� ���ĺ� �迭�� ��
				{
					arr[j]++; //������ ���ĺ� �迭 �ڸ��� ���� �ڸ��� 1�� ����
				}
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" "); //���
		}
	}
}
