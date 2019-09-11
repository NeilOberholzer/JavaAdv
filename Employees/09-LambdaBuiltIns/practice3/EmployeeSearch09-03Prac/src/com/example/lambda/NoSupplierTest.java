package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author oracle
 */
public class NoSupplierTest {
  
  public static void main(String[] args) {
    
    List<NoEmployee> eList = NoEmployee.createShortList();
    NoEmployee first = eList.get(0);
    
    Supplier<NoEmployee> eSupp =
            () -> new NoEmployee.Builder()
                    .givenName("Jill")
                    .surName("Doe")
                    .age(26)
                    .gender(NoGender.FEMALE)
                    .role(NoRole.STAFF)
                    .dept("Sales")
                    .startDate(LocalDate.of(2012, 7, 14))
                    .salary(45000)
                    .email("jill.doe@example.com")
                    .phoneNumber("202-123-4678")
                    .address("33 3rd St")
                    .city("Smallville")
                    .state("KS")
                    .code("12333")
            .build(); // Write your Supplier lambda here
      
    System.out.println("=== Print employee list before");
    eList.stream().forEach(NoEmployee::printSummary);
    
    eList.add(eSupp.get());// Add new employee here
    
    System.out.println("\n=== Print employee list after");
    eList.stream().forEach(NoEmployee::printSummary);
    
        
  }
}
