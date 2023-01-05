public class Main {


        public static void main(String[] args) {

                Author author1 = new Author("Лев", "Толстой");
                Book book1 = new Book("Война и Мир", 1862,author1);


                System.out.println(book1.getpublishyear());
                book1.setpublishyear(1863);
                System.out.println(book1.getpublishyear());

        }
}

