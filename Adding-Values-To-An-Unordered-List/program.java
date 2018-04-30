import java.util.Scanner;

public class program
	{
		
		public static void main(String[] args)
			{
				
				int[] nums = {};
				
				Scanner sc = new Scanner(System.in);
				
				int input = 0;
				
				for (int x = 0; x < 5; x++)
					{
						
						System.out.println("What Number Should We Add?");
						
						input = sc.nextInt();
						
						int[] moreNums = new int[nums.length + 1];
						
						for (int i = 0; i < nums.length; i++)
							{
								
								moreNums[i] = nums[i];
								
							}
							
						moreNums[moreNums.length - 1] = input;
						
						nums = moreNums;
						
						for (int i = 0; i < nums.length; i++)
							{
								System.out.print(nums[i] + " ");
								
							}
							
					}
					
			}
			
	}
