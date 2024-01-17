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

Each of these declarations represents different rows of lockers, where we establish what can be stored in the lockers in those rows. `intArray` represents a row of lockers that can hold `int` numbers, and `stringArray` represents a row of lockers that can hold `String` objects.

It isn't a requirement to put `array` in the variable name, though we usually want someway to identify that a variable is meant to hold multiple pieces of information as opposed to just a single value. Here is an example using the age problem from above in the `NotesDeclare2.java` file:

```java
int age;
int[] ages;
```

Here, just the subtle change to naming the variable `ages` instead of `age` can help someone to understand what the variable might be doing.

As we know from our work throughout this year, just declaring a variable doesn't make or store any values, so how do we actually create an array to assign to the variables? For this purpose, we can think of arrays like any other object, where they need the keyword `new` to be created. There is a twist though, as instead of a constructor call with parentheses `()` like we are used to, we do a new kind of constructor call with square brackets `[]`, which 





# Nested Iteration

In Unit 3, we encountered what would happen if we **nested** `if` statements, or put `if` statements inside of one another. It was fairly straightforward, as you'd have to pass both `boolean` conditions to perform the inside of the inner `if` block.

Just like `if` statements, we can nest loops as well, though the behavior they introduce is a little bit more interesting.

---

## Nested Iteration

While complicated to understand and use effectively, **nested iteration** is really simple to set up: just put one loop inside of another. Here is an example from the `NotesNested1.java` file:

```java
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= 5; j++) {
        System.out.print(i + " ");
    }
    System.out.println();
}
```

This produces the following output:

```
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4
```

Let's digest how this is operating to produce this output. First and foremost is a rule: for every iteration of the outer loop (in this case that is the one with `i`), the inner loop needs to run completely (in this case the loop with `j` needs to do all of its repetitions).

Let's break this down into the steps the computer would follow:

1. The outer loop is initialized, making the variable `i` and setting it to `1`. Now we are ready to run things inside of the outer loop.
2. According to the rules of iteration, we need to run the block of code inside of our loop, which in this case happens to be another loop. We initialize that loop by making the variable `j` and setting it to a value of `1`. Now we are ready to run things inside of the inner loop.
3. When we are inside of the inner loop, both of our variables `i` and `j` exist and are defined. So when we run the `print` statement, it can use the value of `i`, which has started at `1`. The inner loop demands that we repeat this 4 more times by incrementing the value of `j`, for a total of 5 times, producing the line `1 1 1 1 1`.
4. Once we finish the inner loop, we finish the block of code inside the outer loop by running the `println` statement. Now we can go back outside and increment the variable `i` to get `2`, and repeat the process inside.
5. Each time we do the process inside, it prints the value of `i` 5 times with spaces in between, then puts a newline before the next value of `i`. Since the outer loop goes until `i` is `4`, we will end up with 4 lines of output.

While important to note that this effectively repeated the `print` statement 20 times, it is significant that this repeated the print statement in bunches of 5, where within a bunch the print statement was not changing. We printed `1` 5 times, `2` 5 times, `3` 5 times and `4` 5 times.

---

## Inner Loops that Depend on Outer Loops

In our example above, the inner loop always ran 5 times, since `j` went from `1` to `5`. However, because when we run the inner loop with `j`, `i` exists, we can define our inner `boolean` condition using the value of `i` to make it more dynamic.

Let's say our goal is to produce this output:

```
1
2 2
3 3 3
4 4 4 4
```

So basically, we want to print each number itself's number of times. 1 gets printed 1 time, 2 gets printed 2 times, etc. Just like the last example, we will use our outer loop as the number we are printing out. So it's header will look like `for (int i = 1; i <= 4; i++)`. With that established, we have to think about how to set up the inner loop. We know that when `i` is 1, we want it to run 1 time, and when it is `2`, we want it to run `2` times. We can start `j` at `1` and will increment it, so the only question is the `boolean` condition. If we start `j` at `1`, when `i` is `1` we need it to pass one time, but fail after incrementing, which should work with `j <= i` as `1 <= 1` works but `2 <= 1` does not. When `i` is `2`, we need to run twice and then fail, so `1 <= 2` works, `2 <= 2` works, and `3 <= 2` fails. So our inner loop header needs to be `for (int j = 1; j <= i; j++)`. The print statements will be setup the same way as our previous example, so we get the final code from the `NotesNested2.java` file:

```java
for (int i = 1; i <= 4; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
    }
    System.out.println();
}
```

When run, this produces the output we want! Two really important things to note:

1. There was exactly one change from the first example to the second example, despite the drastically different output. The inner `boolean` condition changed from `j <= 5` to `j <= i`.
2. Because of our use of loops this is extremely easy to modify to do more or less. If I want this to print more or fewer numbers following the rule, I just need to modify the outer `boolean` condition of `i <= 4`.

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
