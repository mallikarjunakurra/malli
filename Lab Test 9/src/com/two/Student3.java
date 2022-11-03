package com.two;

public class Student3 implements Comparable<Student3> {
	//private data members
		private String sid;
		private String name;
		private String contact;
		
		//default constructor
		public Student3()
		{
			super();
		}
		
		//parameterized constructor
		public Student3(String sid, String name, String contact) 
		{
			super();
			this.sid = sid;
			this.name = name;
			this.contact = contact;
		}

		//Getter and Setter methods for all data members
		public String getSid() {
			return sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		@Override
		public String toString() {
			return "Student2 [sid=" + sid + ", name=" + name + ", contact=" + contact + "]";
		}

		@Override
		public int compareTo(Student3 o) {
			return getSid().compareTo(o.sid);
		}
}
