/***********************************************************************
 * Module:  Post.java
 * Author:  acer
 * Purpose: Defines the Class Post
 ***********************************************************************/

import java.util.*;

/** @pdOid 19b246a1-3d9a-4221-88c3-4269fec3a6d3 */
public class PostPo {
   /** @pdOid de2dbee9-e0c5-4215-afc6-326a65b28274 */
   public java.lang.String postType;
   /** @pdOid e7e86aa9-b2a4-4303-9f49-aab1e588f2a5 */
   public java.lang.String postName;
   /** @pdOid 4f1d94a5-ceea-4d55-afa6-bd3b9e645e77 */
   public java.lang.String postTitle;
   /** @pdOid 519e07cf-c9dd-47aa-bdb4-d492195b3922 */
   public int postId;
   
   /** @pdRoleInfo migr=no name=Employee assc=reference11 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
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
         newEmployee.setPost(this);      
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
            oldEmployee.setPost((PostPo)null);
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
            oldEmployee.setPost((PostPo)null);
         }
      }
   }

}