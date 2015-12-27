/***********************************************************************
 * Module:  UserRole.java
 * Author:  acer
 * Purpose: Defines the Class UserRole
 ***********************************************************************/

import java.util.*;

/** @pdOid 8909b6f0-331e-47f2-b3c8-e4f0e51152b5 */
public class UserRolePo {
   /** @pdOid 1e7e8409-c923-4ad2-8ad9-96b5f9b5646c */
   public java.lang.String userRole;
   /** @pdOid 2641fba4-9b19-4da7-96b1-86fc9b70c2ec */
   public int userRoleID;
   
   /** @pdRoleInfo migr=no name=User assc=reference8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<UserPo> user;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<UserPo> getUser() {
      if (user == null)
         user = new java.util.HashSet<UserPo>();
      return user;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorUser() {
      if (user == null)
         user = new java.util.HashSet<UserPo>();
      return user.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newUser */
   public void setUser(java.util.Collection<UserPo> newUser) {
      removeAllUser();
      for (java.util.Iterator iter = newUser.iterator(); iter.hasNext();)
         addUser((UserPo)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUser */
   public void addUser(UserPo newUser) {
      if (newUser == null)
         return;
      if (this.user == null)
         this.user = new java.util.HashSet<UserPo>();
      if (!this.user.contains(newUser))
      {
         this.user.add(newUser);
         newUser.setUserRole(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldUser */
   public void removeUser(UserPo oldUser) {
      if (oldUser == null)
         return;
      if (this.user != null)
         if (this.user.contains(oldUser))
         {
            this.user.remove(oldUser);
            oldUser.setUserRole((UserRolePo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllUser() {
      if (user != null)
      {
         UserPo oldUser;
         for (java.util.Iterator iter = getIteratorUser(); iter.hasNext();)
         {
            oldUser = (UserPo)iter.next();
            iter.remove();
            oldUser.setUserRole((UserRolePo)null);
         }
      }
   }

}