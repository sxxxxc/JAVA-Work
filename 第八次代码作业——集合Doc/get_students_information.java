/*�ɿ���̨���չ̶���ʽ����ѧ����Ϣ������ѧ�ţ�������������Ϣ��
�����������Ϊexit�˳����������ѧ����Ϣ�ֱ��װ��һ��Student������
�ٽ�ÿ��Student������뵽һ�������У�Ҫ�󼯺��е�Ԫ�ذ��������С��������
���������ϣ���������ѧ����Ϣд�뵽���±���ÿ��ѧ������ռ����һ�С�*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
public class get_students_information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ����Ϣ(ѧ��-����-����):");
		String info = "";
		String[] s;
		//�����������ڴ��ѧ������
		ArrayList<Student> array = new ArrayList<Student>();
		//ѭ��¼��
		while(true){
			info = sc.next();
			if(info.equals("exit")){
				break;
			}
			s = info.split("-");
			array.add(new Student(s[0], s[1], Integer.parseInt(s[2])));	
		}
		//�Ƚ������С
		Collections.sort(array,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge()-o2.getAge();
			}
			
		});
		//��������
		for (Student student : array) {
			System.out.println(student);
		}
        //���뵽���±���
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\student.txt"))));
			for(int i = 0;i<array.size();i++){
				bw.write(array.get(i).getNumber()+"-"+array.get(i).getName()+"-"+array.get(i).getAge());
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
             //�ͷ���Դ
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

class Student{
	private String number;
	private String name;
	private int age;
	
	public Student() {}
	
	public Student(String number ,String name ,int age) {
		this.number=number;
		this.name=name;
		this.age=age;
	}
	
	public void setNumber(String number) {
		this.number=number;
	}
	
	public String getNumber() {
		return number;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
}
