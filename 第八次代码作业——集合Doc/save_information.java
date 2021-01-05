/*使用链表和映射存放多个图书信息，遍历并输出。
其中商品属性：编号，名称，单价，出版社；使用商品编号作为映射中的key。*/
import java.util.*;
public class save_information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建对象
		Book book1=new Book (1,"数据结构","80","张三出版社");
		Book book2=new Book (2,"C语言","50","李四出版社");
		Book book3=new Book (3,"数字逻辑","100","王五出版社");
		
		
		//放入HashMap中
		HashMap<Integer,Book>bookHashMap=new HashMap<>();
		bookHashMap.put(book1.getNumber(),book1);
		bookHashMap.put(book2.getNumber(),book2);
		bookHashMap.put(book3.getNumber(),book3);
		
		
		List<HashMap<Integer,Book>>bookList=new ArrayList<>();
		bookList.add(bookHashMap);
		
		System.out.println("编号\t书名\t单价\t出版社");
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

//创建类
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
