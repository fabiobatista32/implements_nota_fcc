
public class OpLogica {

	public static void main(String[] args) {
		boolean v1, v2, v3, v4;
		int h, x, y, z;
		h = 1;
		x = 3;
		y = 2;
		z = 0;
		v4 = false;
		v1 = !(x - 1 == y) || (z - x / y <= z + x - h) && !(!v4);
		
		boolean a1 = !(x - 1 == y),
				a2 = (z - x / y <= z + x - h),
				a3 = !(!v4);
		
		boolean result1 = a1 || a2 && a3;
		
		System.out.println("v1 por partes("+a1+" || "+a2+" && "+a3+"): " + result1);
		System.out.println("v1: "+v1);
		
		v2 = (z + y - h > x - y + h) || v4 && (x * 2 - y * 5 / h <= x * y / h + x) || !v4;
		
		boolean b1 = (z + y - h > x - y + h),
				b2 = v4,
				b3 = (x * 2 - y * 5 / h <= x * y / h + x),
				b4 = !v4;
		
		boolean result2 = b1 || b2 && b3 || b4;

		System.out.println("v2 por partes("+b1+" || "+b2+" && "+b3+" || " +b4+ "): " + result2);
		System.out.println("v2: "+ v2);
		
		
		v3 = (x * 3 + y / h + y != y * x / h + y) && !v4 || (z * y * 3 + h != z + y / h + 1);
		
		boolean c1 = (x * 3 + y / h + y != y * x / h + y),
				c2 = !v4,
				c3 = (z * y * 3 + h != z + y / h + 1);
		
		boolean result3 = c1 && c2 || c3;
		
		System.out.println("v3 por partes("+c1+" && "+c2+" || "+c3+"): " + result3);
		System.out.println("v3: "+v3);
	}
}
