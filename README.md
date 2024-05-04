🚀 Exercise 1: Space Exploration Simulator 🌌
Theme: Create a class hierarchy for a space exploration simulator.

Instructions:
1. Create a class called `SpaceShip` with the following properties:
   - `private String name`: The name of the spaceship. 🚀
   - `private final int maxCrew`: The maximum number of crew members the spaceship can accommodate. 👥
   - `private int currentCrew`: The current number of crew members on board. 👨‍🚀👩‍🚀
   - `private double fuelLevel`: The current fuel level of the spaceship. ⛽

2. Implement getter and setter methods for the `name`, `currentCrew`, and `fuelLevel` properties.

3. Create two constructors for the `SpaceShip` class:
   - A constructor that accepts the `name` and `maxCrew` as parameters and initializes the `currentCrew` and `fuelLevel` to 0.
   - A constructor that accepts the `name`, `maxCrew`, `currentCrew`, and `fuelLevel` as parameters.

4. Create a class called `CrewMember` with the following properties:
   - `private String name`: The name of the crew member. 😄
   - `private String role`: The role of the crew member (e.g., Captain, Engineer, Scientist). 👨‍✈️👩‍🔬

5. Implement getter and setter methods for the `name` and `role` properties of the `CrewMember` class.

6. In the `SpaceShip` class, add a method called `addCrewMember` that accepts a `CrewMember` object and adds it to the spaceship if there is available space. If the spaceship is full, print a message indicating that no more crew members can be added. 🚫

7. Create a `main` method to instantiate a `SpaceShip` object and add some `CrewMember` objects to it. Print the details of the spaceship and its crew members. 📜

🔷 Exercise 2: Shape Interfaces 🔷
Theme: Implement interfaces for different shapes and calculate their properties.

Instructions:
1. Create an interface called `Shape` with the following methods:
   - `double calculateArea()`: Calculates the area of the shape. 📏
   - `double calculatePerimeter()`: Calculates the perimeter of the shape. 📐

2. Create a class called `Rectangle` that implements the `Shape` interface with the following properties:
   - `private double length`: The length of the rectangle. 📏
   - `private double width`: The width of the rectangle. 📏

3. Implement the `calculateArea()` and `calculatePerimeter()` methods in the `Rectangle` class according to the rectangle's formula. ➕🔢

4. Create a class called `Circle` that implements the `Shape` interface with the following property:
   - `private double radius`: The radius of the circle. 🔵

5. Implement the `calculateArea()` and `calculatePerimeter()` methods in the `Circle` class according to the circle's formula. 🔢➗

6. Create a `main` method to instantiate objects of the `Rectangle` and `Circle` classes and calculate their areas and perimeters. 📊

🎵 Exercise 3: Playlist Analyzer 🎶
Theme: Implement algorithms to analyze a music playlist.
Instructions:

Create a class called PlaylistAnalyzer with the following methods:

public static String[] findLongSongs(String[] songs, double[] durations, double threshold): Accepts an array of song titles (songs) and an array of their corresponding durations (durations) in minutes. Returns an array containing the titles of the songs that exceed the given threshold duration. 🎵⏰
public static double calculateTotalPlaytime(double[] durations): Accepts an array of song durations (durations) in minutes and calculates the total playtime of the playlist. ⏱️


Implement the findLongSongs method by iterating over the songs and durations arrays, comparing each song's duration with the threshold, and storing the titles of the songs that exceed the threshold in a new array. 🔍🎧
Implement the calculateTotalPlaytime method by iterating over the durations array and summing up all the durations. ➕⏰
Create a method called public static void printSongs(String[] songs) that accepts an array of song titles and prints them in a formatted manner. 🖨️🎶
In the main method, create an array of sample song titles and their corresponding durations. Call the findLongSongs method with a specific threshold value and store the result in a new array. Print the long songs using the printSongs method. Then, call the calculateTotalPlaytime method and print the total playtime of the playlist. ▶️🎵

☀️ Exercise 4: Array Manipulation ☀️
Theme: Implement algorithms to manipulate arrays in a weather data analysis system.

Instructions:
1. Create a class called `WeatherDataAnalyzer` with the following method:
   - `public static double[] calculateAverageTemperature(double[][] temperatures)`: Accepts a 2D array of temperatures, where each row represents a day and each column represents an hour. Calculate and return an array containing the average temperature for each day. 🌡️📅

2. Implement the `calculateAverageTemperature` method by iterating over the 2D array, calculating the average temperature for each day, and storing the results in a new array. 🔢🌡️

3. Create a method called `public static void printTemperatures(double[] temperatures)` that accepts an array of temperatures and prints them in a formatted manner. 🖨️📊

4. In the `main` method, create a 2D array of sample temperature data and call the `calculateAverageTemperature` method. Then, print the results using the `printTemperatures` method. 📈

