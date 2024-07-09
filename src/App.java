public class App {
    public static void main(String[] args) {
            Author author = new Author("Ахмет","Алтан");
            Book book = new Book("Мадам Хаят", author,2023);

            Author author2 = new Author("Анна","Красильщик");
            Book book2 = new Book("Давай поедем в Уналашку", author2,2022);

            System.out.println(book.getYear());
            book.setYear(2025);
            System.out.println(book.getYear());

        System.out.println(book2);
        System.out.println(author);
    }
    }
