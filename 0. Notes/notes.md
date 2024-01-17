# Array Creation and Access

Arrays are a tool we can use to store multiple pieces of information in one place, making it easier to work with lots of information. Let's look at when we might need these.

---

## The Need for Arrays

When we program, we are often faced with situations where we want to store multiple, related pieces of information. By multiple, related pieces of information, we are referring to the idea of storing things that are all similar, like a set of related numbers (more like multiple people's ages, not related information like the name and age of a single person).We've been able to work through this until now by making a variable for each piece of information. Here is an example from the `NotesNeed1.java` file:

```java
int myAge = 26;
int friend1Age = 25;
int friend2Age = 24;
int friend3Age = 26;
int friend4Age = 27;
int friend5Age = 32;
int friend6Age = 31;
int friend7Age = 26;
int friend8Age = 24;
int friend9Age = 25;
```

This code stores my age, as well as the ages of nine of my friends, but it is really annoying to write all of this out. It continues to be annoying if I decide I want to know the average age of my friends and I, which would look like this example from the `NotesNeed2.java` file:

```java
int ageSum = myAge + friend1Age + friend2Age + friend3Age + friend4Age + friend5Age + friend6Age + friend7Age + friend8Age + friend9Age;
double average = ageSum / 10.0;
```

Again, we had to go through the effort of writing out every variable, and it wouldn't get easier if I wanted to change and add more people. These are the golden situations of arrays, they can help us better organize and work with information like this.

---

## What is an Array?

An **array** is one of the basic **data structures** available in Java. A **data structure** is a specialized format for organizing, processing, retrieving, and storing data. An array is a basic data structure because it takes a simple approach to how it organizes data.

Picture a row of lockers, much like we have around our school. Each locker is capable of holding onto whatever we need, normally in the form of backpacks, coats, or books. The lockers are also organized, so in a row we have lockers with numbers that slowly count up. An array is much like a row of these lockers, where we tell Java what type of information the lockers will be storing. Taking our example from earlier, here is what our row of lockers, or array, of ages would look like visually:

```
---------------------------------------------------
| 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  |
---------------------------------------------------
|    |    |    |    |    |    |    |    |    |    |
| 26 | 25 | 24 | 26 | 27 | 32 | 31 | 26 | 24 | 25 |
|    |    |    |    |    |    |    |    |    |    |
---------------------------------------------------
```

In this crude picture, we can see locker numbers along the top, starting with `0`. Each of these is an **index**, just like from when we worked with `String` objects, and represents a particular locker in the row. Just like with `String` objects, we start at `0` for our indices, and count up from there. Also similarly, each array has a **length**, which is the total number of lockers it represents, and is always `1` more than the highest index, so that's `9 + 1`, which is a length of `10` in this case.

*Advanced Note:* This similarity to `String` objects is not a coincidence. While they are packaged more neatly to make using them easier, `String` objects are just arrays of individual characters with some additional tools built in.

Underneath the locker numbers, we can see what is stored in each locker. Just like with `String` objects, we can ask the `array` what value is stored in any particular locker by giving the index. For example, the value stored in locker `7` is `26`.

---

## Creating Arrays

Since arrays aren't a new type in their own right (they aren't like our primitive types `int`, `double`, or `boolean`, or even like our objects like `String` or `Person`), they will utilize the types we have already been using with a slight twist in the form of square brackets `[]`. The difference between declaring an `int` variable and an `int` array variable is a subtle change of adding the square brakcets `[]`. Here is an example of declaring arrays of a few different types from the `NotesDeclare1.java` file:

```java
int[] intArray;
double[] doubleArray;
boolean[] booleanArray;
String[] stringArray;
Person[] personArray;
```

Each of these declarations represents different rows of lockers, where we establish what can be stored in the lockers in those rows. `intArray` represents a row of lockers that can hold `int` numbers, and `stringArray` represents a row of lockers that can hold `String` objects. We can even make arrays with custom objects that we make, like `personArray` above.

It isn't a requirement to put `array` in the variable name, though we usually want someway to identify that a variable is meant to hold multiple pieces of information as opposed to just a single value. Here is an example using the age problem from above in the `NotesDeclare2.java` file:

```java
int age;
int[] ages;
```

Here, just the subtle change to naming the variable `ages` instead of `age` can help someone to understand what the variable might be doing.

As we know from our work throughout this year, just declaring a variable doesn't make or store any values, so how do we actually create an array to assign to the variables? For this purpose, we can think of arrays like any other object, where they need the keyword `new` to be created. There is a twist though, as instead of a constructor call with parentheses `()` like we are used to, we do a new kind of constructor call with square brackets `[]`, which needs just one `int` argument: the length for the array (AKA how many lockers in the row). Here is what this would look like if I wanted to take the same array variables from `NotesDeclare1.java` and wanted to initialize them with arrays of various lengths in this example from the `NotesInitialize1.java` file:

```java
int[] intArray = new int[10];
double[] doubleArray = new double[15];
boolean[] booleanArray = new boolean[1];
String[] stringArray = new String[0];
Person[] personArray = new Person[1000];
```

Notice that regardless of what type of information the lockers store, the value provided in the square brackets to represent the length is always an `int`. Additionally, the length could be very large, like `personArray` being initialized with `1,000` lockers. They can also be very small, as you can see with `booleanArray` and `stringArray`. These lengths are not particularly useful, as in the case of `booleanArray`, only storing `1` `boolean` value is the same as just a `boolean` variable, and `stringArray` is even less helpful because it can't store any `String` objects. You cannot though, initialize an array with a negative length.

It is important to create an array with the length that you need, since arrays are **immutable**, meaning we can't change them after they've been created, and they are stuck with the length we assign. Due to this, we are often very careful when we create arrays to make sure we don't make them too small, as it would cause problems later. On the other hand, we also don't want to make them too large, as that would potentially waste a lot of space in memory.

*Advanced Note:* Arrays are immutable because of how they are stored in memory. When an array of length `n` is created, Java finds `n` sequential memory locations that aren't being used, and allocates them for the array. An array variable stores the starting memory location of those sequential spaces that have been allocated, and the index tells it how many locations to move over from the starting location to get each value. Therefore, the first index is `0`, because we move `0` locations over from the start to get the first value. For some interesting purposes later on, this also means that array variables store references, much like other objects we work with, and deal with all the similar consequences that come out of that.

In our ages examples above, we know that it is myself and nine friends, so we will need a length of `10`. Our full initialization would look like this example from the `NotesInitialize2.java` file:

```java
int[] ages = new int[10];
```

This creates the array `ages`, which will store `10` `int` values. Importantly, we haven't told it what the ages to store are, so it has created this array without knowing what values to store. Whenever this happens, it populates the array with **default values** for the type that it is storing. As a refresher, here are the default values for the types we typically work with:
- `int` --> `0`
- `double` --> `0.0`
- `boolean` --> `false`
- Objects --> `null`

While we said earlier that arrays are **immutable**, this is just referring to the overall structure, with things like length. The individual values stored by an array can be modified according to their own rules (that is, if the data itself is primitive types, mutable objects, or immutable objects).

This means that in our ages example, the array would have been initialized as `[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]`, which is clearly not what we were intending to do. To initialize an array based on a pre-defined list of values, referred to as an **initializer list**, it looks a little bit different. This time, after the square brackets, we will put our initializer list of values in curly braces `{}`, with commas between each one. Since we are providing the initializer list, we no longer put an `int` value in the square brackets, because Java can just read how many values are in the initializer list to determine the length. Here is an example from the `NotesInitialize3.java` file that shows how we can use initializer lists with any of our array types:

```java
int[] intArray = new int[] {5, 10, 15, 20}; // Length of 4
double[] doubleArray = new double[] {5.2, 3.4, -16.5, 1005.7, 0.0}; // Length of 5
boolean[] booleanArray = new boolean[] {true, false, false, true}; // Length of 4
String[] stringArray = new String[] {"Hello, World!", "Mr. G", "John"}; // Length of 3
Person person1 = new Person("Mr. G", 26);
Person[] personArray = new Person[] {person1, new Person("John", 26)}; // Length of 2
```

An important point of understanding is demonstrated here by the `personArray` array, which uses both a variable that stores a `Person`, and uses the constructor to make a new `Person` in the initializer list, which works perfectly fine.

It does bring back an important concept that we have been touching on more frequently though, which is storing by reference versus storing by value. To summarize, variables in Java store the value or a reference (memory location) depending on the type being assigned to it. Primitive types are stored directly in the variable, or better phrased as the value is stored in the variable. Objects are typically stored by reference, meaning that their actual data is elsewhere in memory, and the variable just stores the reference, or memory location, of that actual data. This is important to think about with arrays, as they store things exactly like variables do. Primitive types store their actual values (so for `int`, `double`, and `boolean`, the values are stored directly in the array), and objects are stored by reference, so the array itself only stores memory addresses to the objects elsewhere. This means that the `person1` variable and the first locker (index `0`) of `personArray` are aliases to the same object, since they are both storing the same memory address.

With the initializer list, we can finally store our ages example in an array, as visualized in the locker analogy above. Here is an example of this from the `NotesInitialize4.java` file:

```java
int[] ages = new int[] {26, 25, 24, 26, 27, 32, 31, 26, 24, 25};
```

---

## Accessing Arrays

Now that we know how to make arrays, we need to know how to interact with them. We refer to working with the individual elements of an array as **accessing** and **modifying** them (these names are analogous to our accessor and mutator methods from Unit 5).

To **access** an individual piece of data in an array, we again use our square brackets. Once an array has been created, we can use square brackets with the variable to request the value stored in any particular locker by providing its index. Here is an example using the ages from above in the `NotesAccess1.java` file:

```java
int[] ages = new int[] {26, 25, 24, 26, 27, 32, 31, 26, 24, 25};
System.out.println(ages[0]);
```

This will print out the first element (remember: `0` is the first index) of the array that the variable `ages` represents, which we know is `26`. Note that accessing here is much like an **accessor method** from Unit 5, it just allows us to get any value in the array.

You might notice that, since the indices are just counting up from `0`, loops could play a role in this and go through and access each element of an array. This will be the premise of Unit 6 Section 2.

To **modify** an individual piece of data, we use the square bracket with our variable to request a specific locker, and then use our basic variable assignment skills to replace the value. Let's say that my friend Owen had his birthday recently, so his age needs to be updated in the array. He was the second friend (or therefore the third person), so his age is stored at index `2`. Here is an example from the `NotesModify1.java` file that changes his age:

```java
int[] ages = new int[] {26, 25, 24, 26, 27, 32, 31, 26, 24, 25};
System.out.println(ages[2]);
ages[2] = 25;
System.out.println(ages[2]);
```

We can see that this successfully updates his age to `25`, as it prints out the original value `24` at first, and then prints `25` after the modification. We can also do compound assignment just like a normal variable, which makes updating for a birthday even easier. Let's say my friends Sam (index `5`), Liam (index `3`), and Drew (index `4`) all had a birthday as well (or I am behind and need to catch up on updating the ages). Here are three different ways to modify an array value based on its current value in the `NotesModify2.java` file:

```java
int[] ages = new int[] {26, 25, 24, 26, 27, 32, 31, 26, 24, 25};
System.out.println(ages[5]);
ages[5] = ages[5] + 1;
System.out.println(ages[5]);
System.out.println(ages[3]);
ages[3] += 1;
System.out.println(ages[3]);
System.out.println(ages[4]);
ages[4]++;
System.out.println(ages[4]);
```

For most practical purposes, an array variable at a specific index functions just like any other variable, so we can print, change, update, etc. This becomes especially relevant when working with arrays that store objects. An array variable at a specific index can then be used with the dot operator `.` to do anything that you would normally do with that object like calling methods. Here is an example with `Person` objects in the `NotesModify3.java` file:

```java
Person person1 = new Person("Mr. G", 26);
Person[] personArray = new Person[] {person1, new Person("John", 26)};
System.out.println(personArray[1].getAge());
personArray[1].setAge(30);
System.out.println(personArray[1].getAge());
```

This means that even though they are inside an array, we can do anything with these objects that we would have been able to do if they had been stored in their own variables, which is really useful!

Just like with `String` objects and their use of indices with things like `substring`, we can have errors that pop up if we try to check or use an invalid index. Just like a `String` object, the valid indices are from `0`, up to, but not including, `length`. For our ages example, valid indices go from `0` to `9`, since the length is `10`. If we try to access or modify an invalid index, we get an `ArrayIndexOutOfBoundsException`, and our program crashes. An easy thing to always check for as you code is not to check a negative index, since those would never work, regardless of length.

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
