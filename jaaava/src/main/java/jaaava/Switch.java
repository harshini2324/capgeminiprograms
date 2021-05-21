package jaaava;

public class Switch {

	public static void main(String[] args) {
	int marks=22, mm=2;
	if(marks>60) {
		mm=1;
	}
	else {
		if(marks>=45 && marks<60) {
			mm=2;
		}else {
			if(marks>=33 && marks<45) {
				mm=3;
			}
			else {
				mm=4;
			}
		}
	}
	switch(mm) {
	case 1:System.out.println("first division");
	break;
	case 2:System.out.println("second division");
	break;
	case 3:System.out.println("third division");
	break;
	case 4:System.out.println("fail");
	break;
	default:System.out.println("invalid");
	}

	}

}
