package hw9Q2Abstraction.copy.copy.copy;

public class TestInstitute {
	public static void main(String[] args) {
		ColumbiaUniversity columbia = new ColumbiaUniversity();
		columbia.columbiaInfo();
		columbia.biochemistryLab();
		columbia.anatomyLab();
		columbia.gymnasium();
		columbia.library();
		columbia.vocationalinfo();
		columbia.lawInfo();
		columbia.hygiene();
		columbia.mehcanicalLab();
		columbia.medicalStat();

		System.out.println("\n\n");

		University university = new ColumbiaUniversity();
		university.gymnasium();
		university.vocationalinfo();
		University.library();
		university.gymnasium();
		

		System.out.println("\n\n");

		MedicalSchool medical = new ColumbiaUniversity();
		medical.aeronauticalInfo();
		medical.anatomyLab();
		medical.biochemistryLab();
		medical.computerLab();
		medical.hygiene();
		medical.lawInfo();
		medical.mehcanicalLab();
		medical.vocationalinfo();
		MedicalSchool.medicalStat();
		
		

		
		
		
		
		
		
	}
	

}
