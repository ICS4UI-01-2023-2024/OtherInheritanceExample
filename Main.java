public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy", 10, "Husky");

        Bank bank1 = new Bank();
        Bank bank2 = new Bank();
        Bank bank3 = new Bank();

        SaveFile[] filesToSave = {bank1, bank2, bank3};

        for(SaveFile f: filesToSave){
            f.saveFile();
        }

        if(bank1 instanceof Updatable){
            Updatable u = (Updatable)bank1;
            u.update();
        }
    }
}