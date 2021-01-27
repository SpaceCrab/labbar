public class MainProgram
{
    public static void main(String[] args)
    {
        testMedia();
        testBook();
    }

    public static void testMedia()
    {
       /* Media media = new Media();
        media.setId("Music.101");
        media.setTitle("Those were the days, my friend");
        */
        System.out.println(media.toString());
    }

    public static void testBook()
    {
        /*Book book = new Book();
        book.setId("BookLng.100");
        book.setTitle("Programming in Java 12");
        */
        System.out.println(book.toString());

        /*book = new ChildrensBook();
        book.setId("BookChl.100");
        book.setTitle("Pippi longstocking");
        */
        System.out.println(book.toString());
    }
}
