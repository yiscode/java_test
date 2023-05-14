package idv.java_vuejs.java_test.Model;
public class Product {
	 private Long NO;
	 private String Productname;
	 private Long Price;
	 private Long Fee_rate;
	 public Long getNO() {
		    return NO;
		}

		public String getProductname() {
		    return Productname;
		}

		public Long getPrice() {
		    return Price;
		}

		public Long getFee_rate() {
		    return Fee_rate;
		}
	 
	 public void setNO(Long NO) {
		 this.NO = NO;
	 }
	 public void setProductname(String Productname) {
		 this.Productname = Productname;
	 }
	 public void setPrice(Long Price) {
		 this.Price = Price;
	 }
	 public void setFee_rate(Long Fee_rate) {
		 this.Fee_rate = Fee_rate;
	 }
}