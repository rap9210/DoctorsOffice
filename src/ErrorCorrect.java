public class ErrorCorrect {
    public static void main(String[] args) {

        String patientName = "Stacey Manson";
        boolean hasInsurance = false;
        double temp = 102;
        int numVisits = 5;
        double copay = 10.5 * numVisits;
        String next_visit = "May 10, 2020";
        String patient_phone = "402-555-7420";


        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temperature: ");
        System.out.println("Total Copay: $" + copay);
        System.out.println("Next appointment: " + next_visit);
        System.out.println(patientName + "'s phone: " + patient_phone);

    }
}