
public class nested_ifelse {

	public static void main(String[] args) {
      int num1=20,num2=10,num3=45;
      if(num1>num2)
      {
    	  if(num1>num3)
    	  {
    	  System.out.print("maximum number: "+num1);
      }
      else
      {
    	  System.out.print("maximum number: "+num3);
      }
	}
      else
      {
          if(num2>num3)
          {
        	  System.out.print("maximum number: "+num2);

          }
          else
          {
        	  System.out.print("maximum number: "+num1);

          }
      }
	}
}
