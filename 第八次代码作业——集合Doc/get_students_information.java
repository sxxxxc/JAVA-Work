/*由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，
当输入的内容为exit退出；将输入的学生信息分别封装到一个Student对象中
再将每个Student对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序；
最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行。*/

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
		System.out.println("请输入学生信息(学号-姓名-年龄):");
		String info = "";
		String[] s;
		//创建集合用于存放学生对象
		ArrayList<Student> array = new ArrayList<Student>();
		//循环录入
		while(true){
			info = sc.next();
			if(info.equals("exit")){
				break;
			}
			s = info.split("-");
			array.add(new Student(s[0], s[1], Integer.parseInt(s[2])));	
		}
		//比较年龄大小
		Collections.sort(array,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge()-o2.getAge();
			}
			
		});
		//遍历集合
		for (Student student : array) {
			System.out.println(student);
		}
        //读入到记事本中
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
             //释放资源
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
