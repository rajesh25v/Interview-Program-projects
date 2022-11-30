package com.employeeTest;

public class Employee {
		int id;
		String name;

		int age;

		String gender;

		String department;

		int yearOfJoining;

		double salary;

		public Employee(int id, String name, int age, String gender, String department, int yearOfJoining,
				double salary) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.department = department;
			this.yearOfJoining = yearOfJoining;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getGender() {
			return gender;
		}

		public String getDepartment() {
			return department;
		}

		public int getYearOfJoining() {
			return yearOfJoining;
		}

		public double getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
					+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
		public Employee getEmployee() {
			return new Employee(101,"raj",25,"male","dev",2018,55002.1);
		}

}
