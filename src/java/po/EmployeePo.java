/***********************************************************************
 * Module:  Employee.java
 * Author:  acer
 * Purpose: Defines the Class Employee
 ***********************************************************************/

import java.util.*;

/** @pdOid 230e6387-65f4-4d11-9b79-528abba19fbe */
public class EmployeePo {
   /** @pdOid 70e152a6-ea44-4366-882e-6d4411e5ba77 */
   public java.lang.String employeeName;
   /** @pdOid c0acdd04-06fa-48f0-9130-39736805b2c5 */
   public short employeeSex;
   /** @pdOid c62212d0-b96e-4e1d-8a88-73c5e8152be8 */
   public java.lang.String employeeEmail;
   /** @pdOid a40f7fd7-ce99-4fb2-96cc-49c43ea86f88 */
   public java.lang.String employeeTel;
   /** @pdOid a24d271b-cbbc-4181-ab33-7245ceec7f82 */
   public double employeeQQ;
   /** @pdOid b5d0f12e-527a-4b35-9fa1-75d161baebf0 */
   public double employeeMobile;
   /** @pdOid d61407d3-dfc9-4b05-ae97-96214e5cae3d */
   public java.lang.String employeeHomeAddress;
   /** @pdOid f0b5085a-8b36-4fc8-8ec4-c5e492bdae72 */
   public java.lang.String employeeBirthplace;
   /** @pdOid 29974b41-eddc-4060-b699-022d192c756c */
   public java.lang.String employeeBirthday;
   /** @pdOid 13ed0274-8420-4a84-9af0-0018abf50384 */
   public java.lang.String employeeNational;
   /** @pdOid f06c2f1f-4372-48cc-b250-803cf9fb46a4 */
   public java.lang.String employeeReligion;
   /** @pdOid a5cce8db-0cb6-4de3-a877-e6097346ea36 */
   public java.lang.String employeePolitics;
   /** @pdOid 7d363641-0ed4-4aa6-9929-6fac5afdc8f6 */
   public java.lang.String employeeIDCard;
   /** @pdOid f502753e-a3d8-4318-b094-7970453edce1 */
   public java.lang.String employeeSocialSecurityCard;
   /** @pdOid 22fdddeb-0b5b-4cb3-90bc-169e035eef78 */
   public short employeeAge;
   /** @pdOid e8439819-04b8-4e66-aeb5-bb9b795c5f8f */
   public java.lang.String employeeMajor;
   /** @pdOid 8c553c90-d663-48ac-8e92-ca6507a40744 */
   public java.lang.String employeeQualifications;
   /** @pdOid c3c6915f-3852-4b22-a6ec-c5f584ba13f6 */
   public java.lang.String employeeBank;
   /** @pdOid 39062999-50cd-47b3-a9e8-6d8feeb31901 */
   public java.lang.String employeeBankCard;
   /** @pdOid 07f1d38a-9607-460f-8b97-b1b26e442634 */
   public java.lang.String employeeAdvantage;
   /** @pdOid 5e69e19a-755c-4c7b-83a2-f42fd418d8f2 */
   public java.lang.String employeeHobby;
   /** @pdOid eedce861-4131-4d3c-9da4-18408b66ce24 */
   public java.lang.String employeeCurriculumVitae;
   /** @pdOid 05a8b86d-be83-4239-81ca-11101ed06a17 */
   public java.lang.String employeeFamilyInfo;
   /** @pdOid aa364b4d-f157-4cfc-a6ae-560f6edcdccf */
   public java.lang.String employeeNotes;
   /** @pdOid 3ced6c5b-e4f5-4cd2-90ea-5df8123518b1 */
   public java.lang.String employeeFileCreateTime;
   /** @pdOid b26dc5f4-24fd-43ff-90e7-659a0359148b */
   public java.lang.String emplyeePhoto;
   /** @pdOid 01fe95f9-827f-457a-851e-59de857e9d75 */
   public double fileNumber;
   /** @pdOid e1bf435a-ada8-486a-bc1c-f919db0d7490 */
   public short isConfirm;
   /** @pdOid 3b40c9a1-5602-480a-b4ac-6a507017ef31 */
   public short isDelete;
   
   /** @pdRoleInfo migr=no name=Agency assc=reference6 mult=0..1 side=A */
   public AgencyPo agency;
   /** @pdRoleInfo migr=no name=Post assc=reference11 mult=0..1 side=A */
   public PostPo post;
   /** @pdRoleInfo migr=no name=User assc=reference14 mult=0..1 side=A */
   public UserPo user;
   /** @pdRoleInfo migr=no name=Salary assc=reference9 mult=0..1 side=A */
   public SalaryPo salary;
   /** @pdRoleInfo migr=no name=EmployeeSalary assc=reference10 mult=0..1 side=A */
   public EmployeeSalaryPo employeeSalary;
   
   
   /** @pdGenerated default parent getter */
   public AgencyPo getAgency() {
      return agency;
   }
   
   /** @pdGenerated default parent setter
     * @param newAgency */
   public void setAgency(AgencyPo newAgency) {
      if (this.agency == null || !this.agency.equals(newAgency))
      {
         if (this.agency != null)
         {
            AgencyPo oldAgency = this.agency;
            this.agency = null;
            oldAgency.removeEmployee(this);
         }
         if (newAgency != null)
         {
            this.agency = newAgency;
            this.agency.addEmployee(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public PostPo getPost() {
      return post;
   }
   
   /** @pdGenerated default parent setter
     * @param newPost */
   public void setPost(PostPo newPost) {
      if (this.post == null || !this.post.equals(newPost))
      {
         if (this.post != null)
         {
            PostPo oldPost = this.post;
            this.post = null;
            oldPost.removeEmployee(this);
         }
         if (newPost != null)
         {
            this.post = newPost;
            this.post.addEmployee(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public UserPo getUser() {
      return user;
   }
   
   /** @pdGenerated default parent setter
     * @param newUser */
   public void setUser(UserPo newUser) {
      if (this.user == null || !this.user.equals(newUser))
      {
         if (this.user != null)
         {
            UserPo oldUser = this.user;
            this.user = null;
            oldUser.removeEmployee(this);
         }
         if (newUser != null)
         {
            this.user = newUser;
            this.user.addEmployee(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public SalaryPo getSalary() {
      return salary;
   }
   
   /** @pdGenerated default parent setter
     * @param newSalary */
   public void setSalary(SalaryPo newSalary) {
      if (this.salary == null || !this.salary.equals(newSalary))
      {
         if (this.salary != null)
         {
            SalaryPo oldSalary = this.salary;
            this.salary = null;
            oldSalary.removeEmployee(this);
         }
         if (newSalary != null)
         {
            this.salary = newSalary;
            this.salary.addEmployee(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public EmployeeSalaryPo getEmployeeSalary() {
      return employeeSalary;
   }
   
   /** @pdGenerated default parent setter
     * @param newEmployeeSalary */
   public void setEmployeeSalary(EmployeeSalaryPo newEmployeeSalary) {
      if (this.employeeSalary == null || !this.employeeSalary.equals(newEmployeeSalary))
      {
         if (this.employeeSalary != null)
         {
            EmployeeSalaryPo oldEmployeeSalary = this.employeeSalary;
            this.employeeSalary = null;
            oldEmployeeSalary.removeEmployee(this);
         }
         if (newEmployeeSalary != null)
         {
            this.employeeSalary = newEmployeeSalary;
            this.employeeSalary.addEmployee(this);
         }
      }
   }

}