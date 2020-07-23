import java.util.*;

public class GetFriendsInRange
{
	//Function that finds all friends which are in range of 100 KM from GyanDhan location
	//and stores names and userID of them into an array(friendsInRange) and returns the array.
  static ArrayList<ArrayList<String>> getFriendsInRange(ArrayList<ArrayList<String>> data)
  {
    ArrayList<ArrayList<String>> friendsInRange=new ArrayList<ArrayList<String>>();
    ArrayList<String> nameInRange=new ArrayList<String>();//stores names of near friends
    ArrayList<String> userIdInRange=new ArrayList<String>();//stores userId of near friends

    ArrayList<String> name=data.get(0);
    ArrayList<String> userId=data.get(1);
    ArrayList<String> latitude=data.get(2);
    ArrayList<String> longitude=data.get(3);

    for(int i=0;i< latitude.size();i++)
    {
    	//Calculate distance of friend from GyanDhan location
      double distance=CalculateDistance.calculateDistance(latitude.get(i),longitude.get(i));
      
      if(distance<=100.0)
      {
        nameInRange.add(name.get(i));
        userIdInRange.add(userId.get(i));
      }
    }

    friendsInRange.add(nameInRange);
    friendsInRange.add(userIdInRange);
    
    return(friendsInRange);
  }
}
