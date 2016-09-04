import java.util.Scanner;

class Fraction {
	private int a;
	private int b;
	
	public Fraction(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public double toDouble() {
		return 1.0*a / b;
	}
	
    public Fraction plus(Fraction r) {
    	return new Fraction(this.a * r.b + r.a * this.b, this.b * r.b); 
    }
    
    public Fraction multiply(Fraction r) {
    	return new Fraction(this.a * r.a, this.b * r.b);
    }
    
    private int gcd(int a, int b){
    	if (a < b) {
    		int temp = a;
    		a = b;
    		b = temp;
    	}
    	while (a % b != 0) {
    		int temp = a % b;
    		a = b;
    		b = temp;
    	}
    	return b; 
    }
    
    public void print(){
    	if (this.a == this.b) {
    		System.out.println(1);
    	}
    	else {
    		int gcd = gcd(this.a, this.b);
    		this.a = this.a / gcd;
    		this.b = this.b / gcd;
    		System.out.println(this.a + "/" + this.b);
    	}
    }
}

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(), in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5, 6)).print();
		a.print();
		b.print();
		in.close();
	}

}