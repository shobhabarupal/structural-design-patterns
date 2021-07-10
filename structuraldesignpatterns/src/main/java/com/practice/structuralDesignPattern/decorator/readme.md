Implementation Consideration:
----------------------------
1) Since we have decorators and concrete class implementing the base class. So avoid using a large state in the base class
   because decorators might not need all of them.
2) Pay attention to equals and hashcode method of the decorator. You need to decide if decorated objects is equal to the
    same instance without decorator. There is no right or wrong answer for this.
3) Decorator supports recursive compositon. Each decorator can be added to another decorator.So this pattern creats a lot
    of small objects that adds a small functionality. Having lot of objects sometimes becomes difficult to debug.

Design Consideration
----------------------------
1) Decorators are more flexible and powerful than inheritance. Inheritance are static in nature but decorators can be
    used to add behaviour at runtime.
2) Decorator should act like small skin on your object. Decorator should add small behaviour to original behaviour.Do not
    change meaning of operations.

Examples:
----------------------------
1) Java I/O package is a good example of decorator pattern.
    BufferedOutputStream class decorates any OutputStream class and add Buffer capabilities to file writing operation.


Pitfalls:
----------------------------
1) Often results in large number of class being added, where each class adds a small amount of functionality. You end up
    having a lots of objects , one nested inside another.It becomes are to debug.
2) Sometimes developers start using this pattern as a replacement of inheritance. You should thing about decorators as
    thin skin to your objects. It should not change the meaning of original operations.