//A defense organization is making an hierarchy of different types of weapons. They have
//classified the nuclear bomb as follows:
//Weapons → Hot Weapons → Bombs → Nuclear Bombs
//Create classes and apply inheritance as necessary for the above hierarchy.
//Each class should have a method called: “xxxxxDescription”, where xxxx would be class name.
//The method should print out what that weapon does. Eg. Hot weapons uses gunpowder, or
//explode. Bombs blow up. Nuclear bombs blow up, and use nuclear fission and fusion.


class weapons{

    public void weaponDesciption(){
        System.out.println("This is a weapon");

    }
}

class hotWeapons extends weapons{


    public void hotweaponsDesctiption(){
        System.out.println("Hot weapons uses gunpowder, or explode.");
    }
}

class bombs extends hotWeapons{

    public void bombsDescription(){
        System.out.println("Bombs blow up.");
    }

}

class nuclearBombs extends bombs{

    public void nuclearBombsDescription() {
        System.out.println("Nuclear bombs blow up, and use nuclear fission and fusion.");
    }
}




public class Q3 {
    public static void main(String[] args) {


//    weapons w1 = new hotWeapons();
//    weapons w2 = new bombs();
//    weapons w3 = new nuclearBombs();
//    w1.hotweaponsDesctiption();

        nuclearBombs nb = new nuclearBombs();
        nb.weaponDesciption();
        nb.hotweaponsDesctiption();
        nb.bombsDescription();
        nb.nuclearBombsDescription();
}
}
