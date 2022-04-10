package ac.za.mycput;

/*

   BookRate.java
   Entity for the BookRate
   Author: Sinoxolo Jaca 213172607

 */

public class BookRate {

    //Attributes
    private int id;
    private int rate;
    private String comment;


    //Constructor
    private BookRate(Builder builder)
    {
        this.id = builder.id;
        this.rate = builder.rate;
        this.comment = builder.comment;

    }

    //Builder class
    public static class Builder
    {

        //Attributes
        private int id;
        private int rate;
        private String comment;


        //Initialize the builder
        public Builder setBookRateId(int id)
        {
            this.id = id;
            return this;
        }

        public Builder setRate(int rate)
        {
            this.rate = rate;
            return this;
        }

        public Builder setComment(String comment)
        {
            this.comment = comment;
            return this;
        }


        //Return a BookRate instance with the attributes from the builder
        public BookRate build()
        {
            return new BookRate(this);
        }

        //Clone/Copy method
        public Builder copy(BookRate bookRate)
        {
            this.id = bookRate.id;
            this.rate = bookRate.rate;
            this.comment = bookRate.comment;

            return this;
        }
    }

    public int getBookRateId() {
        return id;
    }

    //toString method
    @Override
    public String toString() {
        return "BookRate{" +
                "id=" + id +
                ", rate=" + rate +
                ", comment=" + comment +
                '}';
    }
}
