Implementation Consideration
----------------------------
1) In case we are going to have a single implementation class, we can skip the abstract implementer class.
2) Abstraction can decide which concrete implementation to use in its constructor or we can delegate that decision to
    third class (in our example Client class). In the second way abstraction remains unaware about concrete implementation
    class and provides greater decoupling.

Design Consideration
--------------------
1) Bridge provides great extensibility by allowing us to change abstraction and implementation separately. We can build
    and package them separately to modularize overall system.
2) By using abstract factory pattern to create abstraction object with correct implementation we can decouple concrete
    implementation with abstraction.

Examples:
---------
1) JDBC API -> java.sql.DriverManager class with java.sql.Driver interface forms a bridge pattern.
    Driver class has 2 implementation - com.mysql.jdbc.Driver and oracle.jdbc.driver.OracleDriver
2) Collections.newSetFromMap() method which returns a set which is backed by a given Map object.


Pitfalls
--------
1) It is fairly complex to undestand and implement bridge pattern.
2) We need to have well thought out and fairly comprehensive design upfront in order to make a decision to build a Bridge pattern.
3) Refactoring legacy system to encorporate bridge pattern is complex.
    Even for the ongoing projects adding bridge at a later time is very time taking process and requires a lot of rework.