package nccu.vipl.jeff.stackandqueue;

public class StackByArray extends Stack {

	@Override
	void push(int item) {
		if (top == (size-1)){
			System.out.println("Stack full");
		}
		else{
			top += 1;
			stack[top] = item;
		}
	}

	@Override
	int pop() throws Exception {
		if (top == -1) {
			System.out.println("Stack empty");
			throw new Exception();
		}
		else {
			int item = stack[top];
			top -= 1;
			return item;
		}
	}

}
