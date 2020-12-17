public class DogLauncher {
	public static void main(String[] args) {
		Dog d = new Dog(20);
		//d.makeNoise();
		System.out.println(Dog.Name);
		int i;
		Dog[] manyDogs = new Dog[3];
		manyDogs[0] = new Dog(15);
		manyDogs[1] = new Dog(35);
		for (i = 0; i < 3; i += 1) {
			//Dog.maxDog(manyDogs[i], d).makeNoise();
			manyDogs[i].maxDog(d).makeNoise();
		}
	}
}

		