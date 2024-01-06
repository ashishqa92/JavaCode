package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHopital fh = new FortisHopital();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.entServices();
		fh.optServices();
		fh.medialTraining();
		USMedical.billing();
		fh.medInsurance();
		fh.covidTest();
		UNHG.covidGuidelines();
		fh.medicalInfo();

		// top casting:
		// child class object can be referred by parent interface ref variable
		USMedical us = new FortisHopital();
		us.physioServices();
		us.oncologyServices();
		us.cardioServices();
		us.emergencyServices();
		us.medInsurance();

		UKMedical uk = new FortisHopital();
		uk.emergencyServices();
		uk.entServices();
		uk.pediaServices();

		// down casting: CT -- not allowed
		// parent interface object can be referred by childs class ref variable
		// FortisHopital fh1 = new USMedical();

	}

}
