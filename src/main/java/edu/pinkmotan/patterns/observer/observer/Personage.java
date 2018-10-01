package edu.pinkmotan.patterns.observer.observer;

public abstract class Personage {
    String name;
    String pet;
    Personage currentQueen;

    public Personage(String name, String pet) {
        this.name = name;
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Personage getCurrentQueen() {
        return currentQueen;
    }

    public void setCurrentQueen(Object currentQueen) {
        if(currentQueen instanceof Personage){
            this.setQueen((Personage) currentQueen);
        } else {
            throw new IllegalArgumentException("The queen is not even a characte!!!");
        }
    }

    protected void setQueen(Personage queen){
        this.currentQueen = (Personage) queen;
        System.out.printf("%s said: I bend the knee before you, my queen %s%n",
                this.getName(), this.currentQueen.getName());
    }
}
