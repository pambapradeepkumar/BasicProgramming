package Binary;

public class Strings1 {

	//replace string with substring
	public static void main(String[] args) {
		String str="LIELIEILIEAMLIECOOL";
		String sub="LIE";
		String outPut = str.replaceAll(sub, " ");
		System.out.println(outPut.trim());
	}
}