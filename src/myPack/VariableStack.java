package myPack;

public class VariableStack implements Stack {

	// initializing fixed size variable

	int size;

	// declaring default constructor with fixed size

	VariableStack() {

		size = 0;// size value 0

	}

	@Override
	public void push(int I) {

		// initializing temporary size variable

		int temporarySize = size + 1;

		// condition checks temporary size is greater than fixed size

		if (temporarySize > size) {

			size = temporarySize;// Assign size value to temporary size

			System.out.println("Size of the Variable Stack after push is " + size);
			// prints Size of the Variable Stack after push is value

		}
	}

	@Override
	public int pop() {

		size -= 1;// decreasing Size value

		return size;// returns Size value

	}

}
