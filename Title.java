import java.util.*;
class Title{
	public static void main(String args[]) {
	//Book[] bk = new Book[4];
	List<Book> bk = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	for(int i = 0;i<4;i++)
    {
        int id = sc.nextInt();sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();sc.nextLine();
        bk.add(new Book(id,title,author,price));
    }
    String search = sc.nextLine();

//    Book[] res = searchTitle(bk,search);
	List<Book> res = searchTitle(bk,search);

    for(Book bk1:res) {
    	System.out.println(bk1.id);
    }
}    

	public static List<Book> searchTitle(List<Book> b, String s){
		int l = 0;
		int k = 0;
		for(Book b1:b) {
			if(b1.title.toLowerCase().contains(s.toLowerCase())) {
				l++;
			}
		}
		//Book[] result = new Book[l];
			List<Book> result = new ArrayList<Book>();

		for(Book b1:b) {
			if(b1.title.toLowerCase().contains(s.toLowerCase())) {
				//result[k] = b1;
				result.add(b1);
				k++;
			}
		}
		Collections.sort(result);
		return result;
	}
}

class Book implements Comparable<Book>{
	int id;
	String title;
	String author;
	double price;
	
	Book(int id,String title,String author,double price){
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Integer getPrices(){return id;}
    @Override
    public int compareTo(Book s){
        return this.getPrices().compareTo(s.getPrices());
	}
}