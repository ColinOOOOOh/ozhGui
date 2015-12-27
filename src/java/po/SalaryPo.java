/***********************************************************************
 * Module:  Salary.java
 * Author:  acer
 * Purpose: Defines the Class Salary
 ***********************************************************************/

import java.util.*;

/** @pdOid 906c2d30-46d9-4ca2-9b63-a2e94bb39f3f */
public class SalaryPo {
   /** @pdOid a8a33c81-3149-4179-9161-1c8162648f8f */
   public double salaryType;
   /** @pdOid 80bd0699-21f1-43b7-907a-99f05f9a1100 */
   public double isConfirm;
   /** @pdOid e394ba07-5635-494d-bb8e-25fe54914870 */
   public double salaryNum;
   /** @pdOid 98b9a273-f64b-4260-92a3-6806c60e50a8 */
   public java.lang.String salaryEnrollee;
   /** @pdOid 68655a58-6190-43e4-99db-9e6dbecb3a77 */
   public java.lang.String salaryRegistrant;
   /** @pdOid 011bfaba-997b-4505-9e89-0003d4f80698 */
   public java.lang.String salaryRegistTime;
   /** @pdOid 2c8db62e-9df4-4a05-9220-8000356e2898 */
   public java.lang.String confirmNotes;
   /** @pdOid 2ad9d7e4-145d-4656-871c-d2c08ade80eb */
   public double transportationAllowance;
   /** @pdOid d604e92b-7121-4387-bf4d-9d303e2791f3 */
   public double lunchBenefits;
   /** @pdOid da3af2fb-e558-4403-b515-0876ee50ce35 */
   public double communicationsAllowance;
   /** @pdOid 846a93d7-7123-4ff7-8a56-9a5c3d842ef4 */
   public double oldAgeInsurance;
   /** @pdOid a38d8cd5-3597-4491-b3ea-4ecb72012d68 */
   public double medicalInsurance;
   /** @pdOid 3fd2232c-bb9a-4678-b939-8ffa5afcd10c */
   public double unemploymentInsurance;
   /** @pdOid c0f7cd8f-69fb-4264-81e0-4229858016b1 */
   public double housingAccumulationFund;
   /** @pdOid 936be6f6-000a-4f22-9418-40baa0907a16 */
   public double baseSalary;
   
   /** @pdRoleInfo migr=no name=Employee assc=reference9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<EmployeePo> employee;
   /** @pdRoleInfo migr=no name=Agency assc=reference13 mult=0..1 side=A */
   public AgencyPo agency;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<EmployeePo> getEmployee() {
      if (employee == null)
         employee = new java.util.HashSet<EmployeePo>();
      return employee;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorEmployee() {
      if (employee == null)
         employee = new java.util.HashSet<EmployeePo>();
      return employee.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newEmployee */
   public void setEmployee(java.util.Collection<EmployeePo> newEmployee) {
      removeAllEmployee();
      for (java.util.Iterator iter = newEmployee.iterator(); iter.hasNext();)
         addEmployee((EmployeePo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newEmployee */
   public void addEmployee(EmployeePo newEmployee) {
      if (newEmployee == null)
         return;
      if (this.employee == null)
         this.employee = new java.util.HashSet<EmployeePo>();
      if (!this.employee.contains(newEmployee))
      {
         this.employee.add(newEmployee);
         newEmployee.setSalary(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldEmployee */
   public void removeEmployee(EmployeePo oldEmployee) {
      if (oldEmployee == null)
         return;
      if (this.employee != null)
         if (this.employee.contains(oldEmployee))
         {
            this.employee.remove(oldEmployee);
            oldEmployee.setSalary((SalaryPo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllEmployee() {
      if (employee != null)
      {
         EmployeePo oldEmployee;
         for (java.util.Iterator iter = getIteratorEmployee(); iter.hasNext();)
         {
            oldEmployee = (EmployeePo)iter.next();
            iter.remove();
            oldEmployee.setSalary((SalaryPo)null);
         }
      }
   }
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
            oldAgency.removeSalary(this);
         }
         if (newAgency != null)
         {
            this.agency = newAgency;
            this.agency.addSalary(this);
         }
      }
   }

}