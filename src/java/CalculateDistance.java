
public class CalculateDistance
{
  static int Radius_Earth=6371; //Radius of Earth=6371 KM
  static double Start_Latitude=Math.toRadians(28.521134);//latitude of my location
  static double Start_Longitude=Math.toRadians(77.206567);//longitude of my location

  //Function that calculates the distance of friends from GyanDhan office by taking friends latitude and longitude
  //Uses formula of Great Circle Distance.
  //Returns Distance of Friend in KM.
  public static double calculateDistance(String End_Lati,String End_Longi)
  {
    double End_Latitude=Math.toRadians(Double.parseDouble(End_Lati));//Latitude of friend in radians
    double End_Longitude=Math.toRadians(Double.parseDouble(End_Longi));//Longitude of friend in radians

    double longiDiff=Math.abs(End_Longitude-Start_Longitude);
    double central_angle=Math.acos( (Math.sin(Start_Latitude)*Math.sin(End_Latitude)) + (Math.cos(Start_Latitude)*Math.cos(End_Latitude)*Math.cos(longiDiff)) );

    return(central_angle*Radius_Earth) ;

  }
}
