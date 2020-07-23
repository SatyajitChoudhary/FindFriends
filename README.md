# FindFriends

### Java API that reads full list of friends and outputs names , userId of matching friends(within 100 KM), sorted by user Id ascending. That's all

### Inputs
- Reads friends locations from [friends.json](https://github.com/SatyajitChoudhary/FindFriends/blob/master/friends.json)
- Reads your location's [lattitude](https://github.com/SatyajitChoudhary/FindFriends/blob/master/src/java/CalculateDistance.java#L5) and [longitude](https://github.com/SatyajitChoudhary/FindFriends/blob/master/src/java/CalculateDistance.java#L6) .


### Setting up 
- git clone.
- Open this repository using a Java IDE(preferably ide).
- Download the .jar file at this [link](https://jar-download.com/artifacts/org.json)
- Locate and extract the json.jar file
- In eclipse - right click on your project and go to build path - add external jar - hit apply
- Run main function of src\java\FindFriends.java.

### Troubleshooting problems  
1. Make sure your Java path is set up in your machine.
1. Make sure that you have included json-simple-1.1.1.jar file in your project.
