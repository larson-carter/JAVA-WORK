
public class program {
	
	public program() {

		class Thing{
			
			public void main(String[] args) {
				
				Thing one = new Thing();
				one.boop(22);
				System.out.println(one.bleep());
				
				Thing two = new Thing();
				two.fizz(2);
				System.out.println(two.bleep());
				
				Thing three = new Thing();
				three.fizz(three.bleep());
				System.out.println(three.bleep());
				
				Thing fo = new Thing();
				Thing ur = new Thing();
				fo.fizz(22);
				ur.boop(22);
				System.out.println(ur.bleep());
				
			}
			
			int eye;
			
			double ex;
			
			
			public Thing() {
				
				
				eye = 2;
				
				ex = 3;
				
			}
			
			public void boop(int b) {
				
				eye = eye + b;
				
			}
			
			public double bleep() {
				
				return ex + eye;
				
			}
			
			public void fizz(double d) {
				
				ex = d;
				
			}
			
		}

	}

}
