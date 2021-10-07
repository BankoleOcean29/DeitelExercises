package ChapterFive;

public class AutoPolicyMain {
    public static void main(String[] args) {
        AutoPolicy policyOne = new AutoPolicy(321, "Toyota Camry", "NJ");
        AutoPolicy policyTwo = new AutoPolicy(456, "Ford Fusion", "ME");

        policyInANoFaultState(policyOne);
        policyInANoFaultState(policyTwo);

    }

    public static void policyInANoFaultState(AutoPolicy policy){
        System.out.println("The auto policy");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state %n%n", policy.getAccountNumber(),
                policy.getMakeAndModel(), policy.getState(),
                (policy.isNotAFaultState() ? "is": "is not")
        );

    }
}
