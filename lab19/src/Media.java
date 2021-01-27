public class Media
{
    private String id;
    private String title;
    private boolean borrowable;
    private String publisher;

    public Media(String id, String title)
    {
        this.id = id; this.title = title;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public boolean getBorrowable()
    {
        return borrowable;
    }

    public void setBorrowable(boolean borrowable)
    {
        this.borrowable = borrowable;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return String.format("%s " + "%s ", id, title);
    }
}
