public class StorageCapacity{
	
	private String brand;
	private String model;
    private int storageCapacity;
    
	public void setBrand(String brand){
		this.brand=brand;
	}
	public void setModel(String model){
		this.model=model;
	}
	public void setStorageCapacity(int storageCapacity){
		this.storageCapacity=storageCapacity;
	}
	
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public int getStorageCapacity(){
		return storageCapacity;
	}
	public int increaseStorage(int capacity){
		return storageCapacity+capacity;
	}
	
	}
