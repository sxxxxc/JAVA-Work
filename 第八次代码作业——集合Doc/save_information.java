/*ʹ�������ӳ���Ŷ��ͼ����Ϣ�������������
������Ʒ���ԣ���ţ����ƣ����ۣ������磻ʹ����Ʒ�����Ϊӳ���е�key��*/
import java.util.*;
public class save_information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		Book book1=new Book (1,"���ݽṹ","80","����������");
		Book book2=new Book (2,"C����","50","���ĳ�����");
		Book book3=new Book (3,"�����߼�","100","���������");
		
		
		//����HashMap��
		HashMap<Integer,Book>bookHashMap=new HashMap<>();
		bookHashMap.put(book1.getNumber(),book1);
		bookHashMap.put(book2.getNumber(),book2);
		bookHashMap.put(book3.getNumber(),book3);
		
		
		List<HashMap<Integer,Book>>bookList=new ArrayList<>();
		bookList.add(bookHashMap);
		
		System.out.println("���\t����\t����\t������");
		for (HashMap<Integer,Book>h:bookList) {
			Set<Integer>key=h.keySet();
			for (Integer i:key) {
				
				System.out.println(h.get(i).getNumber()
						+"\t"+h.get(i).getName()
						+"\t"+h.get(i).getPrice()
						+"\t"+h.get(i).getDress());
			}
		}
	}
}

//������
class Book{
	private int number;
	private String name;
	private String price;
	private String dress;
	
	public Book() {}
	
	Book(int number,String name,String price,String dress){
		super();
		this.number=number;
		this.name=name;
		this.price=price;
		this.dress=dress;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	int getNumber() {
		return number;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setprice(String price) {
		this.price=price;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setDress(String dress) {
		this.dress=dress;
	}
	
	public String getDress() {
		return dress;
	}
	
}
