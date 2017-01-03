
public class RetailItem {
		String description;
		int unitsOnHand;
		double price;
		
		public RetailItem(String Description, int UnitsOnHand, double Price){
			description = Description;
			unitsOnHand = UnitsOnHand;
			price = Price;
		}
		
		public void setDescription(String d){
			description = d;
		}
		public String getDescription(){
			return description;
		}
		public void setUnitsOnHand(int uoh){
			unitsOnHand = uoh;
		}
		public int getUnitsOnHand(){
			return unitsOnHand;
		}
		public void setPrice(double p){
			price = p;
		}
		public double getPrice(){
			return price;
		}
		
		public static void main(String[] args){
			RetailItem jacket = new RetailItem("Jacket", 12,59.95);
			RetailItem jeans = new RetailItem("DesignerJeans",40,34.95);
			RetailItem shirt = new RetailItem("Shirt",20,24.95);
		}
}
