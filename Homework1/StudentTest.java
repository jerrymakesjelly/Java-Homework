import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧ��ѧ�ţ�");
		String num = sc.nextLine();
		System.out.print("������ѧ��������");
		String name = sc.nextLine();
		System.out.print("������ѧ�����ſγɼ�����ѧ��Ӣ���ѧ����");
		int maths = sc.nextInt();
		int eng = sc.nextInt();
		int sci = sc.nextInt();
		
		// ��������
		Student stu = new Student(num, name);
		stu.enterMarks(maths, eng, sci);
		System.out.print(stu);
	}
}