import org.junit.* ;

import static org.junit.Assert.* ;

public class SubscriptionTest {

   @Test
   public void test_returnDollar() {
      System.out.println("Test if pricePerMonth returns Dollars...") ;
      Subscription S = new Subscription(200,2) ;     
      assertTrue(S.pricePerMonth() == 100.0) ;
   }

   @Test
   public void test_roundUp() {
      System.out.println("Test if pricePerMonth rounds up correctly...") ;
      Subscription S = new Subscription(200,3) ;     
      assertTrue(S.pricePerMonth() == 66.67) ;
   }
   
   @Test
   public void test_getprice(){
	   System.out.println("test if price is 200");
	   Subscription S=new Subscription(200,3);
	   assertEquals(S.getPrice(),200);
   }
}
