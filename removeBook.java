public boolean removeBookByTitle(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            books.remove(book);
            System.out.println("Libro eliminado: " + book);
            return true;
        }
    }
    System.out.println("Libro no encontrado: " + title);
    return false;
}
