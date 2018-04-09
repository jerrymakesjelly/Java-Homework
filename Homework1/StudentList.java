public class StudentList {
	private Student[] list; // list�洢ѧ������
	private int total; // ѧ��������
	
	// ���캯��
	StudentList(int length) {
		list = new Student[length];
	}

	// ����stu��������
	public boolean add(Student stu) {
		if (total >= list.length)
			return false;
		else {
			list[total] = stu;
			total++;
			return true;
		}
	}

	// ɾ���� no ������Ԫ��
	public boolean remove(int no) {
		if (no < total) {
			for (int i = no; i < total - 1; i++)
				list[i] = list[i+1];
			total--;
			return true;
		}
		else
			return false;
	}

	// ɾ��ѧ��Ϊ number ��ѧ��
	public boolean remove(Student number) {
		int i;
		boolean found = false;
		for (i = 0; i < total; i++) {
			if (list[i].getNumber().equals(number.getNumber())) {
				found = true;
				break;
			}
		}
		if (!found)
			return false;
		else {
			for (; i < total - 1; i++)
				list[i] = list[i+1];
			total--;
			return true;
		}		
	}

	// �ж������Ƿ�Ϊ��
	public boolean isEmpty() {
		return total == 0;
	}

	// ���ص� no ��ѧ��
	public Student getItem(int no) {
		if(no < total)
			return list[no];
		else
			return null;
	}
	
	// ����ѧ��Ϊnumber��ѧ��
	public Student getItem(Student number) {
		for (int i = 0; i < total; i++)
			if (list[i].getNumber().equals(number.getNumber()))
				return list[i];
		return null;
	}

	// ����ѧ��������
	public int getTotal() {
		return total;
	}	
}