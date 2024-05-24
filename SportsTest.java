/* 
   Question: Write a Java program to create a base class Sports with a method called play(). 
             Create three subclasses: Football, Basketball, and Rugby. Override the play() 
             method in each subclass to play a specific statement for each sport 
*/

// defining the base class Sports
class Sports {
    // Method to play a generic sport
    public void play() {
        System.out.println("Playing a sport");
    }
}

// subclass Football extending the Sports class
class Football extends Sports {
    // overriding the play() method to play football
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

// subclass Basketball extending the Sports class
class Basketball extends Sports {
    // overriding the play() method to play basketball
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

// subclass Rugby extending the Sports class
class Rugby extends Sports {
    // overriding the play() method to play rugby
    @Override
    public void play() {
        System.out.println("Playing Rugby");
    }
}

// main class to test the Sports and its subclasses
public class SportsTest {
    // main method where the program execution starts
    public static void main(String[] args) {
        // creating objects of each subclass
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        // calling the play() method for each sport
        football.play();
        basketball.play();
        rugby.play();
    }
}
