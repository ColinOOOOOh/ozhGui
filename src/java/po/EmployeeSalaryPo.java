/***********************************************************************
 * Module:  EmployeeSalary.java
 * Author:  acer
 * Purpose: Defines the Class EmployeeSalary
 ***********************************************************************/

import java.util.*;

/** @pdOid bc65f17d-98f5-4004-839c-fe622de5976e */
public class EmployeeSalaryPo {
   /** @pdOid e5d6f609-c1aa-4e7c-972e-b40b3159dbe0 */
   public double baseSalary;
   /** @pdOid acd2c3fb-dce2-4810-8762-eedb15847a81 */
   public double transportationAllowance;
   /** @pdOid eae12e2f-ff71-4030-9178-1b0fabb1a9ca */
   public double lunchBenefits;
   /** @pdOid e811c632-e1ef-4469-a462-a41c7fdef493 */
   public double communicationsAllowance;
   /** @pdOid 7d23555c-cd9f-4983-a3f9-6f7e6799aed1 */
   public double oldAgeInsurance;
   /** @pdOid c425ee53-5b30-43bd-9a5f-dfcf43c1196c */
   public double medicalInsurance;
   /** @pdOid 805ca8e7-7e4d-4085-b65b-7a28073d0128 */
   public double unemploymentInsurance;
   /** @pdOid bf67dfb2-6dc1-4771-b984-1240a6ffc70b */
   public double housingAccumulationFund;
   /** @pdOid f81b572e-7419-4c11-b41c-64e53141944c */
   public double totalSalary;
   /** @pdOid 54fba556-492c-4b6a-8ac1-a69fc6b28d62 */
   public double rewards;
   /** @pdOid e6f8a474-a8e6-4cec-8715-565c408c7f2d */
   public double fine;
   /** @pdOid 1807b7a0-94ba-4c72-abbf-30a787e0b0d0 */
   public short isConfirm;
   /** @pdOid 337e0592-41cc-4690-a803-ef2d8284de98 */
   public java.lang.String publishTime;
   /** @pdOid 33c20dbe-6417-482e-b8b0-b5ff9ccd1adb */
   public int employeeSalary;
   
   /** @pdRoleInfo migr=no name=Employee assc=reference10 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<EmployeePo> employee;
   
   
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
         newEmployee.setEmployeeSalary(this);      
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
            oldEmployee.setEmployeeSalary((EmployeeSalaryPo)null);
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
            oldEmployee.setEmployeeSalary((EmployeeSalaryPo)null);
         }
      }
   }

}