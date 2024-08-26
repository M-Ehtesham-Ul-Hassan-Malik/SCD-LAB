//Create the classes following the diagram shown. Keep the following things in mind:
// When an object of Artist is created, the value “artist” will be set to occupation.
// When an object of Gunman is created, the value “gunman” will be set to occupation.
// Person::Draw() will print out “A person can draw in many ways”
// Artist::Draw() will print out “An artist can draw with a paint brush”
// Gunman::Draw() will print out “A gunman draws a gun to shoot”


class person{

    private String occupation;

    public person() {
        this.occupation = occupation;
    }

    public void draw(){
        System.out.println("“A person can draw in many ways”");
    }
}

class artist extends person{

    public artist (String occupation){
        super();
    }

    @Override
    public void draw() {

        System.out.println("An artist can draw with paint brush");
    }
}

class gunman extends person{
    public gunman(String occupation){
        super();
    }

    @Override
    public void draw() {
        System.out.println("A gunman draws a gun to shoot.");
    }
}



public class Q4 {
    public static void main(String[] args) {
        person p = new person();
        person p1 = new artist("artist");
        person p2 = new gunman("gunman");
        p.draw();
        p1.draw();
        p2.draw();
    }
}
