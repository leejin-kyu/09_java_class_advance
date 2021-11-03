package step9_04.student;
public class StudentInsert { //학생 정보 입력
	
	private StudentDAO studentDAO;
	
	public StudentInsert(StudentDAO stDAO) { //Student DAO는 자료형이고 stDAO는 변수
		this.studentDAO = stDAO;//studentDAO 변수는 stDAO값을 대입함.
	}
	
	public void insert(StudentVO studentVO) {
		String id = studentVO.getId(); //studentVO클래스에서 getID 메서드 입력값을 id라 함.
		if (checkId(id)) {
			studentDAO.insert(studentVO); //studentDAO 클래스의 insert값으로 studentVO를 입력함.
		}
		else {
			System.out.println("중복아이디 입니다");
		}
	}
	
	
	public boolean checkId(String id) { //
		StudentVO studentVO = studentDAO.select(id); //StudentVO를 자료형으로 하는 studentVO를 정의함. studentVO는 studentDAO.select(id)값을 입력받음.
		return studentVO == null? true:false;// ?
	}
	
}
