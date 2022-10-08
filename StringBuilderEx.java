package datatypes;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuilder str=new StringBuilder("hai");
      System.out.println(str);
      //append
      str.append("java");
      System.out.println(str);
      //insert
      str.insert(3, "program");
      System.out.println(str);
      //replace
      str.replace(2,6,"string");
      System.out.println(str);
      //delete
      str.delete(1, 3);
      System.out.println(str);
      str.reverse();
      System.out.println(str);
	}

}
