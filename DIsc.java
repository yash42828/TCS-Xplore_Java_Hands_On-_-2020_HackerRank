import java.util.*;

public class Disc {
    public static void main(String args[] ) throws Exception {
        /* Do not alter code in main method */
       Shirt[] shirts = new Shirt[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<5;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }
        
        
       
        double price = sc.nextDouble();
        
        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));            
        }
        
        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);
        //System.out.println(getShirtWithMoreThanSpecificPrice(shirts,price));
        for(Shirt s: result)
        {
			if(s.brand != null){
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
			}
        }
    }
	
    
    /* implement your methods here*/
	public static double getDiscountPrice(Shirt s){
					double temp = s.price;

		if(s.gender == 'm'){
			temp = temp - (temp*10)/100;
			//return s.price;
		}
		if(s.gender == 'f'){
			//double temp = s.price;
			temp = temp - (temp*20)/100;
			//return s.price;
		}
		if(s.gender == 'u'){
			//double temp = s.price;
			temp = temp - (temp*30)/100;
			//return s.price;
		}
		return temp;
	}
	public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts, double price){
		int l = 0;
		for(Shirt sh:shirts){
			if(sh.price>price){
				l++;
			}
		}
		Shirt[] sht = new Shirt[l];
		//List<Shirt> sht = new ArrayList<Shirt>();
		int k =0;
		for(Shirt sh:shirts){
			if(sh.price>price){
				sht[k] = sh;
				k++;
			}
		}
		return sht;
		
	}
}

class Shirt
{
    //define the class as per details shared in the question
	int tag;
	String brand;
	double price;
	char gender;
	Shirt(int tag, String brand, double price, char gender){
		this.tag = tag;
		this.brand = brand;
		this.price = price;
		this.gender = gender;
	}
	public int getTag(){return this.tag;}
	public String getBrand(){return this.brand;}
	public double getPrice(){return this.price;}
	
}