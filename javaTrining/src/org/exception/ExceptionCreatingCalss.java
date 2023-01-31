package org.exception;

public class ExceptionCreatingCalss {
	public static void main(String[] args) {
		int empId= -2345;
		try {
			if (empId <0 && empId >=9999) {
				throw new CreatedException("Entered id is Valid emp id");
			}else {
				throw new CreatedException("Entered id is InValid emp id ");
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
