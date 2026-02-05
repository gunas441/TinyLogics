Map and flatMap in streams
How to achieve dependency injection in springboot?
How to create an immutable class?
How the communication happens between two API?
Thread Pool
Future Object
Fail-fast fail-safe
ConcurrentHashMap
How to configure messaging broker?
What is composition and aggregation?

Base class and abstract class?
equals and hashcode contract?
interface A and interface B has same default method class C implements both the interfaces. What will happen now?
Can we create custom marker interface?
Volatile keyword
Can we create a functional interface without abstract method?

various components of micro-service?
Springboot actuator
Springboot profiles
@ControllerAdvice
Maven build lifecyle
Maven default scope
Maven plugin
settings.xml

clustered index and non-clustered index in xml?
View in SQL?
What is Stored Procedure? How it is different from view?

Second largest number in list using java 8 streams?
HashMap and concurrentHashMap
Volatile - Synchronized keyword
Authentication - who you are
Authorization - which part of the application you can access to
Communication between two microservices - synchronous, asynchronous
disadvantages of microservice?
disadvantages of springboot?

difference between WAR and embedded containers?
common security vulnerabilities in web application?
What is java memory model?
Concurrent HashMap - null is not allowed why? Segment
memory leaks in java?
Optional class
Method Reference in java 8?
join and subquery sql?
having and where class in sql?

Should we have to add @FunctionalInterface annotation? What is the advantages of doing so?
can functional interface extend any other interface?
We have a abstract method equals() and another abstract method abc()? Will this be considered as functional interface?
In-built functional interfaces? Predicate, Runnable, Callable...
findFirst() and findAny()?
Consumer and Bi-Consumer?
pre filled map. Map.of() method? What are the limitation?
ORM and JPA difference?
process and thread?
Components of microservices?

What is parallel stream in java? Advantages and disadvantages of parallel stream?
In java 8 why static and default methods introduced in interface?
Terminal operations in stream API?
serialVersionUID purpose?
How can I make a hashMap synchronized?
When we should use concurrent hashMap and when we should use synchronized hashMap?
@Primary annotation in springboot?
@Qualifier?
Springboot admin and actuator? what is the difference?
client and server side discovery?
Difference between PUT and PATCH?
Caching in springboot @Cacheable @CachePut @CacheEvict
3 layer springboot architecture?

How to create object in java?
* new keyword
* newInstance() method of Class class java.lang.Class (this internally calls Constructor class's newInstance() method)
1. Student s1 = (Student) Class.forName("fully qualified package").newInstance();
2. Student s2 = Student.class.newInstance();
* newInstance() method of Constructor class java.lang.reflect.Constructor (This is widely used in framework like Spring, Struts, Hibernate)
1.Constructor<Student> constr = Student.class.getConstructor();
 Student s3 = constr.newInstance();
WHAT IS THE DIFFERENCE BETWEEN CLASS AND CONSTRUCTOR'S newInstance() method? --
1.Class's method always look and invokes no-arg constructor whereas the Construtor's method invokes parameterized constructor
2.Class's method always uses constructor that is visible i.e., public constructor whereas the Construtor's method invokes private constructor in some cases.
3.Class's method throws all the exception individually that is thrown by constructor whereas the Construtor's method wraps all exception as a single exception as InvocationTargetException
* clone() of Object class - constructor will not be getting called & class should implement cloneable interface and override clone method
* through deserialisation - constructor will not be getting called & class should implement serializable interface

What serialization and deserialization? SerialisationUID?
Stream and parallel stream?
Current version of java and springboot?

HCL
Wrapper class - in java provides the mechanism to convert primitive data type to Object and Object to primitive
final - variables that cannot be modified after initialization, methods that cannot be overridden and classes that cannot be inherited.
final blank variable, a final variable that is not initialized during declaration, it can be initialized only in constructor.
static final blank variable - a final variable that is not initialized during declaration, it can be initialized only in static block.
static - The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.
@Transactional - The @Transactional annotation is metadata that specifies that an interface, class, or method must have transactional semantics (for example, "start a brand new read-only transaction when this method is invoked, suspending any existing transaction").
The default @Transactional settings are as follows:
The propagation setting is PROPAGATION_REQUIRED.
The isolation level is ISOLATION_DEFAULT.
The transaction is read-write.
The transaction timeout defaults to the default timeout of the underlying transaction system, or to none if timeouts are not supported.
Any RuntimeException or Error triggers rollback, and any checked Exception does not
Caching mechanism in springboot -


1. You have a user table with 50 records. → Write a query to fetch 20 records starting from 5th row (first & last name only)?
SELECT first_name, last_name
FROM users
ORDER BY id
LIMIT 20 OFFSET 4;

2, Highest 2 salary

SELECT DISTINCT salary
FROM employees
ORDER BY salary DESC
LIMIT 1 OFFSET 2;

1st highest → OFFSET 0
2nd highest → OFFSET 1
3rd highest → OFFSET 2
