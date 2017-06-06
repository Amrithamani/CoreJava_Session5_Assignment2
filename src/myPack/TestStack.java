package myPack;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FixedStack stack1 = new FixedStack();
		// creating instance object for FixedStack sub class

		VariableStack stack2 = new VariableStack();
		// creating instance object for VariableStack sub class

		stack1.push(3);
		// calling push method in FixedStack

		stack1.push(5);
		// calling push method in FixedStack

		stack1.push(10);
		// calling push method in FixedStack

		System.out.println("Size of the Fixed stack after pop is " + stack1.pop());
		// prints Size of the Fixed stack after pop is 2

		stack1.push(15);
		// calling push method in FixedStack

		stack1.push(25);
		// calling push method in FixedStack

		stack1.push(35);
		// calling push method in FixedStack

		stack1.push(65);
		// calling push method in FixedStack

		stack2.push(12);
		// calling push method in VariableStack

		stack2.push(24);
		// calling push method in VariableStack

		System.out.println("Size of the variable stack after pop is " + stack2.pop());
		// prints Size of the variable stack after pop is 1

	}

}
