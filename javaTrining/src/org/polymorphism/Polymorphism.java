package org.polymorphism;
// METHOD OVERLOADING........
public class Polymorphism {
	public static void main(String[] args) {
		Polymorphism emp=new Polymorphism();
		emp.empName("mano");
		emp.empId((short) 32767);
		emp.empId(44);
		emp.empNumber(7502760449L);
		emp.empWorker(false);
	}

	private void empWorker(boolean worker) {
		System.out.println("worker "+worker);
		}
	private void empNumber(long number) {
		System.out.println("Number "+number);
		}
	private void empId(short id) {
		System.out.println("Id (short) "+id);
			}
	private void empId(int id) {
		System.out.println("Id (int) "+id);		
		}
		public void empName(String name) {
		System.out.println("Name "+name);
		}
	}
