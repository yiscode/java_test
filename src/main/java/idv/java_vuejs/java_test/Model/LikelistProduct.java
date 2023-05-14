package idv.java_vuejs.java_test.Model;
import idv.java_vuejs.java_test.Model.Product;
import idv.java_vuejs.java_test.Model.like_list;

public class LikelistProduct {
	private Product product;
	private like_list LikeList;

    
    public like_list getLikeList() {
        return LikeList;
    }
    
    public void setLikeList(like_list likeList) {
        this.LikeList = likeList;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }

}
