public class Student {
	private String studentNumber;
	private String studentName;
	private int markForMaths;
	private int markForEnglish;
	private int markForScience;

	// ���캯��
	Student(String number, String name) {
		this.studentNumber = number;
		this.studentName = name;
	}
	
	tudent() {
		// Nothing to do
	}

	// ��ȡѧ��
	public String getNumber() {
		return this.studentNumber;
	}

	// ��ȡ����
	public String getName() {
		return this.studentName;
	}

	// ¼��ɼ�
	public void enterMarks(int markForMaths, int markForEnglish, int markForScience) {
		this.markForMaths = markForMaths;
		this.markForEnglish = markForEnglish;
		this.markForScience = markForScience;
	}

	// ��ȡ��ѧ�ɼ�
	public int getMathsMark() {
		return this.markForMaths;
	}

	// ��ȡӢ��ɼ�
	public int getEnglishMark() {
		return this.markForEnglish;
	}

	// ��ȡ��ѧ�ɼ�
	public int getScienceMark() {
		return this.markForScience;
	}

	// ����ƽ���ɼ�
	public double calculateAverage() {
		return (this.markForMaths+this.markForEnglish+this.markForScience) / 3.0;
	}

	// ���ѧ����Ϣ
	public String toString() {
		String str = "";
		str += "ѧ�ţ�"+getNumber()+"\n";
		str += "������"+getName()+"\n";
		str += "��ѧ�ɼ���"+getMathsMark()+"\n";
		str += "Ӣ��ɼ���"+getEnglishMark()+"\n";
		str += "��ѧ�ɼ���"+getScienceMark()+"\n";
		str += "ƽ���ɼ�:"+calculateAverage()+"\n";
		return str;
	}
}