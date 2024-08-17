/*
 * File name: AutoPlicy.java
 *
 * Subject: Modify class AutoPolicy in Fig. 5.11 to validate the state abb.
 *
 * Date: August 17, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 17, 2024 at [03:50 PM]
 *
 * */


public class AutoPolicyTest // class declaration.
{
	public static void main(String[] args)
	{
		// create two AutoPolicy objects
		AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
		AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
		
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}

	// method that displays whether an AutoPolicy
	// is in a state with no-fault auto insurance
	public static void policyInNoFaultState(AutoPolicy policy)
	{
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
				   policy.getAccountNumber(), policy.getMakeAndModel(),
		                   policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
	}
}





