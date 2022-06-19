package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        Author authorCardNumber1 = new Author("Габриэль Гарсиа", "Маркес"); // автор1
        Author authorCardNumber2 = new Author("Кэти", "Сьерра"); // автор2
        Author authorCardNumberX = new Author("Кэти", "Сьерра"); // копия_карточки_автора2

        Book bookCardNumber1 = new Book("Сто лет одиночества", authorCardNumber1, 1967); // оригинал1
        Book bookCardNumber2 = new Book("Изучаем Java", authorCardNumber2, 2003); // оригинал2
        Book bookCardNumberX = new Book("Изучаем Java", authorCardNumberX, 2021); // копия2

        bookCardNumber2.setYearOfPublication(2021);

        System.out.println(authorCardNumber1); //автор1
        System.out.println(authorCardNumber2); //автор2
        System.out.println(authorCardNumberX); // копия_карточки_автора2

        System.out.println(bookCardNumber1); //оригинал1
        System.out.println(bookCardNumber2); //оригинал2
        System.out.println(bookCardNumberX); // копия2

        System.out.println(authorCardNumber1.hashCode()); //хеш автора1
        System.out.println(authorCardNumber2.hashCode()); //хеш автора2
        System.out.println(authorCardNumberX.hashCode()); //хеш копии_карточки_автора2

        System.out.println(authorCardNumber1.equals(authorCardNumber2)); //автор1 == автор2
        System.out.println(authorCardNumber1.equals(authorCardNumberX)); // автор1 == копия_карточки_автора2
        System.out.println(authorCardNumber2.equals(authorCardNumberX)); // автор2 == копия_карточки_автора2


        System.out.println(bookCardNumber1.hashCode()); //хеш оригинала1
        System.out.println(bookCardNumber2.hashCode()); //хеш оригинала2
        System.out.println(bookCardNumberX.hashCode()); //хеш копии2

        System.out.println(bookCardNumber1.equals(bookCardNumber2)); //оригинал1 == оригинал2
        System.out.println(bookCardNumber1.equals(bookCardNumberX)); //оригинал1 == копия2
        System.out.println(bookCardNumber2.equals(bookCardNumberX)); //оригинал2 == копия2

    }
}
