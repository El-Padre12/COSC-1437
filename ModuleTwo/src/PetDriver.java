public class PetDriver {
    public static void main(String[] args) {
        System.out.println("Pet Demo");

        Pet myPet = new Pet("Fido", "Bark", "Dog");

        System.out.println(myPet.getName());
        System.out.println(myPet.sound);
        System.out.println(myPet.getType());
        System.out.println();
        System.out.println(myPet.printInfo());
    }
}
