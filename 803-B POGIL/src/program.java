public class program {
	public static void main(String[] args) {
		int n = 0;
		int d = drake(n);
		int drakefinal = d * 3;
		System.out.println("Drake: " + drakefinal);
		int t = tswift();
		int tswiftfinal = t * 3;
		System.out.println("TSWIFT: " + tswiftfinal);
		int l = ladygaga(n);
		int lfinal = l * 3;
		System.out.println("Lady Gaga: " + lfinal);
		int s = samhunt(n);
		int sfinal = s * 3;
		System.out.println("Sam Hunt: " + sfinal);
	}
	public static int drake(int n){
		return n + 1;
	}
	public static int tswift(){
		return 5;
	}
	
	public static int ladygaga(int n){
		return n + n;
	}
	
	public static int samhunt(int n) {
		return n = n + 7;
	}
}
