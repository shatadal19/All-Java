interface bysecal{
    int i = 30;
    void applybreak(int decrement);
    void sepaceUp(int increment);
}

class AvonCycle implements bysecal{
    void blowhorn(){
        System.out.println("pee pee poo poww");
    }
    public void applybreak(int decrement)
    {
        System.out.println("Appling break.");
    }
    public void sepaceUp(int increment)
    {
        System.out.println("Applying speedup");
    }
}
public class InTerface {
    public static void main(String[] args) {
    AvonCycle cy = new AvonCycle();
    cy.applybreak(1);
    // You can create propertis interface
    System.out.println(cy.i);
    // You can not modify the propertis in interfaces in therir faaina
   // cy.i = 600;
    System.out.println(cy.i);

    }
}
