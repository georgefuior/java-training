package code._4_student_effort.ChallengeThree;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }
    public abstract void eat();

    public void walk(){
        System.out.println("Animal walks on "+this.legs);
    }
}
