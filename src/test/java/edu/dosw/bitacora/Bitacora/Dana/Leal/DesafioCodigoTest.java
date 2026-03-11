package edu.dosw.bitacora.Bitacora.Dana.Leal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import dosw.CorteDosCode.desafioCodigo.model.Student;
import dosw.CorteDosCode.desafioCodigo.model.Grade;
import dosw.CorteDosCode.desafioCodigo.service.Service;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class DesafioCodigoTest {

	Service service = new Service();

	private List<Student> createStudents() {

		Grade g1 = new Grade("DOSW", 4.5, LocalDate.now(), true);
		Grade g2 = new Grade("TPYC", 3.0, LocalDate.now(), false);
		Grade g3 = new Grade("REDES", 4.0, LocalDate.now(), true);

		Student s1 = new Student("1", "Dana Valeria Leal", "ROSADO", List.of(g1, g2));
		Student s2 = new Student("2", "Alejandro Merizalde", "AZUL", List.of(g3));
		Student s3 = new Student("3", "Fabio Alberto Leal", "ROSADO", List.of(g1, g3));

		return List.of(s1, s2, s3);
	}

	@Test
	void testGetRosadoStudents() {

		List<Student> students = createStudents();
		List<Student> result = service.getRosadoStudents(students);
		equals(2);
	}

	@Test
	void testGetStudentNames() {

		List<Student> students = createStudents();
		List<String> result = service.getStudentNames(students);
		assertTrue(result.contains("Dana Valeria Leal"));
	}

	@Test
	void testGlobalAverage() {

		List<Student> students = createStudents();
		double avg = service.getGlobalAverage(students);
		assertTrue(avg > 0);
	}

	@Test
	void testTopStudents() {

		List<Student> students = createStudents();
		List<Student> result = service.getTop3Students(students);
		assertTrue(result.size() <= 3);
	}

	@Test
	void testStudentsAboveFour() {

		List<Student> students = createStudents();
		List<Student> result = service.getStudentsAboveFour(students);

		assertNotNull(result);
	}
}

