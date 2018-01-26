/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  Chris Gaber <-- you
 * @version 1/26/18 <-- today
 */

class StarPatterns 
{
    public static boolean isPrime(int n)
    {
        if (n == 2)        return true;
        else if (n % 2==0 || n < 2) return false;
        
        double limit = Math.sqrt(n);
        
        for (int i=3; i<=limit; i+=2)
        {
            if (n % i == 0) return false;
        }
        
        return true;
    }
    
    static public int nthPrime(int n) 
    {
        int i = 0;
        int count = 0;
        
        while (i < n) {
            count++;
            if (isPrime(count)) {
                i++;
            }
        }
        
        return count;
    }
        
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i == 0 || i == h-1 || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starXBox(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1 || i == 0 || i == h-1 || j == 0 || j == w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void twoStarBoxes(int h, int w)
    {

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if ((i < h/2 && j < w/2) || (i >= h/2 && j >= w/2)) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starTriangle(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i >= j) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void emptyTriangle(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i >= j && (j == 0 || j == i || i == h-1)) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starTriangleUR(int h)
    {
        int w = h;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i <= j) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void isoscelesStarTriangle(int h)
    {
        int w = h*2 - 1;
        int count = 0;
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (j >= (w / 2) - count && j <= (w / 2) + count){
                    System.out.print("*");
                }
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            count += 1;
            System.out.println();
        }   
    }
    
    public static void checkerBoard(int w, int h)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)){
                    System.out.print("*");
                }
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void biggerCheckerBoard(int w, int h, int size)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if ((i/size % 2 != 0 && j/size % 2 != 0) || (i/size % 2 == 0 && j/size % 2 == 0)){
                    System.out.print("*");
                }
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void upsideDownCheckeredTriangle(int h)
    {
        int w = h*2 - 1;
        int count = w/2;
        
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if ((j >= (w / 2) - count && j <= (w / 2) + count) && Math.abs(j-count) % 2 != 0){
                    System.out.print("*");
                }
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            count -= 1;
            System.out.println();
        }   
    }
    
    public static void primeStars(int h)
    {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < nthPrime(i+1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void fibbonacciStars(int h)
    {
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < fibonacci(i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public static void starFlag(int w, int h)
    {

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (j <= 16 && i < 7){
                    System.out.print("*");
                }
                else if ((j > 16 || i >= 6) && i % 2 == 0){
                    System.out.print("R");
                }
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
        
        starXBox(9);
        System.out.println();
        
        twoStarBoxes(8, 12);
        System.out.println();
        
        starTriangle(6);
        System.out.println();
        
        emptyTriangle(6);
        System.out.println();
        
        starTriangleUR(10);
        System.out.println();
        
        isoscelesStarTriangle(5);
        System.out.println();
        
        checkerBoard(8, 6);
        System.out.println();
        
        biggerCheckerBoard(30, 24, 3);
        System.out.println();
        
        upsideDownCheckeredTriangle(6);
        System.out.println();
        
        primeStars(7);
        System.out.println();
        
        fibbonacciStars(8);
        System.out.println();
        
        starFlag(37, 13);
        System.out.println();
    }
     
}
