import java.util.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON
{
	//Function to parse through JSON file and store the respective fields in arrays
    public static ArrayList<ArrayList<String>> readData(String filename)
    {

    	//data is an array to store names,userId,latitude,longitude arrays
        ArrayList<ArrayList<String>> data=new ArrayList<ArrayList<String>>();
        ArrayList<String> name=new ArrayList<String>();//stores the names of friends
        ArrayList<String> userId=new ArrayList<String>();//stores the userId of friends
        ArrayList<String> latitude=new ArrayList<String>();//stores latitude of friends
        ArrayList<String> longitude=new ArrayList<String>();//stores longitude of friends


        try (FileReader reader = new FileReader("../../friends.json"))
        {
            //Read JSON file
        	JSONParser parser=new JSONParser();
            JSONArray friendsList = (JSONArray)(parser.parse(reader));

            for(Object obj:friendsList)
            {
                JSONObject friend=(JSONObject)obj;

                String na=(String)friend.get("name");
                //Converting number(userId) to string format
                String uId=Long.toString(((Long)friend.get("user_id")));
                String lati=(String)friend.get("latitude");
                String longi=(String)friend.get("longitude");
                
                //Add details of each friends into respective arrays
                name.add(na);
                userId.add(uId);
                latitude.add(lati);
                longitude.add(longi);
            }
            
            //Stores the arrays inside data array
            data.add(name);
            data.add(userId);
            data.add(latitude);
            data.add(longitude);

        }
        catch (FileNotFoundException e) {
        	System.out.println("FileNotFoundException");
        }
        catch (IOException e) {
            System.out.println("IOException");
        } 
        catch(NumberFormatException e){
        	System.out.println("The Input is wrong");
        }
     	catch(ParseException e){
     		System.out.println("ParseException");

     	}
        
        return(data);
    }

  }
