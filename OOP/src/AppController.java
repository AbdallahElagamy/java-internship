import models.Book;
import models.DVD;
import models.Magazine;
import models.Resource;
import service.ResourceService;
import service.ResourceServiceImpl;

public class AppController {
    public static void main(String[] args) {
        ResourceService service = new ResourceServiceImpl();


        service.add(new Book("The first book", "The auth", 1960));
        service.add(new DVD("The first DVD", "The auth", 1969));
        service.add(new Magazine("The first mag", "The auth", 1978));


        Resource book = new Book("The book", "The auth", 1950);
        Resource mag = new Magazine("The mag", "The auth", 2002);

        service.add(book);

        service.update(book, mag);

        service.delete(new Book("The first book", "The auth", 1960));

        System.out.println(service.readAll());
    }
}