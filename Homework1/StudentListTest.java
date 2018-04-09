import java.util.Scanner;

public class StudentListTest {
	private static StudentList stulist;

	public static void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ����Ϣ��");
		System.out.print("ѧ�ţ�");
		String num = sc.nextLine();
		System.out.print("������");
		String name = sc.nextLine();
		System.out.print("��ѧ�ɼ���");
		int math = sc.nextInt();
		System.out.print("Ӣ��ɼ���");
		int eng = sc.nextInt();
		System.out.print("��ѧ�ɼ���");
		int sci = sc.nextInt();
		Student stu = new Student(num, name);
		stu.enterMarks(math, eng, sci);
		if(stulist.add(stu))
			System.out.println("��ӳɹ���");
		else
			System.out.println("���ʧ�ܡ�");
	}

	public static void removeStudentByNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫɾ����ѧ�ţ�");
		if (stulist.remove(new Student(sc.nextLine(), null)))
			System.out.println("ɾ���ɹ���");
		else
			System.out.println("ɾ��ʧ�ܡ�");
	}

	public static void removeStudentByPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫɾ������ţ�");
		if (stulist.remove(Integer.parseInt(sc.nextLine())))
			System.out.println("ɾ���ɹ���");
		else
			System.out.println("ɾ��ʧ�ܡ�");
	}

	public static void checkEmpty() {
		if (stulist.getTotal() == 0)
			System.out.println("�б�Ϊ�ա�");
		else
			System.out.println("�б�Ϊ�ա�");
	}

	public static void getStudentByPosition() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ��ʾ��ѧ������ţ�");
		System.out.print(stulist.getItem(Integer.parseInt(sc.nextLine())));
	}

	public static void getStudentByNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������Ҫ��ʾ��ѧ����ѧ�ţ�");
		System.out.print(stulist.getItem(new Student(sc.nextLine(), null)));
	}

	public static void printAll() {
		for(int i = 0; i < stulist.getTotal(); i++)
			System.out.print(stulist.getItem(i));
	}

	public static void quit() {
		System.exit(0);
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ��������");
		stulist = new StudentList(Integer.parseInt(sc.nextLine()));
		while(true) {
			System.out.println("�˵����£������� 1~8 ������Ҫִ�еĲ�����");
			System.out.println("1.����1��ѧ�� 2.����ѧ��ɾ��ѧ�� 3.����λ��ɾ��ѧ��");
			System.out.println("4.�ж��Ƿ�Ϊ�� 5.����λ�÷���ѧ�� 6.����ѧ�ŷ���ѧ��");
			System.out.println("7.���ȫ��ѧ����Ϣ 8.�˳�����");
			System.out.print("���������Ĳ�����");
			int action = Integer.parseInt(sc.nextLine());
			
			switch(action) {
				case 1:
					addStudent();
					System.out.println("---Ŀǰ��"+stulist.getTotal()+"��ѧ������ϢΪ---");
					printAll();
					break;
				case 2:
					removeStudentByNumber();
					System.out.println("---Ŀǰ��"+stulist.getTotal()+"��ѧ������ϢΪ---");
					printAll();
					break;
				case 3:
					removeStudentByPosition();
					System.out.println("---Ŀǰ��"+stulist.getTotal()+"��ѧ������ϢΪ---");
					printAll();
					break;
				case 4:
					checkEmpty();
					break;
				case 5:
					getStudentByPosition();
					break;
				case 6:
					getStudentByNumber();
					break;
				case 7:
					printAll();
					break;
				case 8:
					quit();
					break;
				default:
					System.out.println("��Ч�����롣");

				System.out.println("");
			}
		}
	}
}