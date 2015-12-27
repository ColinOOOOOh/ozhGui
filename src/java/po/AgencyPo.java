/***********************************************************************
 * Module:  Agency.java
 * Author:  acer
 * Purpose: Defines the Class Agency
 ***********************************************************************/

import java.util.*;

/** @pdOid edf78ad5-1375-4c67-bbbf-ab5eff8659d0 */
public class AgencyPo {
   /** @pdOid cec1b46f-07ae-4bd1-8409-a04458423feb */
   public java.lang.String agencyName;
   /** @pdOid 5489f10f-8ba9-40c2-9263-fab6aec5ea26 */
   public java.lang.String agencyNum;
   /** @pdOid abaafe55-fb25-48b4-8094-26d8326b9ea7 */
   public long agencyId;
   
   /** @pdRoleInfo migr=no name=Employee assc=reference6 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<EmployeePo> employee;
   /** @pdRoleInfo migr=no name=Agency assc=reference12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<AgencyPo> agencyB;
   /** @pdRoleInfo migr=no name=Salary assc=reference13 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<SalaryPo> salary;
   /** @pdRoleInfo migr=no name=Agency assc=reference12 mult=0..1 side=A */
   public AgencyPo agencyA;
   
   
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
         newEmployee.setAgency(this);      
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
            oldEmployee.setAgency((AgencyPo)null);
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
            oldEmployee.setAgency((AgencyPo)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<AgencyPo> getAgencyB() {
      if (agencyB == null)
         agencyB = new java.util.HashSet<AgencyPo>();
      return agencyB;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAgencyB() {
      if (agencyB == null)
         agencyB = new java.util.HashSet<AgencyPo>();
      return agencyB.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAgencyB */
   public void setAgencyB(java.util.Collection<AgencyPo> newAgencyB) {
      removeAllAgencyB();
      for (java.util.Iterator iter = newAgencyB.iterator(); iter.hasNext();)
         addAgencyB((AgencyPo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAgency */
   public void addAgencyB(AgencyPo newAgency) {
      if (newAgency == null)
         return;
      if (this.agencyB == null)
         this.agencyB = new java.util.HashSet<AgencyPo>();
      if (!this.agencyB.contains(newAgency))
      {
         this.agencyB.add(newAgency);
         newAgency.setAgencyA(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldAgency */
   public void removeAgencyB(AgencyPo oldAgency) {
      if (oldAgency == null)
         return;
      if (this.agencyB != null)
         if (this.agencyB.contains(oldAgency))
         {
            this.agencyB.remove(oldAgency);
            oldAgency.setAgencyA((AgencyPo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAgencyB() {
      if (agencyB != null)
      {
         AgencyPo oldAgency;
         for (java.util.Iterator iter = getIteratorAgencyB(); iter.hasNext();)
         {
            oldAgency = (AgencyPo)iter.next();
            iter.remove();
            oldAgency.setAgencyA((AgencyPo)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<SalaryPo> getSalary() {
      if (salary == null)
         salary = new java.util.HashSet<SalaryPo>();
      return salary;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSalary() {
      if (salary == null)
         salary = new java.util.HashSet<SalaryPo>();
      return salary.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSalary */
   public void setSalary(java.util.Collection<SalaryPo> newSalary) {
      removeAllSalary();
      for (java.util.Iterator iter = newSalary.iterator(); iter.hasNext();)
         addSalary((SalaryPo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSalary */
   public void addSalary(SalaryPo newSalary) {
      if (newSalary == null)
         return;
      if (this.salary == null)
         this.salary = new java.util.HashSet<SalaryPo>();
      if (!this.salary.contains(newSalary))
      {
         this.salary.add(newSalary);
         newSalary.setAgency(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldSalary */
   public void removeSalary(SalaryPo oldSalary) {
      if (oldSalary == null)
         return;
      if (this.salary != null)
         if (this.salary.contains(oldSalary))
         {
            this.salary.remove(oldSalary);
            oldSalary.setAgency((AgencyPo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSalary() {
      if (salary != null)
      {
         SalaryPo oldSalary;
         for (java.util.Iterator iter = getIteratorSalary(); iter.hasNext();)
         {
            oldSalary = (SalaryPo)iter.next();
            iter.remove();
            oldSalary.setAgency((AgencyPo)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public AgencyPo getAgencyA() {
      return agencyA;
   }
   
   /** @pdGenerated default parent setter
     * @param newAgency */
   public void setAgencyA(AgencyPo newAgency) {
      if (this.agencyA == null || !this.agencyA.equals(newAgency))
      {
         if (this.agencyA != null)
         {
            AgencyPo oldAgency = this.agencyA;
            this.agencyA = null;
            oldAgency.removeAgencyB(this);
         }
         if (newAgency != null)
         {
            this.agencyA = newAgency;
            this.agencyA.addAgencyB(this);
         }
      }
   }

}