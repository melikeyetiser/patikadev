public class Book implements Comparable<Book>{

    private String name;
    private int pageNumber;
    private String authorName;
    private int publicationYear;
    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.getName());
    }


    public Book(String name, String authorName, int pageNumber) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return   name + " by " + authorName +
                ", pages = " + pageNumber;
    }
}
