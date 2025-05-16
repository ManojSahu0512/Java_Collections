package CoreJava.Java8Features.OptionalClass;
/*The Optional class in Java 8 is a container object used to avoid NullPointerException. It represents a value that may or may not be present.
*
* Optional<CoreJava.String> name = Optional.of("Vipul");        // Non-null value
Optional<CoreJava.String> empty = Optional.empty();           // Empty Optional
Optional<CoreJava.String> maybeName = Optional.ofNullable(null); // Accepts null

*
* CoreJava.String name = getUserName(false).orElse("Default User");
System.out.println(name); // Default User
*
*
* 🧠 Summary Table
Method	Description
of()	Create non-null Optional
ofNullable()	Accepts null
empty()	Creates an empty Optional
get()	Returns value or throws exception
isPresent()	Checks if value is present
ifPresent()	Executes action if value exists
orElse()	Returns value or default
orElseGet()	Returns value or generated default
orElseThrow()	Throws exception if empty
map()	Transforms value
flatMap()	Transforms and flattens
filter()	Filters based on predicate*/
public class Syntax {
}
