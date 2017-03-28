public int valueFullHouse() {
		boolean fullHouse = false;
		if (valueThree() > 0 && valueOnePair()> 0){
			if(valueThree()/3 != valueOnePair()/2){
				fullHouse = true;
			}
		}
		if (fullHouse){
			return valueOnePair() + valueThree();
		}
		else{
			return 0;
		}
	}

	public int valueTwoPair() {

		int[] valuez = freqFaceValue();

		int sum = 0;
		int count = 0;

		for (int i = 1; i < valuez.length; i++) {
			if (valuez[i] == 2) {
				count++;
				sum += 2 * i;
			}
		}
		if (count <= 1) {
			sum = 0;
		}

		return sum;
	}
