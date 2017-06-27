import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Address_book {
	
	// name, address, city, state and Zip 
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String email;
	private String phone_num;
	
	public Address_book()
	{
		
	}
	
	public Address_book(String n,String a,String c,String s,String z)
	{
		this.name=n;
		this.address=a;
		this.city=c;
		this.state=s;
		this.zip = z;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(isEmailValid(email))
		{
			this.email = email;
		}
		else
		{
			this.email = "Invalid Email";
		}
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		
		if(isPhoneNumberValid(phone_num))
		{
			this.phone_num = phone_num;
		}
		else
		{
			this.phone_num = "Invalid Phone Number";
		}
	}
	
	private boolean isEmailValid(String email){  
        boolean isValid = false;  

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";  
        CharSequence inputStr = email;  
        //Make the comparison case-insensitive.  
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    } 
    
    private boolean isPhoneNumberValid(String phoneNumber){  
        boolean isValid = false;  
        //System.out.println(phoneNumber);
        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";  
        CharSequence inputStr = phoneNumber;  
        Pattern pattern = Pattern.compile(expression);  
        Matcher matcher = pattern.matcher(inputStr);  
        if(matcher.matches()){  
            isValid = true;  
        }  
        return isValid;  
    }  
	
	public void display(Address_book ab)
	{
		System.out.println(ab.getName());
		System.out.println(ab.getAddress());
		System.out.println(ab.getCity()+ " " + ab.getState()+" "+ ab.getZip());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phone,email;
		Scanner sc = new Scanner(System.in);
		Address_book ab1 = new Address_book();
		Address_book ab2 = new Address_book("Bart Simspon","123 Evergreen St","Springfield","KY","22030");
		ab2.display(ab2);
		System.out.println("Enter your Phone number : ");
		phone = sc.nextLine();
		ab2.setPhone_num(phone);
		System.out.println(ab2.getPhone_num());
		System.out.println("Enter your Email : ");
		email = sc.next();
		ab2.setEmail(email);
		System.out.println(ab2.getEmail());
		
	}


}
