package week2;

public class PrintStarTriangle {

	public static void main(String[] args)		{
		int num = 1;
        while(num < 11)
        {
            for(int i=1; i<=num; i++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
            num=num+2;
        }
    }

}
	