import java.util.*;

public class SortUserID
{
	//Function that sorts the list of friends in range 
	//based on user Id in ascending order using stable and inplace Bubble Sort algorithm
  static void sortUserID(ArrayList<ArrayList<String>> friendsInRange)
  {
	  
    ArrayList<String> nameInRange=friendsInRange.get(0);//list of names of near friends
    ArrayList<String> userIdInRange=friendsInRange.get(1);//list of user Id  of near users
    int listlength=nameInRange.size();

		for(int i=0;i<listlength;i++){
			for(int j=0;j<listlength-1;j++){
				
				//Check and swap user Id and names with adjacent elements to maintain ascending order 
				if( (Integer.parseInt(userIdInRange.get(j))) > (Integer.parseInt(userIdInRange.get(j+1))) ){
					
					String temp1=userIdInRange.get(j);
					userIdInRange.set(j,userIdInRange.get(j+1));
					userIdInRange.set(j+1,temp1);

					String temp2=nameInRange.get(j);
					nameInRange.set(j,nameInRange.get(j+1));
					nameInRange.set(j+1,temp2);
				}

			}
		}

  }
}
