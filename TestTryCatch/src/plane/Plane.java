package plane;

public class Plane {
static String s = "-";

	public static void main(String[] args) {
		new Plane().s1();
		System.out.println(s);

	}
	public static void s1(){
		try{
			s2();
		}catch(Exception e){
			s+="c";
		}
		}
	
	public static void s2() throws Exception{
		s3();
		s+= "2";
		s3();
		s+="2b";
	}
	public static void s3() throws Exception{
		throw new Exception();
	}
	
	}
	


