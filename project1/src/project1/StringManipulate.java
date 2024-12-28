package project1;

public class StringManipulate {

	public static void main(String[] args) {
		//concat
	String s1="hello";
	String s2="world";
	String s3=s1.concat(" ").concat(s2);
	System.out.println(s3);
	
	//replace
	
	String modified=s3.replace("world","sheik");
	//we can't replace in same variable so create new 
	System.out.println(modified);
	
	//replace all
	
	String modifyAllChar=modified.replaceAll("e","i");
	System.out.println(modifyAllChar);
	//splitting
	String sentence="java is fun";
	String s[]=sentence.split(" ");
	System.out.println(s[0]+s[1]+s[2]);
	//substring creation
	String subS=sentence.substring(0,4);//0 to 3 index
	System.out.println(subS);
	
	//changing case
	String change=sentence.toUpperCase();
	System.out.println(change);
	change=sentence.toLowerCase();
	System.out.println(change);
	//trim()
	String trim1=" sheik is good boy ";
	System.out.println(trim1.trim());//clear very 1st & last space
	
	//contains
	System.out.println(trim1.contains("sheik"));//return boolean
	//charAt
	
	System.out.println(trim1.charAt(1));//s
	//index
	
	//StringBuilder
	StringBuilder sb = new StringBuilder("Hello");
	sb.append(" World");
	sb.insert(5, ",");
	sb.replace(6, 11, "Java");//start,end,replace word
	sb.deleteCharAt(5);
	sb.reverse();
	String finalString = sb.toString();
	System.out.println(finalString);
	
	     String str = "Hello World";

	        // charAt
	        char ch = str.charAt(6);
	        System.out.println("charAt(6): " + ch); // Output: W

	        // indexOf
	        int index1 = str.indexOf('o');
	        System.out.println("indexOf('o'): " + index1); // Output: 4

	        int index2 = str.indexOf("World");
	        System.out.println("indexOf(\"World\"): " + index2); // Output: 6

	        int index3 = str.indexOf('e', 5);
	        System.out.println("indexOf('e', 5): " + index3); // Output: 7

	        // lastIndexOf
	        int lastIndex1 = str.lastIndexOf('o');
	        System.out.println("lastIndexOf('o'): " + lastIndex1); // Output: 7

	        int lastIndex2 = str.lastIndexOf("l");
	        System.out.println("lastIndexOf(\"l\"): " + lastIndex2); // Output: 9

	        // substring
	        String sub1 = str.substring(6);
	        System.out.println("substring(6): " + sub1); // Output: World

	        String sub2 = str.substring(0, 5);
	        System.out.println("substring(0, 5): " + sub2); // Output: Hello

	        // StringBuilder setCharAt
	        StringBuilder sb1 = new StringBuilder(str);
	        sb1.setCharAt(6, 'J');
	        System.out.println("StringBuilder setCharAt(6, 'J'): " + sb.toString()); // Output: Hello Jorld

	        // StringBuilder replace
	        sb1.replace(6, 11, "Java");
	        System.out.println("StringBuilder replace(6, 11, \"Java\"): " + sb.toString()); // Output: Hello Java

	        // StringBuilder insert
	        sb1.insert(5, ",");
	        System.out.println("StringBuilder insert(5, \",\"): " + sb.toString()); // Output: Hello, Java
	    }
	}

	
	
	