package com.example.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MikeW
 */
public class NoEmployee {
  private String givenName;
  private String surName;
  private int age;
  private NoGender gender;
  private NoRole role;
  private String dept;
  private String eMail;
  private String phone;
  private String address;
  private String city;
  private String state;
  private String code;
  
  public static class Builder{
    
    private String givenName="";
    private String surName="";
    private int age = 0;
    private NoGender gender = NoGender.FEMALE;
    private NoRole role = NoRole.STAFF;
    private String dept = "";
    private String eMail = "";
    private String phone = "";
    private String address = "";
    private String city = "";
    private String state = "";
    private String code = "";
       
    public NoEmployee.Builder givenName(String givenName){
      this.givenName = givenName;
      return this;
    }
    
    public NoEmployee.Builder surName(String surName){
      this.surName = surName;
      return this;
    }
    
    public NoEmployee.Builder age (int val){
      age = val;
      return this;
    }
    
    public NoEmployee.Builder gender(NoGender val){
      gender = val;
      return this;
    }

    public NoEmployee.Builder role(NoRole val){
      role = val;
      return this;
    }
    
    public NoEmployee.Builder dept(String val){
      dept = val;
      return this;
    }
    
    public NoEmployee.Builder email(String val){
      eMail = val;
      return this;
    }
    
    public NoEmployee.Builder phoneNumber(String val){
      phone = val;
      return this;
    }
    
    public NoEmployee.Builder address(String val){
      address = val;
      return this;
    }

    public NoEmployee.Builder city(String val){
      city = val;
      return this;
    }

    public NoEmployee.Builder state(String val){
      state = val;
      return this;
    }

    public NoEmployee.Builder code(String val){
      code = val;
      return this;
    }
    
    public NoEmployee build(){
      return new NoEmployee(this);
    }
  }
    
  private NoEmployee(){
    super();
  }
    
  private NoEmployee(NoEmployee.Builder builder){
    givenName = builder.givenName;
    surName = builder.surName;
    age = builder.age;
    gender = builder.gender;
    role = builder.role;
    dept = builder.dept;
    eMail = builder.eMail;
    phone = builder.phone;
    address = builder.address;
    city = builder.city;
    state = builder.state;
    code = builder.code;
        
  }
  
  public String getGivenName(){
    return givenName;
  }
  
  public String getSurName(){
    return surName;
  }
  
  public int getAge(){
    return age;
  }
  
  public NoGender getGender(){
    return gender;
  }

  public NoRole getRole(){
    return role;
  }

  public String getDept(){
    return dept;
  }
  
  public String getEmail(){
    return eMail;
  }
  
  public String getPhone(){
    return phone;
  }
  
  public String getAddress(){
    return address;
  }
  
  public String getCity(){
      return city;
  }
  
  public String getState(){
      return state;
  }
  
  public String getCode(){
      return code;
  }
 
  
  public void print(){
    System.out.println(
      "\nName: " + givenName + " " + surName + "\n" + 
      "Age: " + age + "\n" +
      "Gender: " + gender + "\n" + 
      "Role: " + role + "\n" +
      "Dept: " + dept + "\n" +
      "eMail: " + eMail + "\n" + 
      "Phone: " + phone + "\n" +
      "Address: " + address + "\n" + 
      "City: " + city + "\n" +
      "State: " + state + "\n" +
      "Code: " + code + "\n"
    );
  } 

  @Override
  public String toString(){
    return "Name: " + givenName + " " + surName + "\n" + "Age: " + age + "  Gender: " + gender + "\n" + "eMail: " + eMail + "\n" + " Role: " + role + " Dept: " + dept;
  } 

  public static List<NoEmployee> createShortList(){
    List<NoEmployee> people = new ArrayList<>();
    
    people.add(new NoEmployee.Builder()
            .givenName("Bob")
            .surName("Baker")
            .age(23)
            .gender(NoGender.MALE)
            .role(NoRole.STAFF)
            .dept("ENG")
            .email("bob.baker@example.com")
            .phoneNumber("201-121-4678")
            .address("44 4th St")
            .city("Smallville")
            .state("KS")
            .code("12333")
            .build() 
      );
    
    people.add(new NoEmployee.Builder()
            .givenName("Jane")
            .surName("Doe")
            .age(25)
            .gender(NoGender.FEMALE)
            .role(NoRole.STAFF)
            .dept("Sales")
            .email("jane.doe@example.com")
            .phoneNumber("202-123-4678")
            .address("33 3rd St")
            .city("Smallville")
            .state("KS")
            .code("12333")
            .build() 
      );
    
    people.add(new NoEmployee.Builder()
            .givenName("John")
            .surName("Doe")
            .age(28)
            .gender(NoGender.MALE)
            .role(NoRole.MANAGER)
            .dept("HR")
            .email("john.doe@example.com")
            .phoneNumber("202-123-4678")
            .address("33 3rd St")
            .city("Smallville")
            .state("KS")
            .code("12333")
            .build()
    );
    
    people.add(new NoEmployee.Builder()
            .givenName("James")
            .surName("Johnson")
            .age(45)
            .gender(NoGender.MALE)
            .role(NoRole.MANAGER)
            .dept("Eng")
            .email("james.johnson@example.com")
            .phoneNumber("333-456-1233")
            .address("201 2nd St")
            .city("New York")
            .state("NY")
            .code("12111")
            .build()
    );

    people.add(new NoEmployee.Builder()
            .givenName("John")
            .surName("Adams")
            .age(52)
            .gender(NoGender.MALE)
            .role(NoRole.MANAGER)
            .dept("Sales")
            .email("john.adams@example.com")
            .phoneNumber("112-111-1111")
            .address("111 1st St")
            .city("Braintree")
            .state("MA")
            .code("11111")
            .build()
    );
    
    people.add(new NoEmployee.Builder()
            .givenName("Joe")
            .surName("Bailey")
            .age(62)
            .gender(NoGender.MALE)
            .role(NoRole.EXECUTIVE)
            .dept("Eng")
            .email("joebob.bailey@example.com")
            .phoneNumber("112-111-1111")
            .address("111 1st St")
            .city("Town")
            .state("CA")
            .code("11111")
            .build()
    );
    
    people.add(new NoEmployee.Builder()
            .givenName("Phil")
            .surName("Smith")
            .age(55)
            .gender(NoGender.MALE)
            .role(NoRole.EXECUTIVE)
            .dept("HR")
            .email("phil.smith@examp;e.com")
            .phoneNumber("222-33-1234")
            .address("22 2nd St")
            .city("New Park")
            .state("CO")
            .code("222333")
            .build()
    );
    
    people.add(new NoEmployee.Builder()
            .givenName("Betty")
            .surName("Jones")
            .age(65)
            .gender(NoGender.FEMALE)
            .role(NoRole.EXECUTIVE)
            .dept("Sales")
            .email("betty.jones@example.com")
            .phoneNumber("211-33-1234")
            .address("22 4th St")
            .city("New Park")
            .state("CO")
            .code("222333")
            .build()
    );
    
    
    return people;
  }
  
}
