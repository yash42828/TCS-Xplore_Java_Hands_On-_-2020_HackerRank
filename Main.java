import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		List<Document> doc=new ArrayList<Document>();
        Scanner sc = new Scanner(System.in);
        //Document[] docs = new Document[4];
        //Document[] res = new Document[4];        
        //Document[] fin = new Document[4];        

        /*for(int i=0;i<4;i++){
            docs[i] = new Document();
            res[i] = new Document();
            fin[i] = new Document();
        }*/
        for(int i=0;i<4;i++){
            int id = sc.nextInt();
            String title = sc.next();
            String folderName = sc.next();
            int pages = sc.nextInt();
			doc.add(new Document(id,title,folderName,pages));
        }
        List<Document> result = docsWithOddpages(doc);
        /*for(int i=0;i<res.length;i++){
            for(int j=i;j<res.length;j++){
            if(res[i].id>res[j].id){
                fin[k].id = res[j].id;
                fin[k].title = res[j].title;
                fin[k].folderName = res[j].folderName;
                fin[k].pages = res[j].pages;

            }
			}
			System.out.print(res[i].id);
            System.out.print(" "+res[i].title);
            System.out.print(" "+res[i].folderName);
            System.out.print(" "+res[i].pages);
            System.out.print("\n");
        }
        for(int i=0;i<re.length;i++){
            if(re[i].title!= null){
            System.out.print(re[i].id);
            System.out.print(" "+re[i].title);
            System.out.print(" "+re[i].folderName);
            System.out.print(" "+re[i].pages);
            System.out.print("\n");
            }
        }*/
        for(Document d:result){
            if(d.title!=null){
                System.out.print(d.id);
                System.out.print(" "+d.title);
                System.out.print(" "+d.folderName);
                System.out.print(" "+d.pages);
                System.out.print("\n");
            }
        }
    }
    public static List<Document> docsWithOddpages(List<Document> docs){
        //Document[] oddpages = new Document[4];
        //for(int i=0;i<4;i++){
          //  oddpages[i] = new Document();
        //}
        //int k = 0;
	    List<Document> res=new ArrayList<Document>();
        for(Document docx:docs){
            if(docx.pages%2 != 0){
                //oddpages[k] = docs[i];
                //System.out.println("Oddpages");
				res.add(docx);
                //k++;
            }
        }
		Collections.sort(res);
        return res;
        
    
    }
}

class Document implements Comparable<Document>
{
    int id;
    String title;
    String folderName;
    int pages;
    Document(int id, String title, String folderName, int pages){
        this.id = id;
        this.title = title;
        this.folderName = folderName;
        this.pages = pages;
    }
    Document(){}
	public Integer getId(){return id;}
    @Override
    public int compareTo(Document o){
        return this.getId().compareTo(o.getId());
    }
    
}