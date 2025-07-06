
package datatypes;

public class datatype {

	public static void main(String[] args) {
		byte a = 127; // -128 to +127
        short b = 325; // -32768 to +32767
        int c = 34678; // -2,147,482,648 to +2,147,482,647
        long d = 2147482648 ; // -9,223,372,036,854,775,808 to +9,223,372,036,854,775,808
        float e = 7.123456f; // 6 to 7 decimals
        double f = 8.56479359d; // 15 to 16 decimals
        char g = 'P'; 
        Boolean h = true;
        Boolean i = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(Long.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Integer.SIZE);
        
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);
		// TODO Auto-generated method stub

	}

}
