public class program {

	public static void main(String[] args) {
		int r = 8;
		int g = 6;
		int b = 7;
		int o = blue(b);
		System.out.println(o);
		System.out.println(r);
	}
	
	public static int red(int r){
		System.out.println(r);
		return r = r + 1;
	}
	
	public static int orange(int o){
		o = o + 1;
		System.out.println(o);
		return o;
	}
	
	public static int yellow(int y){
		System.out.println("Sun");
		return y + 1;
	}
	
	public static int green(int g){
		System.out.println("Envy");
		return yellow(g);
	}
	
	public static int blue(int b){
		System.out.println(b);
		return orange(b);
	}

}
