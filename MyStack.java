package stackassignment;

public class MyStack {
	private char[] arr;
	private int top;
	private int size;
	public MyStack() {
		arr=new char[10];
		top=-1;
		size=5;
	}
	public MyStack(int n) {
		arr=new char[n];
		top=-1;
		size=n;
	}
	
	public boolean isFull() {
		if(top==size-1) {
			return true;
		}
		return false;
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}

	public boolean push(char n) {
		if(top==size-1) {  //if(isFull())
			System.out.println("Stack overflow");
			return false;
		}
		else {
			top++;
			arr[top]=n;
			return true;
		}
		
	}
	
	public char pop() {
		if(isEmpty()) { //if(top==-1)
			System.out.println("stack is Empty, underflow");
			return 'z';  //assume z is not there in the string
		}
		else {
			char n=arr[top];
			top--;
			return n;
		}
	}
	
	
	
	
}
