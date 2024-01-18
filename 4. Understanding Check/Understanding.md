# Understanding Check

The primary way to get input from the user while a program is running in Java is the `Scanner` class. A `Scanner` is an object that looks for user input in the console/terminal and reads in relevant information as requested. Here is what you need to know to be able to use `Scanner` objects:

Before we can try to use `Scanner` objects, we have to import them so that Java knows to use them. At the top of every file that we want to use them in (literally the first line, even before any classes), we will write the following line every time:

```java
import java.util.Scanner;
```

Now with it imported, we can build a `Scanner` object to be able to use. While the variable name can change (written as `keyboard` in this example), this assignment will otherwise look the same every time:

```java
Scanner keyboard = new Scanner(System.in);
```

Now with a `Scanner` object built, we can ask it to read inputs from the console/terminal. To do this, we have a variety of methods that each interpret different types of information:

- `nextInt()`
- `nextDouble()`
- `nextBoolean()`
- `next()` - for `String`

For each of these, if you enter a value that isn't valid for the type they are expecting, the program will crash. We are going to ignore error handling and expect the user to enter the right types of information. Once you are done entering your value, hit the `Enter` or `Return` key to submit the information.

It is customary to use a print statement to print a message to let the user know what input is being expected before using one of the above methods. Otherwise, there is no prompt for the user to understand what type of information the program is looking for. Here is a sample program that uses the `Scanner` to read in a couple of values and assign them to variables:

```java
Scanner keyboard = new Scanner(System.in);

System.out.println("Enter an integer: ");
int numEntered = keyboard.nextInt();

System.out.println("Enter a boolean: ");
boolean boolEntered = keyboard.nextBoolean();

System.out.println("Enter a String: ");
String strEntered = keyboard.next();

System.out.println(numEntered);
System.out.println(boolEntered);
System.out.println(strEntered);
```

With this tool, let's use it to populate an array. In the `Understanding.java` file, initialize an array of integers with default values (just give it a length of 5). Using array access/modification, assign each of them a new value by prompting the user with a `Scanner`. Verify that you did it correctly by having it print out each of the values in the array afterwards.

Once you have gotten to just warnings, save the Java file and commit and push your changes via GitHub Desktop.
