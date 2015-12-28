/***********************************************************************
 * Module:  User.java
 * Author:  acer
 * Purpose: Defines the Class User
 ***********************************************************************/
package po;
import java.util.*;

/** @pdOid 3f2acd0c-fd34-4856-b08f-735e5eee3f6c */
public class UserPo {
   /** @pdOid adc236a7-4ebc-49e7-8413-59672f9a87dc */
   public double userNum;
   /** @pdOid 9a470f45-fca2-4299-9060-4163e6c22cd5 */
   public java.lang.String postName;
   /** @pdOid 668fa787-e56c-44a6-955d-f698b7ad1d71 */
   public java.lang.String userPassword;
   /** @pdOid ab596fc6-9671-4eae-951c-fa146210b304 */
   public java.lang.String userName;

    public String getUserName() {
        return userName;
    }
   
//   /** @pdRoleInfo migr=no name=Employee assc=reference14 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
//   public java.util.Collection<EmployeePo> employee;
//   /** @pdRoleInfo migr=no name=UserRole assc=reference8 mult=0..1 side=A */
//   public UserRolePo userRole;
//   
//   
//   /** @pdGenerated default getter */
//   public java.util.Collection<EmployeePo> getEmployee() {
//      if (employee == null)
//         employee = new java.util.HashSet<EmployeePo>();
//      return employee;
//   }
//   
//   /** @pdGenerated default iterator getter */
//   public java.util.Iterator getIteratorEmployee() {
//      if (employee == null)
//         employee = new java.util.HashSet<EmployeePo>();
//      return employee.iterator();
//   }
//   
//   /** @pdGenerated default setter
//     * @param newEmployee */
//   public void setEmployee(java.util.Collection<EmployeePo> newEmployee) {
//      removeAllEmployee();
//      for (java.util.Iterator iter = newEmployee.iterator(); iter.hasNext();)
//         addEmployee((EmployeePo)iter.next());
//   }
//   
//   /** @pdGenerated default add
//     * @param newEmployee */
//   public void addEmployee(EmployeePo newEmployee) {
//      if (newEmployee == null)
//         return;
//      if (this.employee == null)
//         this.employee = new java.util.HashSet<EmployeePo>();
//      if (!this.employee.contains(newEmployee))
//      {
//         this.employee.add(newEmployee);
//         newEmployee.setUser(this);      
//      }
//   }
//   
//   /** @pdGenerated default remove
//     * @param oldEmployee */
//   public void removeEmployee(EmployeePo oldEmployee) {
//      if (oldEmployee == null)
//         return;
//      if (this.employee != null)
//         if (this.employee.contains(oldEmployee))
//         {
//            this.employee.remove(oldEmployee);
//            oldEmployee.setUser((UserPo)null);
//         }
//   }
//   
//   /** @pdGenerated default removeAll */
//   public void removeAllEmployee() {
//      if (employee != null)
//      {
//         EmployeePo oldEmployee;
//         for (java.util.Iterator iter = getIteratorEmployee(); iter.hasNext();)
//         {
//            oldEmployee = (EmployeePo)iter.next();
//            iter.remove();
//            oldEmployee.setUser((UserPo)null);
//         }
//      }
//   }
//   /** @pdGenerated default parent getter */
//   public UserRolePo getUserRole() {
//      return userRole;
//   }
//   
//   /** @pdGenerated default parent setter
//     * @param newUserRole */
//   public void setUserRole(UserRolePo newUserRole) {
//      if (this.userRole == null || !this.userRole.equals(newUserRole))
//      {
//         if (this.userRole != null)
//         {
//            UserRolePo oldUserRole = this.userRole;
//            this.userRole = null;
//            oldUserRole.removeUser(this);
//         }
//         if (newUserRole != null)
//         {
//            this.userRole = newUserRole;
//            this.userRole.addUser(this);
//         }
//      }  
}
