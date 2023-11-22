// package lab3;

// Inheritance: Parent class representing generic psychological concepts
class Psychology {
    String concept;

    Psychology(String concept) {
        this.concept = concept;
    }

    void study() {
        System.out.println("Studying " + concept);
    }
}

// Super: Subclass extending the parent class
class Superego extends Psychology {
    Superego() {
        super("Superego");
    }

    void influenceBehavior() {
        System.out.println("Guiding behavior based on societal norms");
    }
}

// Abstract: Abstract class representing an abstract psychological concept
abstract class AbstractThought {
    abstract void generateIdea();
}

// Final: Class demonstrating a final psychological perception
class FinalPerception {
    final String perception;

    FinalPerception(String perception) {
        this.perception = perception;
    }

    void describe() {
        System.out.println("This perception is: " + perception);
    }
}

public class PsychologyMain {
    public static void main(String[] args) {
        // Inheritance
        Psychology psychology = new Psychology("Human Behavior");
        psychology.study();

        // Super
        Superego superego = new Superego();
        superego.study();
        superego.influenceBehavior();

        // Abstract
        AbstractThought abstractThought = new AbstractThought() {
            @Override
            void generateIdea() {
                System.out.println("Generating abstract idea...");
            }
        };
        abstractThought.generateIdea();

        // Final
        FinalPerception finalPerception = new FinalPerception("Immutable");
        finalPerception.describe();
    }
}
