  package Simplilearn.com;

  public class UpdateFile
	{
	    public static void main(String args[]) 
	    {
	int[] array = new int[5];
	        try 
	        {
	array[7] = 3;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	System.out.println("Array index is out of bounds!"); 
	        }
	        finally 
	        {
	System.out.println("The array is of size " + array.length);
	        }
	    }
	}
