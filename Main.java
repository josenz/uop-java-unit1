    public class Main {
	
	public static void main(String[] args) {

    	    MountainBike myBike = new MountainBike(1, 2, 3, 4);
	    myBike.setHeight(22);
	    int myHeight = myBike.getHeight();
 	    System.out.println("The height is " + myHeight);
	    myBike.printMessage();
    	    
        }	 
    }
