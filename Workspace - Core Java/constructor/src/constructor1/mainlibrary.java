package constructor1;
import java.util.Scanner;
class library
{
	String title;
	String auther;
	double price;
	int pages;
	String publication;
	
	library(String title, String auther, double price, int pages, String publication)
	{
		this.title = title;
		this.auther = auther;
		this.price = price;
		this.pages = pages;
		this.publication = publication;
	}

	void display()
	{
		System.out.println("\t"+title + "\t" +auther+ "\t" +price+ "\t" +pages+ "\t" +publication);
		
	}

	void getbook()
	{
		System.out.println();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	
}
public class mainlibrary 
{
	public static void main(String[] args) 
	{
		int ch=1;
		Scanner s1 = new Scanner(System.in);
		//System.out.println("enter the size of array");
		//int length = s1.nextInt();
		library[] b1 = new library[100];

		int count=0;
		double total=0;
		
		while(ch<5)
		{
			System.out.println(" 1. add book \n 2. display book \n 3.update \n 4.generate bill \n 5.exit");
			System.out.print("Enter choice = ");
			ch=s1.nextInt();
			switch(ch)
			{
				case 1:
						System.out.println("add books");

						System.out.println("enter book name = ");
						s1.nextLine();
						String bname = s1.next();

						System.out.println("enter auther = ");
						s1.nextLine();
						String aut =  s1.nextLine();

						System.out.println("enter book price = ");
						double bprice = s1.nextDouble();
						
						System.out.println("enter book pages = ");
						int bpages = s1.nextInt();

						System.out.println("enter book publication = ");
						s1.nextLine();
						String bpublication = s1.nextLine();

						b1[count] = new library(bname, aut, bprice, bpages, bpublication);
						count++;

						System.out.println();
						break;

				case 2:
						System.out.println("*==== display book ====*");
						if(count != 0)
						{
							for(int i=0; i<count; i++)
							{
								System.out.println((i+1)+"."+b1[i].title);		
							}
							System.out.println("if you want all books details enter a or A ");
							System.out.println("if you want particular book details y or Y ");
							char choice = s1.next().charAt(0);
							if(choice =='A'||choice == 'a')
							{
									System.out.println("no"+"\t"+"title"+"\t"+"auther"+"\t"+"price"+"\t"+"pages"+"\t"+"publication");
									System.out.println("------------------------------------------------");
									for(int i=0; i<count; i++)
									{
										System.out.print(i+1);
										b1[i].display();
										
									}
							}
							else
							{
								System.out.print("select book=");
								int c=s1.nextInt();
								
									for(int i=0;i<b1.length; i++)
									{
										if(c == i+1)
										{
											System.out.println("title"+"\t"+"auther"+"\t"+"price"+"\t"+"pages"+"\t"+"publication");
											System.out.println("------------------------------------------------");
											b1[i].display();
										}
										
									}
							}
						}
						else
						{
							System.out.println("book not available");
						}
						System.out.println();
						break;

						case 3:
							    int cho=1; 
								System.out.println("==== update ====");
								System.out.println("select book");
								int s = s1.nextInt();
								for(int i=0; i<b1.length; i++)
								{
									if(i+1==s)
									{
										while(cho<6)
										{
											System.out.println("\t 1.update title \n \t 2.update auther \n \t 3.update price \n \t 4.update pages \n \t 5.update publicatiion \n \t 6.exit");
											System.out.println("enter your choice = ");
											cho = s1.nextInt();

											switch(cho)
											{
											case 1:
												System.out.println("update book title = ");
												String t = s1.next();
												b1[i].setTitle(t);
												System.out.println("book updated...");
												break;
												
											case 2:
												System.out.println("update book auther = ");
												String a = s1.next();
												b1[i].setAuther(a);
												System.out.println("book updated...");
												break;
												
											case 3:
												System.out.println("update book price = ");
												double p = s1.nextDouble();
												b1[i].setPrice(p);
												System.out.println("book updated...");
												break;
												
											case 4:
												System.out.println("update book pages = ");
												int pa = s1.nextInt();
												b1[i].setPages(pa);
												System.out.println("book updated...");
												break;
												
											case 5:
												System.out.println("update book publication = ");
												String pu = s1.next();
												b1[i].setPublication(pu);
												System.out.println("book updated...");
												break;
											}
										}
									}
								
							}
						case 4:
							if(count != 0)
							{
								/*for(int i=0; i<count; i++)
								{
									System.out.println((i+1)+"."+b1[i].title);		
								}
								System.out.println("if you want all books details enter a or A ");
								System.out.println("if you want particular book details y or Y ");
								char choice = s1.next().charAt(0);
								if(choice =='A'||choice == 'a')
								{*/
										System.out.println("no"+"\t"+"title"+"\t"+"auther"+"\t"+"price"+"\t"+"pages"+"\t"+"publication");
										System.out.println("------------------------------------------------");
										for(int i=0; i<count; i++)
										{
											System.out.print(i+1);
											b1[i].display();
											
										}
								//}
							}

							
								System.out.println("==== generate bill ====");
								int sel=1;
								//double total=0;
								while(sel>0)
								{
									
									System.out.println("select books to add to the cart ..");
									sel = s1.nextInt();
									
									for(int i=0; i<count; i++)
									{
										if(sel-1==i)
										{
											//	total = b1[i].getPrice();
											total = total + b1[i].price;
										}
									}
								}
								System.out.println("total is ="+total);
								total=0;
								break;
			}
		}
	}
}
