package Enum;

public class EnumExample {
    public static void main(String[] args) {
        Pet type1 = Pet.DOG;
        Pet type2 = Pet.CAT;
        Pet type3 = Pet.DOG;

        /*System.out.println(type1 == type2);
        System.out.println(type1 == type3);

        type1.giveSound();
        type2.giveSound();
        type3.giveSound(); //lub */

        /*Pet [] pets = Pet.values();
        for (Pet s : pets) {
            s.giveSound(); //wyświetla też nowododane
        } //lub */

        /*Pet pet = Pet.valueOf("COW");
        pet.giveSound(); */

        Pet petThatGiveMuu = Pet.find("muuuu");
        System.out.println(petThatGiveMuu);
    }
}
