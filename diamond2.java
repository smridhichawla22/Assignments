class Diamond2 
{ 
    public static void main(String[] args) {
        int n, i, k, space=1;
        n = 5;
        space= n-1;//n-1 no. of spaces in first pyramid 
        for (k=1; k<=n; k++)//loop for first pyramid
        {
            for (i=1; i<=space; i++)// loop for spaces
			{
                System.out.print(" ");
			}	
            space--;
            for (i=1; i<=(2*k)-1; i++)//loop for stars
			{
                System.out.print("*");
			}
            System.out.println();
        }
        space = 1;//no. of spaces in second pyramid(reverse) 
        for (k=1; k<=n-1; k++)//loop for second pyramid(reverse)
        {
            for (i=1; i<=space; i++)// loop for spaces
			{
                System.out.print(" ");
            }
			space++;
            for (i=1; i<=(2*(n-k))-1; i++)//loop for stars
            {
				System.out.print("*");
			}
            System.out.println();
        }
    }
}
 
 