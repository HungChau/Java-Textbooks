for (Book myBook : bookList)
	System.out.println (myBook);

Book myBook;
while (bookList.hasNext())
{
	myBook = bookList.next();
	System.out.println (myBook);
}