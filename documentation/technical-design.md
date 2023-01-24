 

## Controllers 

 

This controller is responsible for manipulating Author entity.

``` 

@@Controller
public class AuthorController {


    @RequestMapping("/authors")
	public String findAllAuthors(Model model) {}
 

    @RequestMapping("/author/{id}")
	public String findAuthorById(@PathVariable("id") Long id, Model model) {}

 
   @GetMapping("/addAuthor")
	public String showCreateForm(Author author) {}
 

    @RequestMapping("/add-author")
	public String createAuthor(Author author, BindingResult result, Model model) {}
  
 
   @GetMapping("/updateAuthor/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {}
 
}  

``` 

This controller is responsible for manipulating Book entity.

``` 

@Controller
public class BookController {

  

    @RequestMapping("/books")
	public String findAllBooks(Model model) {}


    @RequestMapping("/searchBook")
	public String searchBook(@Param("keyword") String keyword, Model model) {}
	
	@RequestMapping("/book/{id}")
	public String findBookById(@PathVariable("id") Long id, Model model) {}
	
	@GetMapping("/add")
	public String showCreateForm(Book book, Model model) {}
	
	@RequestMapping("/add-book")
	public String createBook(Book book, BindingResult result, Model model) {}
	
	@GetMapping("/update/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {}
	
	@RequestMapping("/update-book/{id}")
	public String updateBook(@PathVariable("id") Long id, Book book, BindingResult result, Model model) {}
	
	@RequestMapping("/remove-book/{id}")
	public String deleteBook(@PathVariable("id") Long id, Model model) {}

}  

``` 

This controller is responsible for manipulating Category entity.

``` 

@Controller
public class CategoryController {

 

public class UsersController { 
 
   @RequestMapping("/categories")
	public String findAllCategories(Model model) {}
 
   @RequestMapping("/category/{id}")
	public String findCategoryById(@PathVariable("id") Long id, Model model) {}
 
    @GetMapping("/addCategory")
	public String showCreateForm(Category category) {}
 
    @RequestMapping("/add-category")
	public String createCategory(Category category, BindingResult result, Model model) {}
 
    @GetMapping("/updateCategory/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {}
 
    @RequestMapping("/update-category/{id}")
	public String updateCategory(@PathVariable("id") Long id, Category category, BindingResult result, Model model) {}
	
	@RequestMapping("/remove-category/{id}")
	public String deleteCategory(@PathVariable("id") Long id, Model model) {}
} 
 
``` 

This controller is responsible for the Home Page of the application.

``` 
@Controller
public class IndexController {

	@GetMapping("/")
	public String list() {
		return "index";
	}
} 

``` 

This controller is responsible for the login page.

``` 
@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}

``` 
This controller is responsible for manipulating Publisher entity.


``` 
@Controller
public class PublisherController {

    @RequestMapping("/publishers")
	public String findAllPublishers(Model model) {}
	
	@RequestMapping("/publisher/{id}")
	public String findPublisherById(@PathVariable("id") Long id, Model model) {}
	
	@GetMapping("/addPublisher")
	public String showCreateForm(Publisher publisher) {}
	
	@RequestMapping("/add-publisher")
	public String createPublisher(Publisher publisher, BindingResult result, Model model) {}
	
	@GetMapping("/updatePublisher/{id}")
	public String showUpdateForm(@PathVariable("id") Long id, Model model) {}
	
	@RequestMapping("/update-publisher/{id}")
	public String updatePublisher(@PathVariable("id") Long id, Publisher publisher, BindingResult result, Model model) {}
	
	@RequestMapping("/remove-publisher/{id}")
	public String deletePublisher(@PathVariable("id") Long id, Model model) {}
}

```
This controller is responsible for registration of the user.

``` 
@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    @GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {}

}
``` 
## Services 

 
 
This interface is responsible for saving registered user in database

``` 
@Service
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}

``` 

 
This interface is responsible for CRUD operations with Author entity

``` 
@Service
public interface AuthorService {

	public List<Author> findAllAuthors();

	public Author findAuthorById(Long id);

	public void createAuthor(Author author);

	public void updateAuthor(Author author);

	public void deleteAuthor(Long id);

}  

``` 


This interface is responsible for CRUD operations with Book entity

``` 
@Service
public interface BookService {

	public List<Book> findAllBooks();
	
	public List<Book> searchBooks(String keyword);

	public Book findBookById(Long id);

	public void createBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Long id);

}

``` 



This interface is responsible for CRUD operations with Category entity

``` 
@Service
public interface CategoryService {

	public List<Category> findAllCategories();

	public Category findCategoryById(Long id);

	public void createCategory(Category category);

	public void updateCategory(Category category);

	public void deleteCategory(Long id);

}  

``` 



This interface is responsible for CRUD operations with Publisher entity
 
``` 
@Service
public interface PublisherService {

	public List<Publisher> findAllPublishers();

	public Publisher findPublisherById(Long id);

	public void createPublisher(Publisher publisher);

	public void updatePublisher(Publisher publisher);

	public void deletePublisher(Long id);

}


```

 
 

## Entities 

 
 

These are 7 types of entities in the system. 

``` 

@Entity
public class Author {

    private Integer id;
    
    private String name;
    
    private String description;
    
    private Set<Book> books;
}

``` 

  

``` 

@Entity 
public class Book {  

    private Integer id;
    
    private String name;
    
    private String isbn;
    
    private String serialName;
    
    private String description;
    
	private Set<Author> authors;
	
    private Set<Category> categories;

	private Set<Publisher> publishers;

}  

``` 

  

``` 

@Entity 
class Category {  

    private Long id; 

    private String idValue; 

    private LocalDate date; 

    private Integer seventhAndParkCampus; 

    private Integer seventhUnderpass; 

    private Integer seventhUnderpassPedestrians; 

    private Integer seventhUnderpassCyclists; 

    private Integer blineConventionCntr; 

    private Integer pedestrians; 

    private Integer cyclists; 

    private Integer jordanAnd7th; 

    private Integer collegeAndRr; 

    private Integer walnutAndWylie; 

}  

``` 

 
 

``` 

@Entity  
public class AppUser {  

    private Integer id;
    
    private String name;
        
    private Set<Book> books;

}  

``` 
``` 

@Entity  
class Role {  

    Long id; 

    String name; 

}  

``` 

``` 

@Entity  
public class Employee {  

   private Integer id;
   
   private String first_name;
   
   private String last_name;
   
   private String email;

} 
```
``` 

@Entity  
public class Publisher {  

    private Integer id;
    
    private String name;
        
    private Set<Book> books;

}  

``` 
 
 

## DTO 

DTO needed for sending and receiving data by requests. 

 
 

``` 

public class UserRegistrationDto {

	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
}

```
 


 

## Repositories 

  

``` 

public interface AuthorRepository extends JpaRepository<Author, Long> {}

``` 

  

``` 
public interface BookRepository extends JpaRepository<Book, Long> {

	@Query("SELECT b FROM Book b WHERE b.name LIKE %?1%" + " OR b.isbn LIKE %?1%" + " OR b.serialName LIKE %?1%")
	public List<Book> search(String keyword);
}
``` 

  

``` 

public interface CategoryRepository extends JpaRepository<Category, Long> {}
``` 
 

``` 

public interface PublisherRepository extends JpaRepository<Publisher, Long> {}

``` 

``` 

public interface CustomCrashDataRepository { 
    int deleteRecords(String column, String value); 

} 

``` 

``` 

public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}

```

 
 

## Exceptions 

This class in needed to handle exceptions that can arise all over the application. 

``` 

public class NotFoundException extends RuntimeException {
	
	public NotFoundException(String message) {
		super(message);
	}

}
``` 

 
 

 