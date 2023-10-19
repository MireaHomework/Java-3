package pw2.task1;

public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Vladislav", "vlad@mail.ru", 'm');
        System.out.println(author);
        author.setEmail("vladislav@mail.ru");
        System.out.println(author);
    }
}
