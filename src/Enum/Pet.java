package Enum;

public enum  Pet {
    DOG("wuf wuf"), CAT("miau"), FISH("?"), RABBIT("wiii"), COW("muuuu");

    private String sound;

    Pet(String sound) { //wywolujemy konstruktor po
        this.sound = sound;
    }

    public void giveSound() {
        System.out.println(sound);
    }

    public static Pet find(String input) { //statyczna - działa na podtawie klasy
        for (Pet pet : values()) { //dla każdego zwierzęcia
            if (pet.sound.equals(input)) { //porównaj głos z istniejącym
                return pet; //i zwróć właściwe zwierze (jak z dziećmi "Jakie zwierze robi MUUUU? - Krowa")
            }
        }
        return null;
    }
}
