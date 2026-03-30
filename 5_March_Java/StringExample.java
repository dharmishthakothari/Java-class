package oopConcept;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Shivansh Kapadiya priyanshu Dharishtha";
		String full_name[]=name.split(" ");
//		for(int i=0;i<full_name.length;i++)
//		{
//			System.out.println(full_name[i]);
//		}
		
		for(String str:full_name)
		{
			System.out.println(str);
		}
		String str="Tops Technologies ";
		System.out.println(str.charAt(0));
	}

}
