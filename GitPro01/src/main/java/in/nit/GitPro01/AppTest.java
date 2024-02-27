package in.nit.GitPro01;

import in.nit.GitPro01.Service.AirthmeticOperation;

/**
 * Hello world!
 *
 */
public class AppTest
{
    public static void main( String[] args )
    {
    	AirthmeticOperation ar=new AirthmeticOperation();
    	System.out.println("Addition is :"+ar.Add(100, 200));
    	System.out.println("substration is :"+ar.Sub(100,200));
    	System.out.println("multiplication is :"+ar.Mul(100,50));
    	//System.out.println("Division is :"+ ar.Div(199,20));
        
    }
}
