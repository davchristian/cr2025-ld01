package exercise;
public class ExtractClass {
// todo extract class TelephoneNumber from class Person
	class Person {
	  private String name;
	  private TelephoneNumber telephoneNumber;

	  public String getName() {
		return name;
	  }
	  public TelephoneNumber getTelephoneNumber() {
		  return telephoneNumber;
	  }

	}

	class TelephoneNumber {
		private String officeAreaCode;
		private String officeNumber;

		public String getOfficeAreaCode() {
			return officeAreaCode;
		}
		public String getOfficeNumber() {
			return officeNumber;
		}

		public String getTelephoneNumber() {
			return officeAreaCode + officeNumber;
		}

	}
}