public class House{
	
	private String address;
	private int numberOfRooms;
    private int area;
    
	public void setAddress(String address){
		this.address=address;
	}
	public void setNumberOfRooms(int numberOfRooms){
		this.numberOfRooms=numberOfRooms;
	}
	public void setArea(int area){
		this.area=area;
	}
	
	public String getAddress(){
		return address;
	}
	public int getNumberOfRooms(){
		return numberOfRooms;
	}
	public int getArea(){
		return area;
	}
	public int upgradeRam(int price){
		return area*price;
	}
	
	}
