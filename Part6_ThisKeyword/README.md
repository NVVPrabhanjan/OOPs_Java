# Part 6: The `this` Keyword in Java

`this` refers to the current object—the object whose method or constructor is currently executing.

## Major Uses of `this`

`this` can be used to:

1. **Refer to Current Class Variable (Instance Variable)**: Resolves variable shadowing when parameter names are the same as class field names.
   * *Refer [ReferClassVariableDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part6_ThisKeyword/ReferClassVariableDemo.java)*
2. **Call Current Class Method**: Invokes a method on the current object.
   * *Refer [CallClassMethodDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part6_ThisKeyword/CallClassMethodDemo.java)*
3. **Call Current Constructor**: Performs constructor chaining using `this()`.
   * *Refer [CallConstructorDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part6_ThisKeyword/CallConstructorDemo.java)*
4. **Pass/Return Current Object**: Passes the current object as an argument to another method, or returns the current object from a method (e.g. for method chaining).
   * *Refer [PassReturnObjectDemo.java](file:///c:/Coding/JAVA/OOPS/OOPS%20Revision/Part6_ThisKeyword/PassReturnObjectDemo.java)*
