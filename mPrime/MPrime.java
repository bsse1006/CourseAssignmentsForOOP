import java.math.BigInteger;
import javax.swing.JOptionPane;

public class MPrime
{
	public boolean prime (BigInteger temp)
	{
		
		if(temp.compareTo((BigInteger.ONE).add(BigInteger.ONE))==0) return true;
		if(temp.remainder((BigInteger.ONE).add(BigInteger.ONE))==BigInteger.ZERO) return false;
		BigInteger inc = new BigInteger (((((BigInteger.ONE).add(BigInteger.ONE)).add(BigInteger.ONE))).toString());
		for( ; temp.compareTo(inc.multiply(inc))!=-1 ; )
		{
			if((temp.remainder(inc)).compareTo(BigInteger.ZERO)==0) return false;
			
			inc=inc.add((BigInteger.ONE).add(BigInteger.ONE));
		}
		return true;
	} 

	public void operation ()
	{
		for(int p = 2; p <= 100; p++)
		{
			BigInteger mPrime = new BigInteger (((((BigInteger.ONE).add(BigInteger.ONE)).pow(p)).subtract(BigInteger.ONE)).toString());
			if(prime(mPrime)) 
			{
				//JOptionPane.showMessageDialog(null, mPrime);
				System.out.println(mPrime);
			}
		}
	}
}
