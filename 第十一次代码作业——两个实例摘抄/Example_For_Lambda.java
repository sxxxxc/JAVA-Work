//JAVA Lambda
public class Example_For_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example_For_Lambda tester =new Example_For_Lambda();
		
		//��������
		MathOperation addition =(int a,int b) -> a+b;
		
		//������������
		MathOperation subtraction =(a,b)-> a-b;
		
		//�������еķ������
		MathOperation multiplication =(int a,int b)->{return a*b; };
		
		//û�д����ż��������
		MathOperation division =(int a,int b)->a/b;
		
		System.out.println("10 + 5 = " + tester.operate(10,5,addition));
		System.out.println("10 - 5 = " + tester.operate(10,5,subtraction));
		System.out.println("10 �� 5 = " + tester.operate(10,5,multiplication));
		System.out.println("10 / 5 = " + tester.operate(10,5,division));
		
		//��������
		GreetingService greetService1 = message ->
		System.out.println("Hello " + message);
		
		//������
		GreetingService greetService2 = (message) ->
		System.out.println("Hello " + message);
		
		greetService1.sayMessage("Runoob");
		greetService1.sayMessage("Google");
	}
	interface MathOperation{
		int operation(int a,int b);
	}
	
	interface GreetingService{
		void sayMessage(String message);
	}
	
	private int operate(int a,int b,MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
