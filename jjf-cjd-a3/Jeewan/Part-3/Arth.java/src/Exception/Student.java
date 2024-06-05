package Exception;

public class Student {
	
		private String name;
		private int pwd;
	
		public student(String name, int pwd) {
			this.name = name;
			this.pwd = pwd;
		}
		public void getName (int pwd) {
			if(this.pwd == pwd) {
				System.out.println(name);
			} else {
				System.out.println("Invalid pwd");
				try {
					throw new InvalidPwd();
					
				}
			}
		}
	
}
