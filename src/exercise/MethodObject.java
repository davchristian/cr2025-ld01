package exercise;

public class MethodObject {

	class Account {
		private int delta() {
			return 10;
		}
		// TODO: replace this gamma method with method object (make a class for the gamma logic)  
		public int gamma(int inputVal, int quantity, int yearToDate) {
			    return new gammaClass(inputVal, quantity, yearToDate).gammaCount();
		}

	}

	class gammaClass {
		private int inputVal;
		private int quantity;
		private int yearToDate;
		private int importantValue1;
		private int importantValue2;

		public gammaClass(int inputVal, int quantity, int yearToDate) {
			this.inputVal = inputVal;
			this.quantity = quantity;
			this.yearToDate = yearToDate;
		}

		private int getImportantValue1() {
			return inputVal * quantity;
		}

		private int getImportantValue2() {
			return inputVal * yearToDate;
		}

		private int getImportantValue3() {
			return importantValue2 * 7;
		}

		public int gammaCount() {
			if ((yearToDate - getImportantValue1()) > 100) {
				getImportantValue2() -= 20;
			}
			return getImportantValue3() - 2 * getImportantValue1();
		}
	}

	private void test() {
		Account account = new Account();
		System.out.println(account.gamma(15,10,2010));
		
	}
	public static void main(String[] args) {
		MethodObject p = new MethodObject();
		p.test();
	}

}
