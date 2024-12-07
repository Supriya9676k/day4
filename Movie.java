public class Movie{
	
	private String title;
	private String director;
    private int duration;
    
	public void setTitle(String title){
		this.title=title;
	}
	public void setDirector(String director){
		this.director=director;
	}
	public void setDuration(int duration){
		this.duration=duration;
	}
	
	public String getTitle(){
		return title;
	}
	public String getDirector(){
		return director;
	}
	public int setDuration(){
		return duration;
	}
	public String movieDetails(){
		return "title "+title+"director "+director+"duration "+duration;
	}
	
	}
