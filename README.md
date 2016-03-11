# Decorator Design Pattern

This type of design pattern comes under structural pattern as it acts as a wrapper to existing class. Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

Suppose you are working on a user interface toolkit and you wish to support adding borders and scroll bars to windows. You could define an inheritance hierarchy like ...

![Alt text](/images/image1.png?raw=true "Optional Title")

Or you could go with a decorator pattern which will  give you the ability to specify whatever combination of "features" is desired.

![Alt text](/images/image2.png?raw=true "Optional Title")

Note that this pattern allows responsibilities to be added to an object. 

The user  is always interested in CoreFunctionality.doThis(). The user may, or may not, be interested in OptionalOne.doThis() and OptionalTwo.doThis(). Each of these classes always delegate to the Decorator base class, and that class always delegates to the contained "wrappee" object.

![Alt text](/images/image3.png?raw=true "Optional Title")

Another example: assault gun is a deadly weapon on it's own. But you can apply certain "decorations" to make it more accurate, silent and devastating.

![Alt text](/images/image4.png?raw=true "Optional Title")

### Decorator Design Pattern in java API

The readers of java API are designed using decorator design pattern
* java.io.BufferedReader;
* java.io.Reader;

In conclusion, we can use as many decorators in any order we want. This excellent flexibility and changing the behaviour of an instance of our choice at runtime is the main advantage of the decorator design pattern.


### License
----

MIT
