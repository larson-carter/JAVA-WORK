
public class program {

	public static void main(String[] args) {

		int x = 100;
		int y = 10;
		
		WhizBang whoa = new WhizBang(x, y);
		whoa.zip(whoa.fizzle(6));
		System.out.println(x);
		
	}
	

}
	class WhizBang {



		int whiz;
		int bang;

		public WhizBang(int x, int y) {

			bang = x;

			whiz = 2 * y;

		}

		public void zip(int x) {

			int t = bang;

			bang = whiz;

			whiz = t;


		}

		public int fizzle(int m) {

			if (m > 0)
				return whiz;
			else 
				return bang;

		}

	}
