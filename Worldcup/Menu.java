package java_day18.Worldcup;

public class Menu {
	// 캡슐화 
		// 1. 필드 변수들의 접근 제어자를 private로 만든다 
		private String name;
		private boolean isSelect = false;
		
		// 클래스 만들때 국룰
		// Alt Shift S 
		// 2. Generate constructor using Field
		public Menu(String name, boolean isSelect) {
			this.name = name;
			this.isSelect = isSelect;
		}
		
		public Menu(String name) {
			this.name = name;
		}
		
		public Menu(){
			// 3.기본 생성자 추가
		}
		
		@Override
		public String toString() {
			return "Menu [name= " + name + ", isSelect= " + isSelect + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isSelect() {
			return isSelect;
		}

		public void setSelect(boolean isSelect) {
			this.isSelect = isSelect;
		}
}
