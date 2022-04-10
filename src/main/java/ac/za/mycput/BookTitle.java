package ac.za.mycput;

/*

   BookRate.java
   Entity for the BookTitle
   Author: Sinoxolo Jaca 213172607

 */

public class BookTitle {

    //Attributes
    private int id;
    private int numberOfPage;
    private String name;


    //Constructor
    private BookTitle(Builder builder)
    {
        this.id = builder.id;
        this.numberOfPage = builder.numberOfPage;
        this.name = builder.name;

    }

    //Builder class
    public static class Builder
    {

        //Attributes
        private int id;
        private int numberOfPage;
        private String name;


        //Initialize the builder
        public Builder setBookTitleId(int id)
        {
            this.id = id;
            return this;
        }

        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder setNumberOfPage(int numberOfPage)
        {
            this.numberOfPage = numberOfPage;
            return this;
        }


        //Return a BookTitle instance with the attributes from the builder
        public BookTitle build()
        {
            return new BookTitle(this);
        }

        //Clone/Copy method
        public Builder copy(BookTitle bookTitle)
        {
            this.id = bookTitle.id;
            this.name = bookTitle.name;
            this.numberOfPage = bookTitle.numberOfPage;

            return this;
        }
    }

    public int getBookTitleId() {
        return id;
    }

    //toString method
    @Override
    public String toString() {
        return "BookTitle{" +
                "id=" + id +
                ", numberOfPage=" + numberOfPage +
                ", name=" + name +
                '}';
    }
}