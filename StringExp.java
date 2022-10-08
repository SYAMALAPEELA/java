package datatypes;

public class StringExp {
  public static void main(String args[]) {
  String value="java p";
  String value1="PYthon";
  String name=new String("c++");
  int len=value1.length();
  //string printing
  System.out.println(value);
  System.out.println(value1);
  System.out.println(name);
  //length
  System.out.println("length"+len);
  //concat
  System.out.println("concate"+value+value1+name);
  System.out.println("concate"+value.concat(value1).concat(name));
  //compare
  System.out.println("compare method1"+value.compareTo(name));
  System.out.println("compare method2"+value.equals(name));
  if(value == value1)
  {
	  System.out.println("equal");
  }
  else
  {
	  System.out.println("not equal");
  }
  //upper case lower case
  System.out.println(value.toUpperCase());
  System.out.println(value1.toLowerCase());
}
}