package vote;
class voteException extends Exception
{
	public voteException(String i)
	{
		super(i);
	}
}
class validate
{

	static void valid(int age) throws voteException
    {
	 if(age<18)
	 {
		throw new voteException("not eligible");
	 }
	 else
	 {
		 
		 System.out.println("valid for vote");
	 }
    }
}
public class vote {
	 
	public static void main(String[] args) throws voteException  {
		// TODO Auto-generated method stub
		validate v=new validate();
		v.valid(19);
		v.valid(13);
		
		
	}

	

}
