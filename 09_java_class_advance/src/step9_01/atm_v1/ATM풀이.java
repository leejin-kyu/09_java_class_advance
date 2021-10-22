package step9_01.atm_v1;

import java.util.Scanner;

public class ATM풀이 {
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	UserManager userManager = new Usermanager();
	int identifier = 1;

	void printMainMenu() {
		while(true) {
			System.out.println("\n[ MEGA ATM ]");
			System.out.println("[1.회원가입] [2.회원탈퇴] [3.로그인] [4.로그아웃]  [0.종료] : ");
			int sel = scan.nextInt();
			
			if		(sel ==1)		login();
			else if (sel ==2)		logout();
			else if (sel ==3)		join();
			else if (sel ==4)		leave();
			else if (sel ==0)		break;
		
		}
		
		System.out.println("[메시지] 프로그램을 종료합니다.");
	
	}
	
	void login() {
		identifier =userManager.logUser();
		
		if (identifier != -1) {
			printAccountMenu();
		}
		else {
			System.out.println("[메시지] 로그인실패.");
		}
		
	}
	
	void join() {
		
		userManager.addUser();
	}
	
	void logout() {
		if (identifier ==-1 ) {
			System.out.println("[메시지] 로그인을 하신 후 이용하실 수 있습니다.");
		}
		else {
			identifier = -1;
			System.out.println("[메시지] 로그아웃 되었습니다.");
		}
	}
	
	void leave() {
		userManager.leave();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
