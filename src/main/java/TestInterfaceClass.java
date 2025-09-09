   class Dog implements GitMainJavaClass.Animal {
       @Override
       public void testMethod(String name) {
           System.out.println("test method " +name);
       }

       public static void main(String[] args) {
           Dog dogObj = new Dog();
           dogObj.testMethod("Bruno");
           dogObj.testMethod("tomy");
       }
   }

