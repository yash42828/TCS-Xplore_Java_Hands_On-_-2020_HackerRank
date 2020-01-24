import java.util.*;
class Title{
	public static void main(String args[]) {
	Book[] bk = new Book[4];
	Scanner sc = new Scanner(System.in);
	for(int i = 0;i<4;i++)
    {
        int id = sc.nextInt();sc.nextLine();
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();sc.nextLine();
        bk[i] = new Book(id,title,author,price);
    }
    String search = sc.nextLine();

    Book[] res = searchTitle(bk,search);
    for(Book bk1:res) {
    	System.out.println(bk1.id);
    }
}    

	public static Book[] searchTitle(Book[] b, String s){
		int l = 0;
		int k = 0;
		for(Book b1:b) {
			if(b1.title.toLowerCase().contains(s.toLowerCase())) {
				l++;
			}
		}
		Book[] result = new Book[l];
		for(Book b1:b) {
			if(b1.title.toLowerCase().contains(s.toLowerCase())) {
				result[k] = b1;
				k++;
			}
		}
		return result;
	}
}

class Book{
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
}