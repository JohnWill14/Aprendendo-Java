package  br.com.william.devdojo.Aclasses.test;
import  br.com.william.devdojo.Aclasses.classe.Student;
public class TestStudent{
	public static void main(String[] args) {
		Student estudante=new Student();
		estudante.setNome("GOKU");
		estudante.setId(4);
		estudante.setMatricula("111");
		System.out.println("\nNOME: "+estudante.getNome()+
							"\nIdade: "+estudante.getId()+
							"\nMatricula: "+estudante.getMatricula());
	}
}
