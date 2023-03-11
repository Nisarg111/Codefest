
package file;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Algo1
{

    public static void main(String[] args) throws IOException {
       // TODO code application logic here
        File f = new File("C:\\Users\\Ni$arg\\Downloads\\TWSP_small.txt");
        try
        {
            Scanner scan = new Scanner(f);
            int size = scan.nextInt();
            int a[][] = new int[size][3];
            int k = 0;
            if(size <= 100)
            {
                for(int i = 0; i < size; i++)
                {
                    int A,B,C;
                    A = scan.nextInt();
                    B = scan.nextInt();
                    C = scan.nextInt();
                    
                    if((A > 15 || A < 1) || (B > 23 || B < 1) || (C > 10 || C < -1))
                    {
                        continue;
                    }
                    else
                    {
                        a[k][0] = A;
                        a[k][1] = B;
                        a[k][2] = C;
                        k++;
                    }
                }
            }
            
            if(size > 100)
            {
                for(int i = 0; i < size; i++)
                {
                    int A,B,C;
                    A = scan.nextInt();
                    B = scan.nextInt();
                    C = scan.nextInt();
                    
                    if((A > 100 || A < 1) || (B > 120 || B < 1) || (C > 75 || C < -1))
                    {
                        continue;
                    }
                    else
                    {
                        a[k][0] = A;
                        a[k][1] = B;
                        a[k][2] = C;
                        k++;
                    }
                }
            }
            
            for(int i = 0; i < k; i++)
		{
		    for(int j = i+1; j < k; j++)
		    {
		        if (a[i][0] == a[j][0])
		        {
		            if(a[i][1] < a[j][1])
		            {
		                 int x,y,z;
		            x = a[i][0];
		            y = a[i][1];
		            z = a[i][2];
		            a[i][0] = a[j][0];
		            a[i][1] = a[j][1];
		            a[i][2] = a[j][2];
		            a[j][0] = x;
		            a[j][1] = y;
		            a[j][2] = z;
		            }
		        }
		        else if(a[i][0] > a[j][0])
		        {
		            int x,y,z;
		            x = a[i][0];
		            y = a[i][1];
		            z = a[i][2];
		            a[i][0] = a[j][0];
		            a[i][1] = a[j][1];
		            a[i][2] = a[j][2];
		            a[j][0] = x;
		            a[j][1] = y;
		            a[j][2] = z;
		        }
		    }
		}
            
            FileWriter output = new FileWriter("output.txt");

            for(int i = 0; i < k; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    output.append(a[i][j]+" ");
                }
                output.write("\n");
            }
            output.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    
    }
}
