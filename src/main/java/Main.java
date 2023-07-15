import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Это программа для работы с книгами");

        System.out.println("Введите название книги");
        String bookTitle = sc.nextLine();
        System.out.println("Введите автора книги");
        String authorOfBook = sc.nextLine();
        System.out.println("Введите год написания или публикации книги");
        int yearOfBook = sc.nextInt();

        Book book = new Book(bookTitle, authorOfBook, yearOfBook);

        while (true) {

            System.out.println("Для добавления текста книги введите 1");
            System.out.println("Для увеличения рейтинга введите 2");
            System.out.println("Для уменьшения рейтинга введите 3");
            System.out.println("Для вывода информации о книге введите 4");
            System.out.println("Для завершения работы программы введите end");
            Scanner scanSc = new Scanner(System.in);

            String menu = scanSc.nextLine();

            if ("end".equals(menu)) {
                System.out.println("Программа завершена!");
                break;
            } else {

                switch (menu) {
                    case "1":
                        System.out.println("Введите текст для добавления в книгу");
                        book.append(scanSc.nextLine());

                    case "2":
                        book.up();
                        System.out.println("Новый рейтинг: " + book.rating);

                    case "3":
                        book.down();
                        System.out.println("Новый рейтинг: " + book.rating);

                    case "4":
                        System.out.println(book);
                }
            }
        }
    }

}