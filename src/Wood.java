public class Wood {
    public Nut[] getNutsArray(int amount) {
        Nut[] nutArray = new Nut[amount];

        for(int i = 0; i < amount; ++i) {
            nutArray[i] = new Nut();
        }

        return nutArray;
    }
}
