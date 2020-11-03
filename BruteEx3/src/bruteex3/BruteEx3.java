package bruteex3;
import java.io.*;

public class BruteEx3 {

	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		String[] sp;
		
		for(int i = 0; i<n; i++)
		{
			sp = br.readLine().split(" "); 			// ���ڿ� �и�
			arr[i][0] = Integer.parseInt(sp[0]);	// [i][0] : ������ 
			arr[i][1] = Integer.parseInt(sp[1]);	// [i][1] : Ű
		}
		
		for(int i = 0; i < n; i++) 
		{
			int rank = 1;
			
			for(int j = 0; j < n; j++) 
			{
				if(i == j) continue;
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) 
				{
					rank++;
				}
			}
 
			System.out.print(rank + " ");
		}
		
	}

}