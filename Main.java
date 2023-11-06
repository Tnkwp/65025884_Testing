class BillPayment {
    private String bill_type;
    private int bill_lastUnit;
    private int bill_currentUnit;
    private double bill_result;

    public BillPayment(String type, int lastUnit) {
        bill_type = type;
        bill_lastUnit = lastUnit;
    }

    public int getBill_currentUnit() {
        return bill_currentUnit;
    }

    public void setBill_currentUnit(int currentUnit) {
        if (currentUnit > bill_lastUnit) {
            bill_currentUnit = currentUnit;
        } else {
            System.out.println("Please Insert a correct unit");
        }
    }

    public int calculateUnit() {
        return bill_currentUnit - bill_lastUnit;
    }

    public double calculateBill() {
        if (bill_type.equals("Water")) {
            bill_result = calculateUnit() * 5;
        } else if (bill_type.equals("Electric")) {
            bill_result = calculateUnit() * 6;
        }
        return bill_result;
    }

    public void displayBill() {
        System.out.println("My payment bill is: " + bill_type);
        System.out.println("The result is: " + bill_result);
    }
}

public class Main {
    public static void main(String[] args) {
        BillPayment bill = new BillPayment("Electric", 250);

        bill.setBill_currentUnit(450);

        double billResult = bill.calculateBill();
        bill.displayBill();
    }
}