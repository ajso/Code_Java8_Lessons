package sample.code.lessons.Lambdas;

public class Books {

    private int id;
    private String book_name;
    private int price;

    public Books() {
    }

    public Books(int id, String book_name, int price) {
        this.id = id;
        this.book_name = book_name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((book_name == null) ? 0 : book_name.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Books other = (Books) obj;
        if (id != other.id)
            return false;
        if (book_name == null) {
            if (other.book_name != null)
                return false;
        } else if (!book_name.equals(other.book_name))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Books [id=" + id + ", name=" + book_name + ", price=" + price + "]";
    }
}
