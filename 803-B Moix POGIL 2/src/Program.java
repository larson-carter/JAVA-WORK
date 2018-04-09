public class Program {

	public static void main(String[] args) {
		int r = 8;
		int g = 6;
		int b = 7;
		int o = yellow(r);
		System.out.println(o);
		System.out.println(r);
	}
	
	public static void red(int r){
		System.out.println("Fire Truck");
		r = r + 1;
	}
	
	public static void orange(int o){
		o = o + 1;
		System.out.println("Grapefruit");
	}
	
	public static int yellow(int y){
		System.out.println("Sun");
		return y + 1;
	}
	
	public static int green(int g){
		System.out.println("Envy");
		return yellow(g);
	}
	
	public static void blue(int b){
		System.out.println("B.B. King");
		orange(b);
	}

}
