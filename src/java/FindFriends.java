//Program that reads full list of friends 
//and outputs names and userId of matching friends(within 100 KM), sorted by user Id ascending.

import java.util.*;

public class FindFriends{
	
  static void findFriends(String filename)
  {
	//Parse JSON file and store data in array format
    ArrayList<ArrayList<String>> data= ReadJSON.readData(filename);
    
    //if the JSON File is not empty, 
    //find all friends within 100 KM range and sort the userID and name in ascending order
    //and print the userID and names of near friends
    if(!data.isEmpty())
    {

      ArrayList<ArrayList<String>> friendsInRange= GetFriendsInRange.getFriendsInRange(data);
      SortUserID.sortUserID(friendsInRange);

      for (int i=0 ; i < friendsInRange.get(0).size() ; i++) {
        System.out.println((i+1)+". Name :> "+friendsInRange.get(0).get(i)+" ,  User ID:> "+friendsInRange.get(1).get(i));
      }

    }
  }
  
  //Driver function to call findFriends() on friends.json file
  public static void main(String args[])
  {
      FindFriends.findFriends("../../friends.json");
  }

}
