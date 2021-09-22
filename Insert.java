package StringBuffer;

public class Insert {

	public static void main(String[] args) {
		 StringBuffer sb= new StringBuffer("I You");
		 
		 System.out.println("Before insert() :\n"+sb);
		 sb.insert(2, "Love"+" ");
		 
		 System.out.println("After insert() :\n"+sb);

	}

}
/*OUTPU
Before insert() :
I You
After insert() :
I Love You
*/
