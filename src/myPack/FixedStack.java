package myPack;

public class FixedStack implements Stack {

	// initializing fixed size variable

	int size;

	// initializing temporary size variable

	int temporarySize = 0;

	// declaring default constructor with fixed size

	FixedStack() {

		size = 5;// size value 5

	}

	@Override
	public void push(int I) {

		temporarySize += 1;// increasing temporary size value

		// condition checks fixed size is greater than temporary size

		if (size < temporarySize) {

			System.out.println("Stack overflow");
			// prints Stack overflow

		} else {

			System.out.println("Size of the FixedStack after push is " + temporarySize);
			// prints Size of the FixedStack after push is value

		}

	}

	@Override
	public int pop() {

		temporarySize -= 1;// decreasing temporarySize value

		return temporarySize;// returns temporary Size value
	}

}
