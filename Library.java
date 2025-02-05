import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Funcionalidad para agregar un libro
    public boolean addBook(Book book) {
        // Validar que el libro no sea nulo
        if (book == null) {
            System.out.println("Error: El libro no puede ser nulo.");
            return false;
        }

        // Validar que el libro no exista ya en la biblioteca (por título, ISBN, etc.)
        if (findBookByTitle(book.getTitle()) != null) {
            System.out.println("Error: El libro con el título \"" + book.getTitle() + "\" ya existe en la biblioteca.");
            return false;
        }

        // Agregar el libro a la lista
        books.add(book);
        System.out.println("Libro agregado exitosamente: " + book);
        return true;
    }

    // Funcionalidad para listar todos los libros
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        System.out.println("Lista de libros:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Funcionalidad para buscar un libro por título
    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
