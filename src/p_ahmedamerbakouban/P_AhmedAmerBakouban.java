package p_ahmedamerbakouban;

public class P_AhmedAmerBakouban {

    private String id;
    private String custName;
    private String custType;
    private String custCategory;
    private String subscribes;
    private double totalPayment;

    public P_AhmedAmerBakouban(String id, String custName, String custType, String custCategory, String subscribes) {
        this.id = id;
        this.custName = custName;
        this.custType = custType;
        this.custCategory = custCategory;
        this.subscribes = subscribes;
    }

    public void calculateTraineeType() { //method calculate the type of the trainee

        if (custCategory.equals("Bronze")) {
            if (custType.equals("Membership")) {
                totalPayment = 100 - (0.10 * 100);

            } else if (custType.equals("Government Employee")) {
                totalPayment = 100 - (0.15 * 100);

            } else {
                totalPayment = 100;

            }
        }

        if (custCategory.equals("Silver")) {

            if (custType.equals("Membership")) {
                totalPayment = 200 - (0.10 * 200);

            } else if (custType.equals("Government Employee")) {
                totalPayment = 200 - (0.15 * 200);

            } else {
                totalPayment = 200;

            }
        }
        if (custCategory.equals("Gold")) {

            if (custType.equals("Membership")) {
                totalPayment = 300 - (0.10 * 300);

            } else if (custType.equals("Government Employee")) {
                totalPayment = 300 - (0.15 * 300);

            } else {
                totalPayment = 300;

            }
        }
    }//calculateTraineeType

    public void calculateTraineeSubscribe() { // this method calculate Subscribes based on the month and year 
        calculateTraineeType();
        if (subscribes.equals("Year")) {

            totalPayment = (totalPayment * 12) - (0.15 * totalPayment);

        } else if (subscribes.equals("Six Months")) {

            totalPayment = (totalPayment * 6) - (0.1 * totalPayment);

        } else if (subscribes.equals("Three Months")) {

            totalPayment = (totalPayment * 3) - (0.05 * totalPayment);

        } else {

            totalPayment = totalPayment;

        }
    }//calculateTraineeSubscribe

    public String toString() {
        return "\nID: " + id
                + "\nTrainee Name: " + custName
                + "\nTrainee Type: " + custType
                + "\nTrainee Subscribe: " + custCategory
                + "\nSubscribes: " + subscribes
                + "\nTotal Payment: RM" + getTotalPayment();
    }

    public String toStringForFile() {
        return String.format("\nID: " + id
                + "\nTrainee Name: " + custName
                + "\nTrainee Type: " + custType
                + "\nTrainee Subscribe: " + custCategory
                + "\nSubscribes: " + subscribes
                + "\nTotal Payment: RM" + getTotalPayment() + "\n");

    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public String getId() {
        return id;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustType() {
        return custType;
    }

    public String getCustCategory() {
        return custCategory;
    }

    public String getSubscribes() {
        return subscribes;
    }
}
