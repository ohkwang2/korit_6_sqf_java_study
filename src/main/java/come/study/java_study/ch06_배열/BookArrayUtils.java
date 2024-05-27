package come.study.java_study.ch06_배열;

public class BookArrayUtils {

    int findIndexByName(String[] books, String bookName) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(bookName)) {
                return i;
            }
        }
        return -1;
    }
}
