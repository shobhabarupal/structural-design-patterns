Implementation Consideration
----------------------------
1) How much work that adapter does that depends upon the difference between target interface abd object being adapted.
    If target interface expecting some argument which are not compatible with Adaptee then  we may need to do some
    translation and conversion objects from one type to another.
2) Using class adapter allows us to override some of he adaptee's behaviour but this should be avoided as you end up
    with Adapter behaves differently than adaptee and the base requirement of Adapter pattern violated.
3) Using object adapter allows us to potentially change the Adaptee object to one of its subclass.

Design Consideration
--------------------
1) In java "class adapter" may not be possible if both target and Adaptee are concrete class. In such cases object adapter is the only solution.
2) A class adapter is 2 way adapter, since it can stand for both target interface and for the adaptee.

Examples:
---------
The java.io.InputStreamReader and java.io.OutputStreamWriter classes are example of Object adapter.
These classes adapts existing InputStream/OutputStream object to Reader/writer interface.

Pitfalls
--------
1) Using target interface abd adaptee class to extend our adapter we can create a class adapter in java. However it
    creates an object which exposes unrelated methods of adaptee in parts of code,polluting it.
    In cases where target and adaptee both are classes we can not even use class adapter.
2) It is tempting to do a lot of things like validation of object in adapter besides simple interface translation but
    this can result in adapter showing different behaviour than adaptee.
* Not a lot of other pitfalls! As long as we keep them true to their purpose of simple interface translation they are good.