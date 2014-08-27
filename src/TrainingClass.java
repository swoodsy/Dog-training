
public class TrainingClass {

	// Instance variables
	private String name;
	private String location;
	private long price;
	
	private static String company = "Sheilas Training";

	public TrainingClass(String name, String location, long price) {
		this.name = name;
		this.location = location;
		this.price = price;
		
		System.out.println("Welcome to " + this.company + ", The course is called " + this.name + " at " + this.location + " and costs " + this.price);
 	}


	public TrainingClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		System.out.println("The location has changed from " + this.location + " to " + location);
		this.location = location;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	public void getCourseDetails() {
		System.out.println("Course name is " + this.getName());
		System.out.println("Course location is " + this.getLocation());
		System.out.println("Course price is " + this.getPrice());
	}
	
}

	
	

