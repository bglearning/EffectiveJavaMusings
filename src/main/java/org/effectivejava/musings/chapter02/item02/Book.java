package org.effectivejava.musings.chapter01.item02;

public class Book {

    private final String title;
    private final String author;
    private final String year;
    private final int price;
    private final String publisher;

    public static class Builder {

        private final String title;
        private final String author;

        private String year = null;
        private int price = 0;
        private String publisher = null;

        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public Builder year(String year) {
            this.year = year;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }

    private Book(Builder builder) {
        title = builder.title;
        author = builder.author;
        year = builder.year;
        price = builder.price;
        publisher = builder.publisher;
    }

    public static void main(String[] args) {
        Book book = new Book.Builder("Pride and Prejudice", "Jane Austen")
            .year("1813").price(600).publisher("Rupa Books").build();
    }

}
