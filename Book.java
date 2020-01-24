import java.util.*;
class Book{
	public static void main(String args[]){
		List<Solution> sol=new ArrayList<Solution>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int id = sc.nextInt();
            String title = sc.next();
            String author = sc.next();
            double price = sc.nextDouble();
			sol.add(new Solution(id,title,author,price));
        }
        List<Solution> result = sortBooksByPrice(sol);
		
		for(Solution d:result){
            if(d.title!=null){
                System.out.print(d.id);
                System.out.print(" "+d.title);
                System.out.print(" "+d.author);
                System.out.print(" "+d.price);
                System.out.print("\n");
            }
        }
    }
    public static List<Solution> sortBooksByPrice(List<Solution> s){

	    /*List<Solution> res=new ArrayList<Solution>();
        for(Solution docx:s){
            if(docx.pages%2 != 0){
             
            }
        }*/
		Collections.sort(s,Collections.reverseOrder());
        return s;
        
    
    }
}
class Solution implements Comparable<Solution>
{
	int id;
	String title;
	String author;
	double price;
	Solution(int id,String title,String author,double price){
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Double getPrice(){return price;}
	@Override
	public int compareTo(Solution soln){
		return this.getPrice().compareTo(soln.getPrice());
	}
}