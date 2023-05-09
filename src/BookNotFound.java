public class BookNotFound extends Exception {
    public BookNotFound(String message) {
        super(message);
    }

    public static void error() throws BookNotFound {
        try {
            throw new BookNotFound("Axtarsiniz uzre netice tapilmadi");
        } catch (BookNotFound e) {
            throw new RuntimeException(e);
        }
    }
}
