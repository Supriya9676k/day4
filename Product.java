public class Product{
	
	private String produtName;
	private int productCode;
    private int price;
    
    public void setProdutName(String produtName){
		this.produtName=produtName;
	}
	public void setProductCode(int productCode){
		this.productCode=productCode;
	}
	public void setSalary(int price){
		this.price=price;
	}
	
	public String setProdutName(){
		return produtName;
	}
	public int getProductCode(){
		return productCode;
	}
	public int getSalary(){
		return price;
	}
	public int applyDiscount(int percentage){
		return price-(price*(percentage/100));
	}
	}
