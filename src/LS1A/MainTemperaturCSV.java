package LS1A;
public class MainTemperaturCSV {

	public static void main(String[] args) {
		/*
		 * Die Datei TemperaturenJJJJ.csv muss im Projektverzeichnis liegen (nicht im
		 * src oder im bin)
		 */

		// Das Objekt, welches die Daten aus der CSV-Datei ausliest
		TemperatureDataRetriever tdr = new TemperatureDataRetriever("src/LS1A/Temperaturen2021.csv");
		
		int sum=0;
		double average=0;
		// Gezaehlte Werte
		int counted=0;

		for(int i =0; i < tdr.getRecords().size(); i++) {
			int temp = tdr.getTemperatureInLine(i);
			// Pruefen ob der Wert sinnvoll ist
			if (temp > -20 && temp < 50) {
				sum = sum + temp;
				counted++;
			}
		}
		average =  sum / (double) counted;
		
		System.out.println("Durchschnitt: "  + average);
	}

}
